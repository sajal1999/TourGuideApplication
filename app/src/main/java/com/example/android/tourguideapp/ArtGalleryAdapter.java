package com.example.android.tourguideapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sajal on 17-03-2018.
 */

public class ArtGalleryAdapter extends ArrayAdapter<ArtGalleryC> {


    public ArtGalleryAdapter(ArtGallery artgallery, ArrayList<ArtGalleryC> artgallery1) {
        super(artgallery,0,artgallery1);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListView = convertView;

        if (ListView == null) {

            ListView = LayoutInflater.from(getContext()).inflate(

                    R.layout.activity_art_gallery, parent, false);
        }
        ArtGalleryC currentWord = getItem(position);
        TextView nameTextView1 = (TextView) ListView.findViewById(R.id.number_list_item);
        nameTextView1.setText(currentWord.getDefaultTranslation());
        ImageView iconView = (ImageView) ListView.findViewById(R.id.image_two);
        iconView.setImageResource(currentWord.getImageResourceId());
        TextView nameTextView2 = (TextView) ListView.findViewById(R.id.detail_list_item);
        nameTextView2.setText(currentWord.getDetails());
        return ListView;
    }

}