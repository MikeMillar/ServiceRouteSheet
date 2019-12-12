package com.mikemillar.routesheet;

import com.mikemillar.routesheet.DataModels.*;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Controller {
    
    private HashMap<Integer, Customer> customerHashMap;
    private HashMap<String, Vehicle> vehicleHashMap;
    private HashMap<Integer, RepairOrder> repairOrderHashMap;
    private HashMap<Integer, Adviser> adviserHashMap;
    private HashMap<Integer, Technician> technicianHashMap;
    
    @FXML private TableView<RepairOrder> activeTable;
    
    public void initialize() {
        // Initializing Hashmaps
        customerHashMap = new HashMap<>();
        vehicleHashMap = new HashMap<>();
        repairOrderHashMap = new HashMap<>();
        adviserHashMap = new HashMap<>();
        technicianHashMap = new HashMap<>();
        // End Hasmap initialization
        
        
        // Initial System setup Data
        // Create Moch Customer and Vehicles for test purposes
        Customer testCust1 = new Customer("Mike Millar");
        Customer testCust2 = new Customer("Cassandra Gutierrez");
        Customer testCust3 = new Customer("Dan Be");
        customerHashMap.put(testCust1.getCustomerNumber(), testCust1);
        customerHashMap.put(testCust2.getCustomerNumber(), testCust2);
        customerHashMap.put(testCust3.getCustomerNumber(), testCust3);
        
        Vehicle testVeh1 = new Vehicle(testCust1.getCustomerNumber(), "12345678901234567",2016, "Honda","HR-V","White",51250,"This is Mike's veh note");
        Vehicle testVeh2 = new Vehicle(testCust2.getCustomerNumber(),"76543210987654321", 2013, "Mazda", "6 Touring", "Blue", 98000, "This is Cassy's veh note");
        Vehicle testVeh3 = new Vehicle(testCust3.getCustomerNumber(),"12345678907654321", 2014, "Buick", "Escalade", "Grey", 48320, "Dan's veh note");
        vehicleHashMap.put(testVeh1.getShortId(), testVeh1);
        vehicleHashMap.put(testVeh2.getShortId(), testVeh2);
        vehicleHashMap.put(testVeh3.getShortId(), testVeh3);
        
        Adviser testAdviser = new Adviser("Adrian Medina");
        adviserHashMap.put(testAdviser.getCustomerNumber(), testAdviser);
        
        Technician testTech = new Technician("Khoa Nguyen", 'A');
        technicianHashMap.put(testTech.getCustomerNumber(), testTech);
        
        RepairOrder testRO1 = new RepairOrder(testVeh1, testCust1, testAdviser, 1234, LocalDateTime.now(), LocalDateTime.MAX, "Test RO1 Notes", true);
        RepairOrder testRO2 = new RepairOrder(testVeh2, testCust2, testAdviser, 4321, LocalDateTime.now(), LocalDateTime.MAX, "Test RO2 Notes", false);
        RepairOrder testRO3 = new RepairOrder(testVeh3, testCust3, testAdviser, 1423, LocalDateTime.now(), LocalDateTime.MAX, "Test RO3 Notes", true);
        repairOrderHashMap.put(testRO1.getRepairOrderNumber(), testRO1);
        repairOrderHashMap.put(testRO2.getRepairOrderNumber(), testRO2);
        repairOrderHashMap.put(testRO3.getRepairOrderNumber(), testRO3);
        
        // Test Purpose add all data to Repair Order Data Class
        RepairOrderData.getInstance().addRepairOrderToList(testRO1);
        RepairOrderData.getInstance().addRepairOrderToList(testRO2);
        RepairOrderData.getInstance().addRepairOrderToList(testRO3);
        // End add to RepairOrderData
        
        
        // End Test Data Initialization
        
        // Value Testing
        System.out.println(customerHashMap.toString());
        System.out.println();
        System.out.println(vehicleHashMap.toString());
        System.out.println();
        System.out.println(repairOrderHashMap.toString());
        // End Value Testing
        
        // Applying data to table
        activeTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        activeTable.setItems(RepairOrderData.getInstance().getActiveROList());
        // End data application to table
        
    }



}
