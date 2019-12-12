package com.mikemillar.routesheet.DataModels;

import java.util.HashMap;

public class AdviserData {
    
    private static AdviserData instance = new AdviserData();
    
    private static final String ADVISER_DATA_FILE = "advisers.xml";
    
    private HashMap<Integer, Adviser> adviserHashMap;
    
    public AdviserData() {
        adviserHashMap = new HashMap<>();
    }
    
    public static AdviserData getInstance() {
        return instance;
    }
    
    public void addAdviser(Adviser adviser) {
        try {
            adviserHashMap.put(adviser.getCustomerNumber(), adviser);
        } catch (NullPointerException e) {
            System.out.println("Unable to add adviser");
            e.printStackTrace();
        }
    }
    
    public void removeAdviser(Adviser adviser) {
        try {
            adviserHashMap.remove(adviser.getCustomerNumber());
        } catch (NullPointerException e) {
            System.out.println("Unable to find / remove adviser");
            e.printStackTrace();
        }
    }
    
    public Adviser getAdviser(int adviserNumber) {
        try {
            return adviserHashMap.get(adviserNumber);
        } catch (NullPointerException e) {
            System.out.println("Unable to find adviser");
            e.printStackTrace();
            return null;
        }
    }
    
    public HashMap<Integer, Adviser> getAdviserHashMap() {
        return adviserHashMap;
    }
    
}
