package com.example.movieapplication.Model;

import java.util.Random;

public class Manager extends AbstractUser {
    private int aManagerID;
    Random rand = new Random();

    public Manager(int pUserID, String pEmail, String pFirstName, String pLastName, int pManagerID) {
        super(pUserID, pEmail, pFirstName, pLastName);
        this.setManagerID(pManagerID);
    }

    public void setManagerID(int pManagerID) {
        if (pManagerID < 0)
            throw new IllegalArgumentException("Age cannot be smaller than 0!");
        this.aManagerID = pManagerID;
    }

    public int getManagerID() {
        return aManagerID;
    }

    public void setUserID() {
        rand.nextInt(9999);
    }

    public void setEmail() {

    }

    public void setFirstName() {

    }

    public void setLastName() {

    }
}
