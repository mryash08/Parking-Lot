package org.example.Model;

import org.example.Enum.FloorStatus;

import java.util.List;

public class Floor {

    private int floorNumber;
    private int capacity;
    private int id;
    private List<ParkingSpots> parkingSpotsList;
    private FloorStatus status;

    public FloorStatus getStatus() {
        return status;
    }

    public  void setStatus(FloorStatus status) {
        this.status = status;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSpots> getParkingSpotsList() {
        return parkingSpotsList;
    }

    public void setParkingSpotsList(List<ParkingSpots> parkingSpotsList) {
        this.parkingSpotsList = parkingSpotsList;
    }
}
