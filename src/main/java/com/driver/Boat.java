package com.driver;

public class Boat implements  WaterVehicle{
    private int VehicleCapacity;
    private String VehicleName;

    public Boat(int vehicleCapacity, String vehicleName) {
        VehicleCapacity = vehicleCapacity;
        VehicleName = vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return VehicleCapacity;
    }

    public void setVehicleCapacity(int vehicleCapacity) {
        VehicleCapacity = vehicleCapacity;
    }

    @Override
    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }

    public Boat() {

    }


}
