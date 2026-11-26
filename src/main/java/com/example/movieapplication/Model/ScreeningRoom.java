package com.example.movieapplication.Model;

public class ScreeningRoom {
    private static int totalScreeningRooms = 0;
    private int aScreeningRoomID;
    private String aScreeningRoomName;
    private int aScreeningRoomCapacity;

    public ScreeningRoom(String pScreeningRoomName, int pScreeningRoomCapacity) {
        this.setScreeningRoomID();
        this.setScreeningRoomName(pScreeningRoomName);
        this.setScreeningRoomCapacity(pScreeningRoomCapacity);
    }

    private void setScreeningRoomID() {
        totalScreeningRooms++;
        this.aScreeningRoomID = totalScreeningRooms;
    }

    private void setScreeningRoomName(String pScreeningRoomName) {
        this.aScreeningRoomName = pScreeningRoomName;
    }

    private void setScreeningRoomCapacity(int pScreeningRoomCapacity) {
        this.aScreeningRoomCapacity = pScreeningRoomCapacity;
    }

    public int getScreeningRoomID() {
        return this.aScreeningRoomID;
    }

    public String getScreeningRoomName() {
        return this.aScreeningRoomName;
    }

    public int getScreeningRoomCapacity() {
        return this.aScreeningRoomCapacity;
    }

    @Override
    public String toString() {
        return "Room ID: " + getScreeningRoomID() + ", Room Name: " + getScreeningRoomName() + ", Room Capacity: " + getScreeningRoomCapacity();
    }

}
