package com.example.android.tourguideapp;

/**
 * Created by sajal on 17-03-2018.
 */

public class ArtGalleryC {
    private String mDefaultTranslation;
    private int mImageResourceId;
    private String mDetails;

    public ArtGalleryC(String defaultTranslation,String Details, int ImageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mDetails=Details;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getDetails()
    {
        return mDetails;
    }

    public int getImageResourceId() {
        return mImageResourceId;

    }
}