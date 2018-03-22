package com.example.android.tourguideapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sajal on 20-03-2018.
 */

public class MovieTheatreAdapter extends ArrayAdapter<MovieTheatreC> {
    public MovieTheatreAdapter(MovieTheatre movieTheatre, ArrayList<MovieTheatreC> movietheatre) {
        super(movieTheatre,0,movietheatre);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListView = convertView;

        if (ListView == null) {

            ListView = LayoutInflater.from(getContext()).inflate(

                    R.layout.activity_movie_theatre, parent, false);
        }
        MovieTheatreC currentWord = getItem(position);
        TextView nameTextView4 = (TextView) ListView.findViewById(R.id.movie_list_item);
        nameTextView4.setText(currentWord.getDefaultTranslation3());
        ImageView iconView = (ImageView) ListView.findViewById(R.id.image_one);
        iconView.setImageResource(currentWord.getImageResourceId3());
        TextView nameTextView8 = (TextView) ListView.findViewById(R.id.detail_list_item_1);
        nameTextView8.setText(currentWord.getDetails3());
        return ListView;
    }
}

