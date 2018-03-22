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
 * Created by sajal on 20-03-2018.
 */

public class GarageAdapter extends ArrayAdapter<GarageC> {

    public GarageAdapter(Garage garage, ArrayList<GarageC> garage1) {
        super(garage,0,garage1);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View ListView = convertView;

        if (ListView == null) {

            ListView = LayoutInflater.from(getContext()).inflate(

                    R.layout.activity_garage, parent, false);
        }
        GarageC currentWord = getItem(position);
        TextView nameTextView5 = (TextView) ListView.findViewById(R.id.garage_list_item);
        nameTextView5.setText(currentWord.getDefaultTranslation1());
        ImageView iconView = (ImageView) ListView.findViewById(R.id.garage_image);
        iconView.setImageResource(currentWord.getImageResourceId1());
        TextView nameTextView6 = (TextView) ListView.findViewById(R.id.garage_list);
        nameTextView6.setText(currentWord.getDetails1());
        return ListView;
    }
}
