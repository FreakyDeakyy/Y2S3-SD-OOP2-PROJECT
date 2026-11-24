package com.example.movieapplication;

public class Manager extends User {
    private int aManagerID;

    public Manager(int pUserID, String pEmail, String pFirstName, String pLastName, int pManagerID) {
        super(pUserID, pEmail, pFirstName, pLastName);
        this.setManagerID(pManagerID);
    }

    public void setManagerID(int pManagerID) {
        if (pManagerID < 0)
            throw new IllegalArgumentException("Age cannot be smaller than 0!");
        this.aManagerID = pManagerID;
    }

    public int getManagerID() { return aManagerID; }

}
