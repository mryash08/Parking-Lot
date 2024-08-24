package org.example;

import org.example.Controller.TicketController;
import org.example.Repositries.GateRepository;
import org.example.Repositries.ParkingLotRepositiory;
import org.example.Repositries.TicketRepository;
import org.example.Repositries.VehicleRepository;
import org.example.Service.TicketService;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepositiory parkingLotRepositiory = new ParkingLotRepositiory();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,parkingLotRepositiory,ticketRepository);
        TicketController ticketController = new TicketController(ticketService);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Vehicle Number");
        }
    }
