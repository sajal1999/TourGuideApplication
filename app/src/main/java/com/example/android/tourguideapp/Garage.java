package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Garage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        ArrayList<GarageC> garage = new ArrayList<GarageC>();

        garage.add(new GarageC("Good Year Garage","514 West 39 Street, Betw. 10 And 11 Avenue, New York, NY 10018, United States",R.drawable.goodyear_garage));
        garage.add(new GarageC("Denny Garage","215-8 42nd Ave, Bayside, NY 11361, USA",R.drawable.denny_garage));
        garage.add(new GarageC("Ludlow Garage","342 Ludlow Ave, Cincinnati, OH 45220, USA",R.drawable.ludlow_garage));
        garage.add(new GarageC("Mahindra Garage","E-24, Okhla Estate Marg, Pocket E, Okhla Phase II, Okhla Industrial Area, New York",R.drawable.mahindra_garage));
        garage.add(new GarageC("Prestige Garage","2015 3rd Ave, New York, NY 10029, USA",R.drawable.prestige_garage));
        garage.add(new GarageC("Wizzardworks Garage","35-40 42nd St, Long Island City, NY 11101, USA",R.drawable.wizzardworks_garage));

        GarageAdapter adapter = new GarageAdapter(this,garage );
        ListView listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.garage, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent PhotoStudioIntent = new Intent(Garage.this, MainActivity.class);

            startActivity(PhotoStudioIntent);
        } else if (id == R.id.nav_art_gallery) {
            Intent numbersIntent = new Intent(Garage.this, ArtGallery.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_movie_theatre) {
            Intent numbersIntent = new Intent(Garage.this, MovieTheatre.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_photo_studio) {
            Intent numbersIntent = new Intent(Garage.this, PhotoStudio.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
