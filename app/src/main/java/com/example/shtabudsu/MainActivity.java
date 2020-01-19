package com.example.shtabudsu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.media.MediaPlayer;
import android.widget.SeekBar;


import com.example.shtabudsu.fragments.FirstFragment;
//import com.example.shtabudsu.fragments.SecondFragment;
import com.example.shtabudsu.fragments.ThirtFragment;
import com.example.shtabudsu.fragments.OtherFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FirstFragment firstFragment;
    //SecondFragment secondFragment;
    ThirtFragment thirtFragment;
    OtherFragment otherFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        firstFragment = new FirstFragment();
        //secondFragment = new SecondFragment();
        thirtFragment = new ThirtFragment();
        otherFragment = new OtherFragment();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentTransaction ftrans = getSupportFragmentManager().beginTransaction();

        switch (id){
            case R.id.nav_camera:
                ftrans.replace(R.id.container,firstFragment);
                break;
            case R.id.nav_gallery:
                //ftrans.replace(R.id.container,secondFragment);
                startActivity(new Intent(this, SecondFragment.class));
                break;
            case R.id.nav_slideshow:
                ftrans.replace(R.id.container,thirtFragment);
                break;
            case R.id.nav_manage:
                ftrans.replace(R.id.container,otherFragment);
                break;
            case R.id.nav_share:
                Intent vkIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vk.com/so_udsu"));
                startActivity(vkIntent);
                break;
            case R.id.nav_send:
                Intent instIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/so_udsu/"));
                startActivity(instIntent);
                break;

        } ftrans.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
