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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtGallery extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_gallery);

        ArrayList<ArtGalleryC> artgallery = new ArrayList<ArtGalleryC>();

        artgallery.add(new ArtGalleryC("Modern Art Gallery","11 W 53rd St, New York, NY 10019, USA",R.drawable.modern_art_gallery));
        artgallery.add(new ArtGalleryC("Whitney Art Gallery","99 Gansevoort St, New York, NY 10014, USA",R.drawable.whitney_art_gallery));
        artgallery.add(new ArtGalleryC("Met Bruer Art Gallery","3 W 51st St, New York, NY 10019, USA",R.drawable.met_bruer_art_gallery));
        artgallery.add(new ArtGalleryC("Metrolpolitan Museum Art Gallery","1000 5th Ave, New York, NY 10028, USA",R.drawable.metropolitan_museum_art_gallery));
        artgallery.add(new ArtGalleryC("Grey Art Gallery","100 Washington Square E, New York, NY 10003, USA",R.drawable.grey_art_gallery));


       ArtGalleryAdapter adapter = new ArtGalleryAdapter(this,artgallery );
        ListView listView = (ListView) findViewById(R.id.list1);
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
        getMenuInflater().inflate(R.menu.art_gallery, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_photo_studio) {
            Intent numbersIntent = new Intent(ArtGallery.this, PhotoStudio.class);

            startActivity(numbersIntent);
        } else if (id == R.id.nav_home) {
            Intent numbersIntent = new Intent(ArtGallery.this, MainActivity.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_movie_theatre) {
            Intent numbersIntent = new Intent(ArtGallery.this, MovieTheatre.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_garage) {
            Intent numbersIntent = new Intent(ArtGallery.this, Garage.class);

            startActivity(numbersIntent);

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
