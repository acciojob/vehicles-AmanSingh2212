package com.driver;

public class Boat implements  WaterVehicle{

    @Override
    public int getVehicleCapacity() {
        return 4;
    }

    @Override
    public String getVehicleName() {
        return "SUV";
    }
}
