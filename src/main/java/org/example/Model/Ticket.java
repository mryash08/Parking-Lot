package org.example.Model;

import org.example.Enum.GateTypes;

import java.util.Date;

public class Ticket {

    private int id;
    private Vehicle vehicle;
    private Date EntryTime;
    private String TicketNumber;
    private Operator GenratedBy;
    private Gates EntryGate;
    private ParkingSpots parkingSpots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public String getTicketNumber() {
        return TicketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        TicketNumber = ticketNumber;
    }

    public Operator getGenratedBy() {
        return GenratedBy;
    }

    public void setGenratedBy(Operator genratedBy) {
        GenratedBy = genratedBy;
    }

    public Gates getEntryGate() {
        return EntryGate;
    }

    public void setEntryGate(Gates entryGate) {
        EntryGate = entryGate;
    }

    public ParkingSpots getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(ParkingSpots parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
