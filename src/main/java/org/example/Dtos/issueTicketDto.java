package org.example.Dtos;

import org.example.Enum.VehicleType;

public class issueTicketDto {

    private VehicleType vehicleType;

    private String VehicleNumber;
    private String VehicleOwnerName;
    private Long getId;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleOwnerName() {
        return VehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        VehicleOwnerName = vehicleOwnerName;
    }

    public Long getGetId() {
        return getId;
    }

    public void setGetId(Long getId) {
        this.getId = getId;
    }
}
