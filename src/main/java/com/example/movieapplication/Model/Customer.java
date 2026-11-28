package com.example.movieapplication.Model;

/**
 * Represents a customer in the movie application
 * 
 * @author Owen Huxter
 */
public class Customer extends AbstractUser {
    /***
     * Constructor of Customer, just used to call a super constructor
     * 
     * @param pEmail the email of the customer
     * 
     * @param pFirstName the first name of the customer
     * 
     * @param pLastName the last name of the customer
     * 
     * @param pPassword the password of the customer
     * 
     */
    public Customer(String pEmail, String pFirstName, String pLastName, String pPassword) {
        super(pEmail, pFirstName, pLastName, pPassword);
    }

}