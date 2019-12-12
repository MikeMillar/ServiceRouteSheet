package com.mikemillar.routesheet.DataModels;

import javafx.collections.ObservableList;

import java.util.HashMap;

public class TechnicianData {
    
    private static TechnicianData instance = new TechnicianData();
    
    private static final String TECH_DATA_FILE = "technicians.xml";
    
    private HashMap<Integer, Technician> technicianHashMap;
    
    public TechnicianData() {
        technicianHashMap = new HashMap<>();
    }
    
    public static TechnicianData getInstance() {
        return instance;
    }
    
    public void addTechnician(Technician tech) {
        try {
            technicianHashMap.put(tech.getCustomerNumber(), tech);
        } catch (NullPointerException e) {
            System.out.println("Unable to add technician");
            e.printStackTrace();
        }
    }
    
    public void removeTechnician(Technician tech) {
        try {
            technicianHashMap.remove(tech.getCustomerNumber());
        } catch (NullPointerException e) {
            System.out.println("Unable to find / remove technician");
            e.printStackTrace();
        }
    }
    
    public Technician getTechnician(int techNumber) {
        try {
            return technicianHashMap.get(techNumber);
        } catch (NullPointerException e) {
            System.out.println("Unable to find technician");
            e.printStackTrace();
            return null;
        }
    }
    
    public HashMap<Integer, Technician> getTechnicianHashMap() {
        return technicianHashMap;
    }
    
}
