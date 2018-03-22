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
 * Created by sajal on 21-03-2018.
 */

public class PhotoStudioAdapter extends ArrayAdapter<PhotoStudioC>{
    public PhotoStudioAdapter(PhotoStudio photoStudio, ArrayList<PhotoStudioC> photoStudio1) {
        super(photoStudio,0,photoStudio1);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListView = convertView;

        if (ListView == null) {

            ListView = LayoutInflater.from(getContext()).inflate(

                    R.layout.activity_photo_studio, parent, false);
        }
        PhotoStudioC currentWord = getItem(position);
        TextView nameTextView9 = (TextView) ListView.findViewById(R.id.photo_studio_list_item);
        nameTextView9.setText(currentWord.getDefaultTranslation5());
        ImageView iconView = (ImageView) ListView.findViewById(R.id.image_four);
        iconView.setImageResource(currentWord.getImageResourceId5());
        TextView nameTextView11 = (TextView) ListView.findViewById(R.id.detail_list_item_2);
        nameTextView11.setText(currentWord.getDetails5());
        return ListView;
    }
}
