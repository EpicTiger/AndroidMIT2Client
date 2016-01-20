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

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
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
    public boolean onCreateOptionsMenu(Menu menu) {
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

}
