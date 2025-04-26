package com.pg.application.data;

import lombok.Data;

@Data
public class RoomSummary {
    private String floor;
    private int totalRooms;
    private int noOfRoomsOccupied;
    private int noOfRoomsEmpty;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getNoOfRoomsOccupied() {
        return noOfRoomsOccupied;
    }

    public void setNoOfRoomsOccupied(int noOfRoomsOccupied) {
        this.noOfRoomsOccupied = noOfRoomsOccupied;
    }

    public int getNoOfRoomsEmpty() {
        return noOfRoomsEmpty;
    }

    public void setNoOfRoomsEmpty(int noOfRoomsEmpty) {
        this.noOfRoomsEmpty = noOfRoomsEmpty;
    }
}
