package com.example.movieapplication.Model;

import java.time.LocalTime;

/**
 * Represents a ticket for a movie screening
 * 
 * @author Owen Huxter
 */
public class Ticket {
    /**
     * The total number of tickets created
     */
    private static int totalTickets = 0;
    /**
     * The unique ID of the ticket
     */
    private int aTicketID;
    /**
     * The ID of the screening associated with this ticket
     */
    private int aScreeningID;
    /**
     * The date and time of the ticket
     */
    private LocalTime aLocalTime;

    /**
     * Constructs a new Ticket instance with the specified screening ID
     *
     * @param pScreeningID the ID of the screening for which the ticket is
     * issued
     */
    public Ticket(int pScreeningID) {
        this.setScreeningID(pScreeningID);
        this.setTime(LocalTime.now());
        this.setTicketID();
    }

    /**
     * Sets the ID for this ticket
     */
    private void setTicketID() {
        totalTickets++;
        this.aTicketID = totalTickets;
    }

    /**
     * Sets the screening ID for this ticket
     * 
     * @param pScreeningID
     */
    private void setScreeningID(int pScreeningID) {
        if (pScreeningID <= 0) {
            throw new IllegalArgumentException("Screening ID must be greater than 0");
        }
        this.aScreeningID = pScreeningID;
    }

    /**
     * Sets the date and time for this ticket
     * 
     * @param pDateTime
     */
    private void setTime(LocalTime pDateTime) {
        if (pDateTime == null) {
            throw new IllegalArgumentException("DateTime cannot be null");
        }
        this.aLocalTime = pDateTime;
    }

    /**
     * Gets the date and time for this ticket
     * 
     * @return LocalTime
     */
    public LocalTime getTime() {
        return this.aLocalTime;
    }

    /**
     * Gets the ticket ID for this ticket
     * 
     * @return int
     */
    public int getTicketID() {
        return this.aTicketID;
    }

    /**
     * Gets the screening ID for this ticket
     * 
     * @return int
     */
    public int getScreeningID() {
        return this.aScreeningID;
    }

}
