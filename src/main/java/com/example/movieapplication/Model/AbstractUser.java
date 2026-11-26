package com.example.movieapplication.Model;

public abstract class AbstractUser implements User {
    private static int totalUsers = 0;
    private int aUserID;
    private String aEmail;
    private String aFirstName;
    private String aLastName;
    private String aPassword;

    public AbstractUser(String pEmail, String pFirstName, String pLastName, String pPassword) {
        this.setUserID();
        this.setEmail(pEmail);
        this.setFirstName(pFirstName);
        this.setLastName(pLastName);
        this.setPassword(pPassword);
    }

    private void setPassword(String pPassword) {
        if (pPassword == null || pPassword.isEmpty())
            throw new IllegalArgumentException("Password cannot be empty.");
        this.aPassword = pPassword;
    }

    public String getPassword() {
        return aPassword;
    }

    private void setUserID() {
        this.aUserID = ++totalUsers;
    }

    private void setEmail(String pEmail) {
        if (pEmail == null || pEmail.isEmpty())
            throw new IllegalArgumentException("Email cannot be empty.");
        this.aEmail = pEmail;
    }

    private void setFirstName(String pFirstName) {
        if (pFirstName == null || pFirstName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aFirstName = pFirstName;
    }

    private void setLastName(String pLastName) {
        if (pLastName == null || pLastName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aLastName = pLastName;
    }

    @Override
    public int getUserID() {
        return aUserID;
    }

    @Override
    public String getEmail() {
        return aEmail;
    }

    @Override
    public String getFirstName() {
        return aFirstName;
    }

    @Override
    public String getLastName() {
        return aLastName;
    }

    @Override
    public String toString() {
        return "User ID: " + aUserID + ", Email: " + aEmail + ", First Name: " + aFirstName + ", Last Name: "
                + aLastName;
    }
}
