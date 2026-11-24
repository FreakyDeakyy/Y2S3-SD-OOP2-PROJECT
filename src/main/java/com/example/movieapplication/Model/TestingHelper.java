package com.example.movieapplication.Model;

import javafx.scene.control.Alert;

public class TestingHelper {
    public static void testMovieCreation() {
        Movie testMovie = new Movie("Test Title", "Test Genre", 120.0f);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(testMovie.toString());
        alert.showAndWait();
    }
}
