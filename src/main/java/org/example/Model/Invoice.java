package org.example.Model;

import java.util.Date;
import java.util.List;

public class Invoice {

    private int id;
    private Ticket ticket;
    private Date ExitTime;
    private Double Amount;
    private List<Payment> paymentList;
    private Gates ExitGate;
    private FeeCalculationStrategy feeCalculationStrategy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitTime() {
        return ExitTime;
    }

    public void setExitTime(Date exitTime) {
        ExitTime = exitTime;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public Gates getExitGate() {
        return ExitGate;
    }

    public void setExitGate(Gates exitGate) {
        ExitGate = exitGate;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }
}
