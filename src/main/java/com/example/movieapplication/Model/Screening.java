package com.example.movieapplication.Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Represents a screening in the movie application
 * 
 * @author Owen Huxter
 */
public class Screening {

    /**
    * The total number of screenings created
     */
    private static int totalScreenings = 0;
    /**
    * The unique ID of the screening
     */
    private int aScreeningID;
    /**
    * The ID of the movie associated with this screening
     */
    private int aMovieID;
    /**
    * The date of the screening
     */
    private LocalDate aDate;
    /**
    * The time of the screening
     */
    private LocalTime aTime;
    /**
    * The price of the screening
     */
    private long aPrice;

    /**
     * Constructs a new Screening instance with the specified movie ID, date,
    * time, and price
     *
     * @param pMovieID the ID of the movie
     * @param pDate the date of the screening
     * @param pTime the time of the screening
     * @param pPrice the price of the screening
     */
    public Screening(int pMovieID, String pDate, String pTime, long pPrice) {

        this.setMovieID(pMovieID);
        this.setDate(pDate);
        this.setTime(pTime);
        this.setPrice(pPrice);
        this.setScreeningID();
    }

    /**
    * Sets the ID for this screening
     */
    private void setScreeningID() {

        this.aScreeningID = ++totalScreenings;
    }

    /**
    * gets the movie ID for this screening
     * 
     * @return int
     */
    public int getScreeningID() {
        return this.aScreeningID;
    }

    /**
    * sets the movie ID for this screening
     * 
     * @param pMovieID
     */
    private void setMovieID(int pMovieID) {
        if (pMovieID <= 0) {
            throw new IllegalArgumentException("Movie ID must be greater than 0");
        }
        this.aMovieID = pMovieID;
    }

    /**
    * gets the movie ID for this screening
     * 
     * @return int
     */
    public int getMovieID() {
        return this.aMovieID;
    }

    /**
    * sets the date for this screening
     * 
     * @param pDate
     */
    private void setDate(String pDate) {
        if (pDate == null || pDate.isBlank()) {
            throw new IllegalArgumentException("Date cannot be null or empty");
        }
        this.aDate = LocalDate.parse(pDate);
    }

    /**
    * gets the date for this screening
     * 
     * @return LocalDate
     */
    public LocalDate getDate() {
        return this.aDate;
    }

    /**
    * sets the time for this screening
     * 
     * @param pTime
     */
    private void setTime(String pTime) {
        if (pTime == null || pTime.isBlank()) {
            throw new IllegalArgumentException("Time cannot be null or empty");
        }
        this.aTime = LocalTime.parse(pTime);
    }

    /**
    * gets the time for this screening
     * 
     * @return LocalTime
     */
    public LocalTime getTime() {
        return this.aTime;
    }

    /**
    * sets the price for this screening
     * 
     * @param pPrice
     */
    private void setPrice(long pPrice) {
        if (pPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.aPrice = pPrice;
    }

    /**
    * gets the price for this screening
     * 
     * @return long
     */
    public long getPrice() {
        return this.aPrice;
    }

    /**
    * gets the total number of screenings created
     * 
     * @return int
     */
    public int getTotalScreenings() {
        return totalScreenings;
    }
}