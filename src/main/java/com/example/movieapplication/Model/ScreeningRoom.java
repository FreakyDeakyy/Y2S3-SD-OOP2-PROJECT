package com.example.movieapplication.Model;

/**
 * Represents a screening room in the movie application
 * 
 * @author Owen Huxter
 */
public class ScreeningRoom {
    /**
     * The total number of screening rooms created
     */
    private static int totalScreeningRooms = 0;
    /**
     * The unique ID of the screening room
     */
    private int aScreeningRoomID;
    /**
     * The name of the screening room
     */
    private String aScreeningRoomName;
    /**
     * The capacity of the screening room
     */
    private int aScreeningRoomCapacity;

    /**
     * Constructs a new ScreeningRoom instance with the specified name and
     * capacity
     *
     * @param pScreeningRoomName the name of the screening room
     * @param pScreeningRoomCapacity the capacity of the screening room
     */
    public ScreeningRoom(String pScreeningRoomName, int pScreeningRoomCapacity) {

        this.setScreeningRoomName(pScreeningRoomName);
        this.setScreeningRoomCapacity(pScreeningRoomCapacity);
        this.setScreeningRoomID();
    }

    /**
     * Sets the ID for this screening room
     */
    private void setScreeningRoomID() {
        this.aScreeningRoomID = ++totalScreeningRooms;
    }

    /**
     * sets the name of the screening room
     * 
     * @param pScreeningRoomName
     */
    private void setScreeningRoomName(String pScreeningRoomName) {
        if (pScreeningRoomName == null || pScreeningRoomName.isBlank()) {
            throw new IllegalArgumentException("Screening room name cannot be null or empty");
        }
        this.aScreeningRoomName = pScreeningRoomName;
    }

    /**
     * sets the capacity of the screening room
     * 
     * @param pScreeningRoomCapacity
     */
    private void setScreeningRoomCapacity(int pScreeningRoomCapacity) {
        if (pScreeningRoomCapacity <= 0) {
            throw new IllegalArgumentException("Screening room capacity must be greater than 0");
        }
        this.aScreeningRoomCapacity = pScreeningRoomCapacity;
    }

    /**
     * gets the ID of the screening room
     * 
     * @return int
     */
    public int getScreeningRoomID() {
        return this.aScreeningRoomID;
    }

    /**
     * gets the name of the screening room
     * 
     * @return String
     */
    public String getScreeningRoomName() {
        return this.aScreeningRoomName;
    }

    /**
     * gets the capacity of the screening room
     * 
     * @return int
     */
    public int getScreeningRoomCapacity() {
        return this.aScreeningRoomCapacity;
    }

    /**
     * Returns a string representation of the ScreeningRoom object, including
     * its ID, name, and capacity
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Room ID: " + getScreeningRoomID() + ", Room Name: " + getScreeningRoomName() + ", Room Capacity: "
                + getScreeningRoomCapacity();
    }

}
