package com.example.movieapplication;

public abstract class User implements UserRequirements{
    private int aUserID;
    private String aEmail;
    private String aFirstName;
    private String aLastName;

    public User(int pUserID, String pEmail, String pFirstName, String pLastName) {
        this.setUserID(pUserID);
        this.setEmail(pEmail);
        this.setFirstName(pFirstName);
        this.setLastName(pLastName);
    }

    public void setUserID(int pUserID) {
        if (pUserID < 0)
            throw new IllegalArgumentException("Age cannot be smaller than 0!");
        this.aUserID = pUserID;
    }

    public void setEmail(String pEmail) {
        if (pEmail == null || pEmail.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aEmail = pEmail;
    }

    public void setFirstName(String pFirstName) {
        if (pFirstName == null || pFirstName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aFirstName = pFirstName;
    }

    public void setLastName(String pLastName) {
        if (pLastName == null || pLastName.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty.");
        this.aLastName = pLastName;
    }

    public int getUserID() { return aUserID; }

    public String getEmail() { return aEmail; }

    public String getFirstName() { return aFirstName; }

    public String getLastName() { return aLastName; }
}
