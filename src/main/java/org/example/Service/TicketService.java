package org.example.Service;

import org.example.Enum.VehicleType;
import org.example.Exceptions.getNotFoundException;
import org.example.Model.Gates;
import org.example.Model.SpotAllotmentStrategy;
import org.example.Model.Ticket;
import org.example.Model.Vehicle;
import org.example.Repositries.GateRepository;
import org.example.Repositries.ParkingLotRepositiory;
import org.example.Repositries.TicketRepository;
import org.example.Repositries.VehicleRepository;
import org.example.Strategy.SpotAssigmentStrategy;
import org.example.Strategy.SpotAssignmentFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
        private GateRepository gateRepository;
        private VehicleRepository vehicleRepository;
        private ParkingLotRepositiory parkingLotRepositiory;
        private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepositiory parkingLotRepositiory, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepositiory = parkingLotRepositiory;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(VehicleType vehicleType, String vehicleNumber, String vehicleOwnerName, Long getId) throws getNotFoundException {
            Ticket ticket = new Ticket();
            ticket.setEntryTime(new Date());

            Optional<Gates> gatesOptional = gateRepository.findGateId(getId);
            if(gatesOptional.isEmpty()){
                throw  new getNotFoundException();
            }
            Gates gate = gatesOptional.get();
            ticket.setEntryGate(gate);
            ticket.setGenratedBy(gate.getOperator());

            Optional<Vehicle> vehicleOptional = vehicleRepository.findbyId(vehicleNumber);
            Vehicle saveVehicle;
            if(vehicleOptional.isEmpty()){
                Vehicle vehicle  = new Vehicle();
                vehicle.setVehicleType(vehicleType);
                vehicle.setOwnerName(vehicleOwnerName);
                vehicle.setVehicleNumber(vehicleNumber);

                saveVehicle = vehicleRepository.saveVehicle(vehicle);
            }else {
                saveVehicle = vehicleOptional.get();
            }
            ticket.setVehicle(saveVehicle);
            SpotAllotmentStrategy spotAllotmentStrategy = parkingLotRepositiory.getparkingLotFromGate(gate).getSpotAllotmentStrategy();

            SpotAssigmentStrategy spotAssigmentStrategy = SpotAssignmentFactory.getSpotForType(spotAllotmentStrategy);
            ticket.setParkingSpots(spotAssigmentStrategy.getspot(vehicleType));

            Ticket savedTicket = ticketRepository.saveTicket(ticket);
            ticket.setTicketNumber("Ticket" + ticket.getId());
            return savedTicket;
        }
}
