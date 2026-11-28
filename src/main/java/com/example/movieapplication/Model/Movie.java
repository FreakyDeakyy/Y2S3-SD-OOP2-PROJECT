package com.example.movieapplication.Model;

/**
 * Represents a movie in the movie application
 * 
 * @author Owen Huxter
 */
public class Movie {

    /**
     * The total number of movies created
     */
    private static int totalMovies = 0;
    /**
     * The unique ID of the movie
     */
    private int aMovieID;
    /**
     * The title of the movie
     */
    private String aTitle;
    /**
     * The genre of the movie
     */
    private String aGenre;
    /**
     * The duration of the movie in minutes
     */
    private float aDuration;

    /**
     * Constructs a new Movie instance with the specified title, genre, and
     * duration
     *
     * @param pTitle the title of the movie
     * @param pGenre the genre of the movie
     * @param pDuration the duration of the movie in minutes
     */
    public Movie(String pTitle, String pGenre, float pDuration) {
        this.setTitle(pTitle);
        this.setGenre(pGenre);
        this.setDuration(pDuration);
        this.setMovieID();
    }

    /**
     * Sets the title of the movie
     * 
     * @param pTitle the title to set
     */
    private void setTitle(String pTitle) {
        if (pTitle == null || pTitle.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.aTitle = pTitle;
    }

    /**
     * Gets the Title of The Movie
     * 
     * @return String
     */
    public String getTitle() {
        return this.aTitle;
    }

    /**
     * Sets the genre of the movie
     * 
     * @param pGenre
     */
    private void setGenre(String pGenre) {
        if (pGenre == null || pGenre.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be null or empty");
        }
        this.aGenre = pGenre;
    }

    /**
     * Gets the Genre of The Movie
     * 
     * @return String
     */
    public String getGenre() {
        return this.aGenre;
    }

    /**
     * Sets the duration of the movie in minutes
     * 
     * @param pDuration
     */
    private void setDuration(float pDuration) {
        if (pDuration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than 0");
        }
        this.aDuration = pDuration;
    }

    /**
     * Gets the Duration of The Movie
     * 
     * @return float
     */
    public float getDuration() {
        return this.aDuration;
    }

    /**
     * Sets the Id for this movie
     */
    private void setMovieID() {

        this.aMovieID = ++totalMovies;
    }

    /**
     * gets the ID for this movie
     * 
     * @return int
     */
    public int getMovieID() {
        return this.aMovieID;
    }

    /**
     * Gets the total number of movies created
     * 
     * @return int
     */
    public int getTotalMovies() {
        return totalMovies;
    }
}
