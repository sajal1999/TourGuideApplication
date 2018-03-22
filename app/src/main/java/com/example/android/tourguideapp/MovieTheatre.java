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

public class MovieTheatre extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_theatre);

        ArrayList<MovieTheatreC> movietheatre = new ArrayList<MovieTheatreC>();

        movietheatre.add(new MovieTheatreC("Inox Cinemas","Laden La Road, 19, Rink Mall, New York, NY 10018, United States",R.drawable.inox_cinemas));
        movietheatre.add(new MovieTheatreC("Big Cinemas","1, Pacific Mall, Dr Burman Road,, Sahibabad, Bayside, NY 11361, USA",R.drawable.big_cinemas));
        movietheatre.add(new MovieTheatreC("Fun Cinemas","The Grand Mall, Mithanpura, OH 45220, USA",R.drawable.fun_cinemas));
        movietheatre.add(new MovieTheatreC("Imax Cinemas","5th Floor, Vega Circle Mall, 2nd Mile, Sevoke Road, New York",R.drawable.imax_cinemas));
        movietheatre.add(new MovieTheatreC("PVR Cinemas","4th floor, A-Block, DLF City Centre Mall, Community Centre, Shalimar Bagh, New York, NY 10028, USA",R.drawable.pvr_cinemas));
        movietheatre.add(new MovieTheatreC("Spice Cinemas","Spice World Mall, I-2, Near Metro Station Noida City Center, Sector 25A, Long Island City, NY 11101, USA",R.drawable.spice_cinemas));

        MovieTheatreAdapter adapter = new MovieTheatreAdapter(this,movietheatre );
        ListView listView = (ListView) findViewById(R.id.list3);
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
        getMenuInflater().inflate(R.menu.movie_theatre, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent PhotoStudioIntent = new Intent(MovieTheatre.this, MainActivity.class);

            startActivity(PhotoStudioIntent);
        } else if (id == R.id.nav_art_gallery) {
            Intent numbersIntent = new Intent(MovieTheatre.this, ArtGallery.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_photo_studio) {
            Intent numbersIntent = new Intent(MovieTheatre.this, PhotoStudio.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_garage) {
            Intent numbersIntent = new Intent(MovieTheatre.this, Garage.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
