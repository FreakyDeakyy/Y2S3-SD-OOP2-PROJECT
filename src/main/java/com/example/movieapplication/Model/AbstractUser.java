package com.example.movieapplication.Model;

/**
 * Represents an abstract user in the movie application.
 * Provides shared fields, validation, and default implementations for user attributes.
 */
public abstract class AbstractUser implements User {

    /** Tracks the total number of instantiated users to generate unique IDs. */
    private static int totalUsers = 0;

    private int aUserID;
    private String aEmail;
    private String aFirstName;
    private String aLastName;
    private String aPassword;

    /**
     * Constructs a new AbstractUser with a unique auto-incremented ID and validated details.
     *
     * @param pEmail     the user's email address
     * @param pFirstName the user's first name
     * @param pLastName  the user's last name
     * @param pPassword  the user's account password
     * @throws IllegalArgumentException if any of the string parameters are null or empty
     */
    public AbstractUser(String pEmail, String pFirstName, String pLastName, String pPassword) {
        this.setUserID();
        this.setEmail(pEmail);
        this.setFirstName(pFirstName);
        this.setLastName(pLastName);
        this.setPassword(pPassword);
    }

    /**
     * Sets the user's password.
     *
     * @param pPassword the password to assign
     * @throws IllegalArgumentException if {@code pPassword} is null or empty
     */
    private void setPassword(String pPassword) {
        if (pPassword == null || pPassword.isEmpty())
            throw new IllegalArgumentException("Password cannot be empty.");
        this.aPassword = pPassword;
    }

    /**
     * Retrieves the user's password.
     *
     * @return the user's password
     */
    public String getPassword() {
        return aPassword;
    }

    /**
     * Assigns a unique user ID by incrementing the total user count.
     */
    private void setUserID() {
        this.aUserID = ++totalUsers;
    }

    /**
     * Sets the user's email address.
     *
     * @param pEmail the email address to assign
     * @throws IllegalArgumentException if {@code pEmail} is null or empty
     */
    private void setEmail(String pEmail) {
        if (pEmail == null || pEmail.isEmpty())
            throw new IllegalArgumentException("Email cannot be empty.");
        this.aEmail = pEmail;
    }

    /**
     * Sets the user's first name.
     *
     * @param pFirstName the first name to assign
     * @throws IllegalArgumentException if {@code pFirstName} is null or empty
     */
    private void setFirstName(String pFirstName) {
        if (pFirstName == null || pFirstName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aFirstName = pFirstName;
    }

    /**
     * Sets the user's last name.
     *
     * @param pLastName the last name to assign
     * @throws IllegalArgumentException if {@code pLastName} is null or empty
     */
    private void setLastName(String pLastName) {
        if (pLastName == null || pLastName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aLastName = pLastName;
    }

    /**
     * Retrieves the unique identifier for this user.
     *
     * @return the user ID
     */
    @Override
    public int getUserID() {
        return aUserID;
    }

    /**
     * Retrieves the user's email address.
     *
     * @return the email address
     */
    @Override
    public String getEmail() {
        return aEmail;
    }

    /**
     * Retrieves the user's first name.
     *
     * @return the first name
     */
    @Override
    public String getFirstName() {
        return aFirstName;
    }

    /**
     * Retrieves the user's last name.
     *
     * @return the last name
     */
    @Override
    public String getLastName() {
        return aLastName;
    }

    /**
     * Returns a string representation of the user
     *
     * @return a formatted string containing the user's ID, email, first name, last name and password
     */
    @Override
    public String toString() {
        return "User ID: " + aUserID + ", Email: " + aEmail + ", First Name: " + aFirstName + ", Last Name: "
                + aLastName + ", Password: " + aPassword;
    }
}
