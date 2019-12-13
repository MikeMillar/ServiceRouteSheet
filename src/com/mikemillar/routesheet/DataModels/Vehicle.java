package com.mikemillar.routesheet.DataModels;

import java.util.ArrayList;

public class Vehicle {
    
    private int ownedByCustNum;
    private String VIN;
    private String year;
    private String make;
    private String model;
    private String color;
    private String lastMileage;
    private String notes;
    private ArrayList<RepairOrder> linkedROs;
    
    public Vehicle(String VIN, String year, String make, String model, String color, String mileage, String notes) {
        this.VIN = VIN.toUpperCase();
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.lastMileage = mileage;
        this.notes = notes;
        this.linkedROs = new ArrayList<RepairOrder>();
    }
    
    public String getShortId() {
        if (this.VIN.length() < 17) {
            return null;
        }
        return this.getVIN().substring(9);
    }
    
    public void setOwnedByCustNum(int ownedByCustNum) {
        this.ownedByCustNum = ownedByCustNum;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setLastMileage(String lastMileage) {
        this.lastMileage = lastMileage;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public int getOwnedByCustNum() {
        return ownedByCustNum;
    }
    
    public String getVIN() {
        return VIN;
    }
    
    public String getYear() {
        return year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getLastMileage() {
        return lastMileage;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public ArrayList<RepairOrder> getLinkedROs() {
        return linkedROs;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" +
                "ownedByCustNum=" + ownedByCustNum +
                ", VIN='" + VIN + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", lastMileage=" + lastMileage +
                ", notes='" + notes + '\'' +
                ", linkedROs=" + linkedROs +
                '}';
    }
}
