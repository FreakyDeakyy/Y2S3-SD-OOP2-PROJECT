package com.example.movieapplication.Model;

public class Movie {
    private static int totalMovies = 1;
    private int aMovieID;
    private String aTitle;
    private String aGenre;
    private float aDuration;

    public Movie(String pTitle, String pGenre, float pDuration) {
        this.setTitle(pTitle);
        this.setGenre(pGenre);
        this.setDuration(pDuration);
        this.setMovieID();
    }

    private void setTitle(String pTitle) {
        this.aTitle = pTitle;
    }

    public String getTitle() {
        return this.aTitle;
    }

    private void setGenre(String pGenre) {
        this.aGenre = pGenre;
    }

    public String getGenre() {
        return this.aGenre;
    }

    private void setDuration(float pDuration) {
        this.aDuration = pDuration;
    }

    public float getDuration() {
        return this.aDuration;
    }

    private void setMovieID() {
        totalMovies++;
        this.aMovieID = totalMovies;
    }

    public int getMovieID() {
        return this.aMovieID;
    }

    public int getTotalMovies() {
        return totalMovies;
    }
}
