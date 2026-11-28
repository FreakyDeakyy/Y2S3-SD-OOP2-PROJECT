package com.example.movieapplication.Model;

/**
 * Defines the contract for a user in the movie application. Classes
 * implementing this interface must provide access to core user identification
 * and profile details.
 */
public interface User {

    /**
     * Retrieves the unique identifier for the user.
     *
     * @return the user's ID
     */
    int getUserID();

    /**
     * Retrieves the email address associated with the user.
     *
     * @return the user's email address
     */
    String getEmail();

    /**
     * Retrieves the user's first name.
     *
     * @return the user's first name
     */
    String getFirstName();

    /**
     * Retrieves the user's last name.
     *
     * @return the user's last name
     */
    String getLastName();

    /**
     * Retrieves the user's account password.
     *
     * @return the user's password
     */
    String getPassword();
}
