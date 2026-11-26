package com.example.movieapplication.Model;

import java.util.Random;

/**
 * Represents a manager user in the movie application.
 * Extends {@link AbstractUser} by adding a unique manager-specific identifier.
 */
public class Manager extends AbstractUser {

    /** The unique identifier assigned specifically to a manager. */
    private int aManagerID;

    /** Random number generator for utility operations. */
    Random rand = new Random();

    /**
     * Constructs a new Manager with the specified personal details and manager ID.
     *
     * @param pEmail     the manager's email address
     * @param pFirstName the manager's first name
     * @param pLastName  the manager's last name
     * @param pPassword  the manager's account password
     * @param pManagerID the manager's specific ID (must be 0 or greater)
     * @throws IllegalArgumentException if any user details are invalid or {@code pManagerID} is negative
     */
    public Manager(String pEmail, String pFirstName, String pLastName, String pPassword, int pManagerID) {
        super(pEmail, pFirstName, pLastName, pPassword);
        this.setManagerID(pManagerID);
    }

    /**
     * Sets the manager's specific ID.
     *
     * @param pManagerID the manager ID to assign
     * @throws IllegalArgumentException if {@code pManagerID} is less than 0
     */
    public void setManagerID(int pManagerID) {
        if (pManagerID < 0)
            throw new IllegalArgumentException("ID cannot be lower than 0!");
        this.aManagerID = pManagerID;
    }

    /**
     * Retrieves the manager's specific ID.
     *
     * @return the manager ID
     */
    public int getManagerID() {
        return aManagerID;
    }

    /**
     * Returns a string representation of the manager, including all user details,
     * the manager ID, and the password.
     *
     * @return a formatted string containing the manager's full details
     */
    @Override
    public String toString() {
        return "User ID: " + getUserID() + ", Email: " + getEmail() + ", First Name: " + getFirstName() + ", Last Name: "
                + getLastName() + ", Manager ID: " + getManagerID() + ", Password: " + getPassword();
    }
}
