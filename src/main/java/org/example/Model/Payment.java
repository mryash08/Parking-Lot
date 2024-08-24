package org.example.Model;

import org.example.Enum.PaymentStatus;

import java.util.Date;

public class Payment {

    private int id;
    private PaymentMode paymentMode;
    private Date PaymentTime;
    private PaymentStatus paymentStatus;
    private Double Amount;
    private String RefNUmber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        PaymentTime = paymentTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public String getRefNUmber() {
        return RefNUmber;
    }

    public void setRefNUmber(String refNUmber) {
        RefNUmber = refNUmber;
    }
}
