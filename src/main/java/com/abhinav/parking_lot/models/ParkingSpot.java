package com.abhinav.parking_lot.models;
import java.util.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParkingSpot extends id {
    private int number;
    private List<VehicleType> vehicleTypeList;
    private ParkingSpotStatus parkingSpotStatus;

}

