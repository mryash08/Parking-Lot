package org.example.Controller;

import org.example.Dtos.IssueTicketResponseDto;
import org.example.Dtos.ResponseStatus;
import org.example.Dtos.issueTicketDto;
import org.example.Enum.VehicleType;
import org.example.Model.Ticket;
import org.example.Service.TicketService;

public class TicketController extends issueTicketDto{

    private TicketService ticketService;



    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(issueTicketDto dto){
         IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();
         Ticket ticket;
         try{
             ticket = ticketService.issueTicket(dto.getVehicleType(),dto.getVehicleNumber(),dto.getVehicleOwnerName(),
                     dto.getGetId());
         }catch (Exception e){
             issueTicketResponseDto.setResponseStatus(ResponseStatus.FAILURE);
             issueTicketResponseDto.setFailureReason(e.getMessage());

             return issueTicketResponseDto;
         }
        issueTicketResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
         issueTicketResponseDto.setTicket(ticket);
           return  issueTicketResponseDto;
    }
}
