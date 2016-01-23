package com.example.rainer.mit2client;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import AsyncClasses.CommentThriftClass;
import AsyncClasses.CreateContentThriftClass;
import AsyncClasses.NavigationDrawerAsyncResponse;
import AsyncClasses.RatingThriftClass;
import AsyncClasses.SearchUserThriftClass;
import AsyncClasses.SubcriberThriftClass;
import AsyncClasses.ViewUserProfileThriftClass;
import Politics247Generated.CommentData;
import Politics247Generated.CommentResult;
import Politics247Generated.CreateContentData;
import Politics247Generated.CreateContentResult;
import Politics247Generated.RateData;
import Politics247Generated.RateResult;
import Politics247Generated.SubscriptionData;
import Politics247Generated.SubscriptionResult;
import Politics247Generated.UserManagementClientService;
import Politics247Generated.UserProfileResult;
import Politics247Generated.UserSearchResult;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, NavigationDrawerAsyncResponse
{
    private Toolbar toolbar;
    public DrawerLayout drawer;
    public ActionBarDrawerToggle mDrawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer_layout);

        if (savedInstanceState == null)
        {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentParentViewGroup, new HomeFragment())
                    .commit();
        }

        initializeToolbar();
        initializeNavigationDrawer(toolbar);
    }

    private void initializeToolbar()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragmentParentViewGroup, new UsersFragment())
                        .commit();
                searchView.setQuery("", false);
                searchView.setIconified(true);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                return false;
            }
        });
        return true;
    }

    protected void initializeNavigationDrawer(Toolbar toolbar)
    {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(mDrawerLayout);
        mDrawerLayout.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.nav_home)
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new HomeFragment())
                    .commit();
        } else if (id == R.id.nav_profile)
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new EditProfileFragment())
                    .addToBackStack(getString(R.string.nav_drawer_fragment_own_profile))
                    .commit();
        } else if (id == R.id.nav_create_new_post)
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new CreateNewPostFragment())
                    .commit();
        } else if (id == R.id.nav_logout)
        {
            logOut();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void executeAddComment(int postId, int userId, String commentText)
    {
        CommentData commentData = new CommentData();
        commentData.setCommentText(commentText);
        commentData.setPostID(postId);
        commentData.setUserID(userId);

        CommentThriftClass commentThriftClass = new CommentThriftClass();
        commentThriftClass.delegate = this;
        commentThriftClass.execute(commentData);
    }

    public void executeAddRating(int postId, int userId, double rating)
    {
        RateData rateData = new RateData();
        rateData.setPostID(postId);
        rateData.setUserID(userId);
        rateData.setRatingValue(rating);

        RatingThriftClass commentThriftClass = new RatingThriftClass();
        commentThriftClass.delegate = this;
        commentThriftClass.execute(rateData);
    }

    public void executeCreateContent(int userId, String title, String text)
    {
        CreateContentData createContentData = new CreateContentData();
        createContentData.setUserID(userId);
        createContentData.setPostTitle(title);
        createContentData.setPostText(text);

        CreateContentThriftClass createContentThriftClass = new CreateContentThriftClass();
        createContentThriftClass.delegate = this;
        createContentThriftClass.execute(createContentData);
    }

    public void executeAddSubscription(int subscriberID, int subscriptionID)
    {
        SubscriptionData subscriptionData = new SubscriptionData();
        subscriptionData.setSubscriberID(subscriberID);
        subscriptionData.setSubscriptionID(subscriptionID);

        SubcriberThriftClass subcriberThriftClass = new SubcriberThriftClass();
        subcriberThriftClass.delegate = this;
        subcriberThriftClass.execute(subscriptionData);
    }

    public void executeViewUserProfile(Integer userId)
    {
        ViewUserProfileThriftClass viewUserProfileThriftClass = new ViewUserProfileThriftClass();
        viewUserProfileThriftClass.delegate = this;
        viewUserProfileThriftClass.execute(userId);
    }

    public void executeSearchUser(String searchQuery)
    {
        SearchUserThriftClass searchUserThriftClass = new SearchUserThriftClass();
        searchUserThriftClass.delegate = this;
        searchUserThriftClass.execute(searchQuery);
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        int count = getFragmentManager().getBackStackEntryCount();

        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        if (count > 0)
        {
            getFragmentManager().popBackStack();
        } else
        {
            super.onBackPressed();
        }
    }

    protected void logOut()
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void commentProcessFinish(CommentResult result)
    {
        if (result != null)
        {
            Util.Util.ShowToastLong(this, "Comment Added");
        } else
        {
            Util.Util.ShowToastLong(this, "Could not add comment.");
        }
    }

    @Override
    public void rateProcessFinish(RateResult result)
    {
        if (result != null)
        {
            Util.Util.ShowToastLong(this, "Rating Added");
        } else
        {
            Util.Util.ShowToastLong(this, "Could not add rating.");
        }
    }

    @Override
    public void createContentProcessFinish(CreateContentResult result)
    {
        if (result != null)
        {
            Util.Util.ShowToastLong(this, "Content Added");
        } else
        {
            Util.Util.ShowToastLong(this, "Could not add content.");
        }
    }

    @Override
    public void subcriberProcessFinish(SubscriptionResult result)
    {
        if (result != null)
        {
            Util.Util.ShowToastLong(this, "Subscription Added");
        } else
        {
            Util.Util.ShowToastLong(this, "Could not add subscription.");
        }
    }

    @Override
    public void searchProcessFinish(UserSearchResult result)
    {
        if (result != null)
        {

        } else
        {
            Util.Util.ShowToastLong(this, "No users found.");
        }
    }

    @Override
    public void viewUserProfileProcessFinish(UserProfileResult result)
    {
        if (result != null)
        {

        } else
        {
            Util.Util.ShowToastLong(this, "No users information found.");
        }
    }
}
