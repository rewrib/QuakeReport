package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mDate;

    public Earthquake(String magnitude, String location, long date){

        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getDate(){
        return mDate;
    }

}
