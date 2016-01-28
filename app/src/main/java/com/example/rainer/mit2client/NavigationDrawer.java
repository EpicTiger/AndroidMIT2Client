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

import java.util.ArrayList;
import java.util.List;

import AsyncClasses.CommentThriftClass;
import AsyncClasses.CreateContentThriftClass;
import AsyncClasses.HomeContentThriftClass;
import AsyncClasses.NavigationDrawerAsyncResponse;
import AsyncClasses.RatingThriftClass;
import AsyncClasses.SearchUserThriftClass;
import AsyncClasses.SubcriberThriftClass;
import AsyncClasses.UpdateUserProfileThriftClass;
import AsyncClasses.ViewUserProfileThriftClass;
import Entities.Article;
import Entities.User;
import Politics247Generated.ArticleResult;
import Politics247Generated.CommentData;
import Politics247Generated.CommentResult;
import Politics247Generated.CreateContentData;
import Politics247Generated.CreateContentResult;
import Politics247Generated.HomeScreenContentResult;
import Politics247Generated.RateData;
import Politics247Generated.RateResult;
import Politics247Generated.SubscriptionData;
import Politics247Generated.SubscriptionResult;
import Politics247Generated.UserProfileResult;
import Politics247Generated.UserProfileUpdateData;
import Politics247Generated.UserProfileUpdateResult;
import Politics247Generated.UserResult;
import Politics247Generated.UserSearchResult;
import Util.AppSettings;

// <Author> Rainer Schmitt </Author>
// <StudentNo> 1235656 </StudentNo>
// <Copyright> Copyright (c) All Right Reserved <Copyright>

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
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new HomeFragment(), String.valueOf(R.string.nav_drawer_fragment_home))
                    .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_home))
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
                AppSettings.SearchQuery = query;
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragmentParentViewGroup, new UsersFragment(), String.valueOf(R.string.nav_drawer_fragment_user_list))
                        .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_user_list))
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
                    .replace(R.id.fragmentParentViewGroup, new HomeFragment(), String.valueOf(R.string.nav_drawer_fragment_home))
                    .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_home))
                    .commit();
        } else if (id == R.id.nav_profile)
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new EditProfileFragment(), String.valueOf(R.string.nav_drawer_fragment_own_profile))
                    .addToBackStack(getString(R.string.nav_drawer_fragment_own_profile))
                    .commit();
        } else if (id == R.id.nav_create_new_post)
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragmentParentViewGroup, new CreateNewPostFragment(), String.valueOf(R.string.nav_drawer_fragment_create_content))
                    .addToBackStack(String.valueOf(R.string.nav_drawer_fragment_create_content))
                    .commit();
        } else if (id == R.id.nav_logout)
        {
            logOut();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void executeAddComment(int postId, String commentText)
    {
        CommentData commentData = new CommentData();
        commentData.setCommentText(commentText);
        commentData.setPostID(postId);
        commentData.setUserID(AppSettings.LoggedInUserId);

        CommentThriftClass commentThriftClass = new CommentThriftClass();
        commentThriftClass.delegate = this;
        commentThriftClass.execute(commentData);
    }

    public void executeHomecontent()
    {
        HomeContentThriftClass homeContentThriftClass = new HomeContentThriftClass();
        homeContentThriftClass.delegate = this;
        homeContentThriftClass.execute(AppSettings.LoggedInUserId);
    }

    public void executeAddRating(int postId, double rating)
    {
        RateData rateData = new RateData();
        rateData.setPostID(postId);
        rateData.setUserID(AppSettings.LoggedInUserId);
        rateData.setRatingValue(rating);

        RatingThriftClass commentThriftClass = new RatingThriftClass();
        commentThriftClass.delegate = this;
        commentThriftClass.execute(rateData);
    }

    public void executeCreateContent(String title, String text)
    {
        CreateContentData createContentData = new CreateContentData();
        createContentData.setUserID(AppSettings.LoggedInUserId);
        createContentData.setPostTitle(title);
        createContentData.setPostText(text);

        CreateContentThriftClass createContentThriftClass = new CreateContentThriftClass();
        createContentThriftClass.delegate = this;
        createContentThriftClass.execute(createContentData);
    }

    public void executeUpdateProfile(User user)
    {
        UserProfileUpdateData userProfileUpdateData = new UserProfileUpdateData();
        userProfileUpdateData.setUserId(AppSettings.LoggedInUserId);
        userProfileUpdateData.setEmail(AppSettings.Email);
        userProfileUpdateData.setPassword(AppSettings.Password);
        userProfileUpdateData.setFirstName(user.getFirstname());
        userProfileUpdateData.setLastNamePrefix(user.getLastnameprefix());
        userProfileUpdateData.setLastName(user.getLastname());
        userProfileUpdateData.setGender(user.getGender());
        userProfileUpdateData.setNationality(user.getNationality());
        userProfileUpdateData.dateOfBirth.setYear(user.getDateOfBirthYear());
        userProfileUpdateData.dateOfBirth.setMonth(user.getDateOfBirthDay());
        userProfileUpdateData.dateOfBirth.setDay(user.getDateOfBirthDay());
        userProfileUpdateData.setPoliticalPreference(user.getPoliticalPreference());
        userProfileUpdateData.setTown(user.getTown());

        UpdateUserProfileThriftClass updateUserProfileThriftClass = new UpdateUserProfileThriftClass();
        updateUserProfileThriftClass.delegate = this;
        updateUserProfileThriftClass.execute(userProfileUpdateData);
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
        AddCommentFragment fragment = (AddCommentFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_add_comment));

        if (fragment != null)
        {
            if (result != null)
            {
                getFragmentManager().popBackStack();

            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void homeContentProcessFinish(HomeScreenContentResult result)
    {
        HomeFragment fragment = (HomeFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_home));

        if (fragment != null)
        {
            if (result != null)
            {
                List<Article> articles = new ArrayList<>();

                for (ArticleResult homeScreenContentResult : result.getArticleList())
                {
                    Article article = fragment.createArticle(homeScreenContentResult.articleID, homeScreenContentResult.articleTitle, homeScreenContentResult.getArticleText(), R.drawable.ic_no_photo, homeScreenContentResult.getArticleViews());
                    articles.add(article);
                }

                fragment.setAndFillListAdapter(articles);
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void rateProcessFinish(RateResult result)
    {
        HomeFragment fragment = (HomeFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_home));

        if (fragment != null)
        {
            if (result != null)
            {
                fragment.showSnackbarShort("You have rated this item.");
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void createContentProcessFinish(CreateContentResult result)
    {
        CreateNewPostFragment fragment = (CreateNewPostFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_create_content));

        if (fragment != null)
        {
            if (result != null)
            {
                fragment.showSnackbarShort("Content Added");
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void subcriberProcessFinish(SubscriptionResult result)
    {
        ProfileFragment fragment = (com.example.rainer.mit2client.ProfileFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_profile));

        if (fragment != null)
        {
            if (result != null)
            {
                fragment.showSnackbarShort("Subscription Added");
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void searchProcessFinish(UserSearchResult result)
    {
        UsersFragment fragment = (UsersFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_user_list));

        if (fragment != null)
        {
            if (result != null)
            {
                List<User> userList = new ArrayList<>();

                if (!result.UserList.isEmpty())
                {
                    for (UserResult userResult : result.UserList)
                    {
                        User user = new User();

                        user.setUserId(userResult.getUserId());

                        if (userResult.getUserFirstName() != null && !userResult.getUserFirstName().isEmpty())
                            user.setFirstname(userResult.getUserFirstName());

                        if (userResult.getUserLastNamePrefix() != null && !userResult.getUserLastNamePrefix().isEmpty())
                            user.setLastnameprefix(userResult.getUserLastNamePrefix());

                        if (userResult.getUserLastName() != null && !userResult.getUserLastName().isEmpty())
                            user.setLastname(userResult.getUserLastName());

                        userList.add(user);
                    }

                    AppSettings.Users = userList;
                    fragment.setAndFillListAdapter(userList);
                } else
                {
                    fragment.showSnackbarLong("No users found");
                }
            } else
            {
                fragment.showSnackbarLong("Could not connect to server");
            }
        }
    }

    @Override
    public void viewUserProfileProcessFinish(UserProfileResult result)
    {
        EditProfileFragment fragment = (EditProfileFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_own_profile));
        ProfileFragment ProfileFragment = (com.example.rainer.mit2client.ProfileFragment) getFragmentManager().findFragmentByTag(String.valueOf(R.string.nav_drawer_fragment_profile));

        if (result != null)
        {
            User user = new User();
            user.setUserId(result.getUserId());
            user.setFirstname(result.firstName);
            user.setLastnameprefix(result.lastNamePrefix);
            user.setLastname(result.lastName);
            user.setDateOfBirthYear(result.dateOfBirth.year);
            user.setDateOfBirthMonth(result.dateOfBirth.month);
            user.setDateOfBirthDay(result.dateOfBirth.day);
            user.setNationality(result.nationality);

            user.setPoliticalPreference(result.politicalPreference);

            if (fragment != null)
            {
                fragment.initializeData(user);
            }
            if (ProfileFragment != null)
            {
                ProfileFragment.initializeData(user);
            }

        } else
        {
            fragment.showSnackbarLong("Could not connect to server");
        }

    }

    @Override
    public void updateUserProfileProcessFinish(UserProfileUpdateResult result)
    {

    }
}
