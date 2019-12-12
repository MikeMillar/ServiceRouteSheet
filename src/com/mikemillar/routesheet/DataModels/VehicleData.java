package com.mikemillar.routesheet.DataModels;

import java.util.HashMap;

public class VehicleData {
    
    private static VehicleData instance = new VehicleData();
    
    private static final String VEHICLE_DATA_FILE = "vehicles.xml";
    
    private HashMap<String, Vehicle> vehicleHashMap;
    
    public VehicleData() {
        vehicleHashMap = new HashMap<>();
    }
    
    public static VehicleData getInstance() {
        return instance;
    }
    
    public void addVehicle(Vehicle vehicle) {
        try {
            vehicleHashMap.put(vehicle.getShortId(), vehicle);
        } catch (NullPointerException e) {
            System.out.println("Unable to add vehicle");
            e.printStackTrace();
        }
    }
    
    public void removeVehicle(Vehicle vehicle) {
        try {
            vehicleHashMap.remove(vehicle.getShortId());
        } catch (NullPointerException e) {
            System.out.println("Unable to find / remove vehicle");
            e.printStackTrace();
        }
    }
    
    public Vehicle getVehicle(String vehicleID) {
        try {
            return vehicleHashMap.get(vehicleID);
        } catch (NullPointerException e) {
            System.out.println("Unable to find vehicle");
            e.printStackTrace();
            return null;
        }
    }
    
    public HashMap<String, Vehicle> getVehicleHashMap() {
        return vehicleHashMap;
    }
}
