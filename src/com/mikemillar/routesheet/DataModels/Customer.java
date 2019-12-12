package com.mikemillar.routesheet.DataModels;

import java.util.ArrayList;

public class Customer {
    
    private static int customers = 0;

    private int customerNumber;
    private String name;
    private Address address;
    private Phone phones;
    private String email;
    private String notes;
    private ArrayList<Vehicle> vehicles;
    
    public Customer() {
        this(null);
    }
    
    public Customer(String name) {
        this.customerNumber = ++customers;
        this.name = name;
        this.address = new Address();
        this.phones = new Phone();
        this.vehicles = new ArrayList<Vehicle>();
    }
    
    public static int getCustomers() {
        return customers;
    }
    
    public static void setCustomers(int customers) {
        Customer.customers = customers;
    }
    
    public int getCustomerNumber() {
        return customerNumber;
    }
    
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Phone getPhones() {
        return phones;
    }
    
    public void setPhones(Phone phones) {
        this.phones = phones;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    
    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", phones=" + phones +
                ", email='" + email + '\'' +
                ", notes='" + notes + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
    
    private class Address {
        
        private String address;
        private String address2;
        private String city;
        private String state;
        private int zipCode;
        
        private Address () {
            this(null, null, null, null, 0);
        }
        
        private Address (String address, String address2, String city, String state, int zip) {
            this.address = address;
            this.address2 = address2;
            this.city = city;
            this.state = state;
            this.zipCode = zip;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getAddress2() {
            return address2;
        }
    
        public void setAddress2(String address2) {
            this.address2 = address2;
        }
    
        public String getCity() {
            return city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public String getState() {
            return state;
        }
    
        public void setState(String state) {
            this.state = state;
        }
    
        public int getZipCode() {
            return zipCode;
        }
    
        public void setZipCode(int zipCode) {
            this.zipCode = zipCode;
        }
    }
    
    private class Phone {
        
        private String home;
        private String work;
        private String cell;
        private String fax;
        private String other;
        
        private Phone() {
            this(null, null, null, null, null);
        }
        
        private Phone(String home, String work, String cell, String fax, String other) {
            this.home = home;
            this.work = work;
            this.cell = cell;
            this.fax = fax;
            this.other = other;
        }
    
        public String getHome() {
            return home;
        }
    
        public void setHome(String home) {
            this.home = home;
        }
    
        public String getWork() {
            return work;
        }
    
        public void setWork(String work) {
            this.work = work;
        }
    
        public String getCell() {
            return cell;
        }
    
        public void setCell(String cell) {
            this.cell = cell;
        }
    
        public String getFax() {
            return fax;
        }
    
        public void setFax(String fax) {
            this.fax = fax;
        }
    
        public String getOther() {
            return other;
        }
    
        public void setOther(String other) {
            this.other = other;
        }
    }
}
