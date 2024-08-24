package org.example.Model;

import java.util.List;
import org.example.Enum.ParkingLotStatus;

public class ParkingLot extends BaseModel {
     private List<Floor> floors;
     private List<Gates> gates;
     private FeeCalculationStrategy feeCalculationStrategy;
     private SpotAllotmentStrategy spotAllotmentStrategy;
     private ParkingLotStatus parkingLotStatus;
     private String Adress;
     private int ParkingLotid;

     public List<Floor> getFloors() {
          return floors;
     }

     public void setFloors(List<Floor> floors) {
          this.floors = floors;
     }

     public List<Gates> getGates() {
          return gates;
     }

     public void setGates(List<Gates> gates) {
          this.gates = gates;
     }

     public FeeCalculationStrategy getFeeCalculationStrategy() {
          return feeCalculationStrategy;
     }

     public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
          this.feeCalculationStrategy = feeCalculationStrategy;
     }

     public SpotAllotmentStrategy getSpotAllotmentStrategy() {
          return spotAllotmentStrategy;
     }

     public void setSpotAllotmentStrategy(SpotAllotmentStrategy spotAllotmentStrategy) {
          this.spotAllotmentStrategy = spotAllotmentStrategy;
     }

     public ParkingLotStatus getParkingLotStatus() {
          return parkingLotStatus;
     }

     public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
          this.parkingLotStatus = parkingLotStatus;
     }

     public String getAdress() {
          return Adress;
     }

     public void setAdress(String adress) {
          Adress = adress;
     }

     public int getParkingLotid() {
          return ParkingLotid;
     }

     public void setParkingLotid(int parkingLotid) {
          ParkingLotid = parkingLotid;
     }
}
