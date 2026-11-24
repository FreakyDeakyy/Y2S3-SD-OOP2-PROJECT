package com.example.movieapplication.Model;

public class Customer extends AbstractUser {
    public Customer(int pUserID, String pEmail, String pFirstName, String pLastName) {
        super(pUserID, pEmail, pFirstName, pLastName);
    }

    @Override
    public void setFirstName() {

    }

    @Override
    public void setLastName() {

    }

    @Override
    public void setEmail() {
    }

    @Override
    public void setUserID() {

    }

    @Override
    public int getUserID() {
        return 0;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }
}