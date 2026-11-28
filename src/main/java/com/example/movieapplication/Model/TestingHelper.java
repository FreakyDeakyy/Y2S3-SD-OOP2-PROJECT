package com.example.movieapplication.Model;

import javafx.scene.control.Alert;

/**
 * A helper class for testing the creation of various objects in the movie
 * application. This class provides static methods to create and display
 * information about movies, screenings, tickets, screening rooms, users, and
 * managers.
 * 
 * @author Owen Huxter
 */
public class TestingHelper {
    /**
     * Tests the creation of a Movie object and displays its information in an
     * alert dialog.
     */
    public static void testMovieCreation() {
        Movie testMovie = new Movie("Test Title", "Test Genre", 120.0f);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("movie: " + testMovie.toString());
        alert.showAndWait();
    }

    /**
     * Tests the creation of a Screening object and displays its information in
     * an alert dialog.
     */
    public static void testScreeningCreation() {
        Screening testScreening = new Screening(1, "2024-06-01", "18:00", 15);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("screening: " + testScreening.toString());
        alert.showAndWait();
    }

    /**
     * Tests the creation of a Ticket object and displays its information in an
     * alert dialog.
     */
    public static void testTicketCreation() {
        Ticket testTicket = new Ticket(1);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ticket: " + testTicket.toString());
        alert.showAndWait();
    }

    /**
     * Tests the creation of a ScreeningRoom object and displays its information
     * in an alert dialog.
     */

    public static void testScreeningRoom() {
        ScreeningRoom testScreeningRoom = new ScreeningRoom("1", 100);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("screening room: " + testScreeningRoom.toString());
        alert.showAndWait();
    }

    /**
     * Tests the creation of a Customer object and displays its information in
     * an alert dialog.
     */
    public static void testUserCreation() {
        AbstractUser testCustomer = new Customer("test@example.com", "John", "Doe", "password");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("user: " + testCustomer.toString());
        alert.showAndWait();
    }

    /**
     * Tests the creation of a Manager object and displays its information in an
     * alert dialog.
     */

    public static void testManagerCreation() {
        AbstractUser testManager = new Manager("test@example.com", "John", "Doe", "password", 1234);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("manager: " + testManager.toString());
        alert.showAndWait();
    }

    /**
     * Runs all test methods to create and display information about movies,
     * screenings, tickets, screening rooms, users, and managers.
     */
    public static void testAll() {
        testMovieCreation();
        testScreeningCreation();
        testTicketCreation();
        testScreeningRoom();
        testUserCreation();
        testManagerCreation();
    }
}
