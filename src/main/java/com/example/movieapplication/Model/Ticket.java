package com.example.movieapplication.Model;

import java.time.LocalTime;

public class Ticket {
    private static int totalTickets = 0;
    private int aTicketID;
    private int aScreeningID;
    private LocalTime aLocalTime;

    public Ticket(int pScreeningID) {
        this.setTicketID();
        this.setScreeningID(pScreeningID);
        this.setDateTime(LocalTime.now());
    }

    private void setTicketID() {
        totalTickets++;
        this.aTicketID = totalTickets;
    }

    private void setScreeningID(int pScreeningID) {
        this.aScreeningID = pScreeningID;
    }

    private void setDateTime(LocalTime pDateTime) {
        this.aLocalTime = pDateTime;
    }

    public LocalTime getDateTime() {
        return this.aLocalTime;
    }

    public int getTicketID() {
        return this.aTicketID;
    }

    public int getScreeningID() {
        return this.aScreeningID;
    }

}
