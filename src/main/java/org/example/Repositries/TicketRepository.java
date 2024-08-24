package org.example.Repositries;

import org.example.Model.Ticket;

public class TicketRepository {

    private int id  = 0;
    public Ticket saveTicket(Ticket ticket){
         id += 1;
         ticket.setId(id);

        return null;
    }
}
