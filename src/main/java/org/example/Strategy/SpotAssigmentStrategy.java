package org.example.Strategy;

import org.example.Enum.VehicleType;
import org.example.Model.Gates;
import org.example.Model.ParkingLot;
import org.example.Model.ParkingSpots;

public interface SpotAssigmentStrategy {

    public ParkingSpots getspot(VehicleType vehicleType);
}
