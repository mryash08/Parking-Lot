package org.example.Model;

import org.example.Enum.GateStatus;
import org.example.Enum.GateTypes;

public class Gates {

    private int id;
    private int gateNo;
    private Operator operator;
    private GateStatus gateStatus;
    private GateTypes gateTypes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateTypes getGateTypes() {
        return gateTypes;
    }

    public void setGateTypes(GateTypes gateTypes) {
        this.gateTypes = gateTypes;
    }
}
