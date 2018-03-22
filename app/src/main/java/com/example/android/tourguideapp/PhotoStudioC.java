package com.example.android.tourguideapp;

/**
 * Created by sajal on 21-03-2018.
 */

public class PhotoStudioC {
    private String mDefaultTranslation5;
    private int mImageResourceId5;
    private String mDetails5;

    public PhotoStudioC(String defaultTranslation5,String Details5, int ImageResourceId5) {
        mDefaultTranslation5 = defaultTranslation5;
        mImageResourceId5 = ImageResourceId5;
        mDetails5 = Details5;
    }

    public String getDefaultTranslation5() {
        return mDefaultTranslation5;
    }
    public String getDetails5()
    {
        return mDetails5;
    }

    public int getImageResourceId5() {
        return mImageResourceId5;

    }
}
