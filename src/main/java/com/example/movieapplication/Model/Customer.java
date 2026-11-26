package com.example.movieapplication.Model;

public class Customer extends AbstractUser {
    public Customer(String pEmail, String pFirstName, String pLastName, String pPassword) {
        super(pEmail, pFirstName, pLastName, pPassword);
    }

}