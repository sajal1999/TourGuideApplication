package com.example.android.tourguideapp;

/**
 * Created by sajal on 20-03-2018.
 */

public class GarageC {
    private String mDefaultTranslation1;
    private int mImageResourceId1;
    private String mDetails1;

    public GarageC(String defaultTranslation1,String Details1, int ImageResourceId1) {
        mDefaultTranslation1 = defaultTranslation1;
        mImageResourceId1 = ImageResourceId1;
        mDetails1 =Details1;
    }

    public String getDefaultTranslation1() {
        return mDefaultTranslation1;
    }
    public String getDetails1()
    {
        return mDetails1;
    }

    public int getImageResourceId1() {
        return mImageResourceId1;

    }

}
