package com.mikemillar.routesheet.DataModels;

import java.util.HashMap;

public class CustomerData {
    
    private static CustomerData instance = new CustomerData();
    
    private static final String CUSTOMER_DATA_FILE = "customers.xml";
    
    private HashMap<Integer, Customer> customerHashMap;
    
    public CustomerData() {
        customerHashMap = new HashMap<>();
    }
    
    public static CustomerData getInstance() {
        return instance;
    }
    
    public void addCustomer(Customer cust) {
        try {
            customerHashMap.put(cust.getCustomerNumber(), cust);
        } catch (NullPointerException e) {
            System.out.println("Unable to add customer");
            e.printStackTrace();
        }
    }
    
    public void removeCustomer(Customer cust) {
        try {
            customerHashMap.remove(cust.getCustomerNumber());
        } catch (NullPointerException e) {
            System.out.println("Unable to find / remove customer");
            e.printStackTrace();
        }
    }
    
    public Customer getCustomer(int custNumber) {
        try {
            return customerHashMap.get(custNumber);
        } catch (NullPointerException e) {
            System.out.println("Unable to find customer");
            e.printStackTrace();
            return null;
        }
    }
    
    public HashMap<Integer, Customer> getCustomerHashMap() {
        return customerHashMap;
    }
    
}
