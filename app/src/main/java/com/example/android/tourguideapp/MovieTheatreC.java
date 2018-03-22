package com.example.android.tourguideapp;

/**
 * Created by sajal on 20-03-2018.
 */

public class MovieTheatreC {
    private String mDefaultTranslation3;
    private int mImageResourceId3;
    private String mDetails3;

    public MovieTheatreC(String defaultTranslation3,String Details3, int ImageResourceId3) {
        mDefaultTranslation3 = defaultTranslation3;
        mImageResourceId3 = ImageResourceId3;
        mDetails3 = Details3;
    }

    public String getDefaultTranslation3() {
        return mDefaultTranslation3;
    }
    public String getDetails3()
    {
        return mDetails3;
    }

    public int getImageResourceId3() {
        return mImageResourceId3;

    }
}
