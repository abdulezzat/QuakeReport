package com.example.android.quakereport;
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mURL;

    public Earthquake(double Magnitude,String Location,long TimeInMilliseconds,String URL){
        mMagnitude=Magnitude;
        mLocation=Location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mURL=URL;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getURL(){
        return mURL;
    }
}
