package com.abhinav.parking_lot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class ParkingFloor extends id {
    private int number;
    private List<ParkingSpot> parkingSpots;

}
