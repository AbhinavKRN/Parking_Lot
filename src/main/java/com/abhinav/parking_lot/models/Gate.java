package com.abhinav.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Gate extends id{
    private int number;
    private GateType gateType;
    private GateStatus gateStatus;
    private Operator operator;

}
