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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView photo_studio = (TextView) findViewById(R.id.photo_studio);
        photo_studio.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, PhotoStudio.class);

                startActivity(numbersIntent);

            }

        });

        TextView movie_theater= (TextView) findViewById(R.id.movie_theater);
        movie_theater.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, MovieTheatre.class);

                startActivity(numbersIntent);

            }

        });

        TextView garage = (TextView) findViewById(R.id.garage);
        garage.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, Garage.class);

                startActivity(numbersIntent);

            }

        });
        TextView art_gallery = (TextView) findViewById(R.id.art_gallery);
        art_gallery.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(MainActivity.this, ArtGallery.class);

                startActivity(numbersIntent);

            }

        });





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
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_photo_studio) {
            Intent PhotoStudioIntent = new Intent(MainActivity.this, PhotoStudio.class);

            startActivity(PhotoStudioIntent);
        } else if (id == R.id.nav_art_gallery) {
            Intent numbersIntent = new Intent(MainActivity.this, ArtGallery.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_movie_theatre) {
            Intent numbersIntent = new Intent(MainActivity.this, MovieTheatre.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_garage) {
            Intent numbersIntent = new Intent(MainActivity.this, Garage.class);

            startActivity(numbersIntent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
