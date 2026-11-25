package com.example.movieapplication.Model;

public class Screening {
    private static int totalScreenings = 0;
    private int aScreeningID;
    private int aMovieID;
    private String aDate;
    private String aTime;
    private long aPrice;

    public Screening(int pMovieID, String pDate, String pTime, long pPrice) {
        this.setScreeningID();
        this.setMovieID(pMovieID);
        this.setDate(pDate);
        this.setTime(pTime);
        this.setPrice(pPrice);
    }

    private void setScreeningID() {
        totalScreenings++;
        this.aScreeningID = totalScreenings;
    }

    public int getScreeningID() {
        return this.aScreeningID;
    }

    private void setMovieID(int pMovieID) {
        this.aMovieID = pMovieID;
    }

    public int getMovieID() {
        return this.aMovieID;
    }

    private void setDate(String pDate) {
        this.aDate = pDate;
    }

    public String getDate() {
        return this.aDate;
    }

    private void setTime(String pTime) {
        this.aTime = pTime;
    }

    public String getTime() {
        return this.aTime;
    }

    private void setPrice(long pPrice) {
        this.aPrice = pPrice;
    }

    public long getPrice() {
        return this.aPrice;
    }

    public int getTotalScreenings() {
        return totalScreenings;
    }
}