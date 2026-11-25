package com.example.movieapplication.Model;

import javafx.scene.control.Alert;

public class TestingHelper {
    public static void testMovieCreation() {
        Movie testMovie = new Movie("Test Title", "Test Genre", 120.0f);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("movie: " + testMovie.toString());
        alert.showAndWait();
    }

    public static void testScreeningCreation() {
        Screening testScreening = new Screening(1, "2024-06-01", "18:00", 15);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("screening: " + testScreening.toString());
        alert.showAndWait();
    }

    public static void testTicketCreation() {
        Ticket testTicket = new Ticket(1);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ticket: " + testTicket.toString());
        alert.showAndWait();
    }

    public static void testScreeningRoom() {
        ScreeningRoom testScreeningRoom = new ScreeningRoom("1", 100);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("screening room: " + testScreeningRoom.toString());
        alert.showAndWait();
    }

    public static void testAll() {
        testMovieCreation();
        testScreeningCreation();
        testTicketCreation();
        testScreeningRoom();
    }
}
