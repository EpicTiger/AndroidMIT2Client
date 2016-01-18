package com.example.rainer.mit2client;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
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

        // Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction()))
        {
            String query = intent.getStringExtra(SearchManager.QUERY);
        }

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
