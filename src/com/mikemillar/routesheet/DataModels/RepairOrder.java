package com.mikemillar.routesheet.DataModels;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RepairOrder {
    
    private static int repairOrders = 0;
    
    private Vehicle vehicle;
    private Customer customer;
    private Adviser adviser;
    private Technician tech;
    private int repairOrderNumber;
    private int tagNumber;
    private LocalDateTime timeCreated;
    private LocalDateTime timeClosed;
    private LocalDateTime timeDue;
    private LocalDateTime elapsedTime;
    private VehicleStatus currentStatus;
    private String notes;
    private boolean isWaiter;
    private boolean isLocked;
    private boolean isPartsInactive;
    private boolean isInactive;
    private ArrayList<Jobs> repairJobs;
    private int currentJobs = 0;
    
    public RepairOrder(Vehicle vehicle, Customer customer, Adviser adviser, int tagNumber, LocalDateTime timeCreated, LocalDateTime timeDue, String notes, ArrayList<Jobs> repairJobs, Boolean waiter) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.adviser = adviser;
        this.repairOrderNumber = ++repairOrders;
        this.tagNumber = tagNumber;
        this.timeCreated = timeCreated;
        this.timeDue = timeDue;
        this.notes = notes;
        this.repairJobs = new ArrayList<Jobs>();
        this.isWaiter = waiter;
    }
    
    
    
    public boolean isWaiter() {
        return isWaiter;
    }
    
    public void setWaiter(boolean waiter) {
        isWaiter = waiter;
    }
    
    public int getRepairOrderNumber() {
        return repairOrderNumber;
    }
    
    public void setAdviser(Adviser adviser) {
        this.adviser = adviser;
    }
    
    public void setTech(Technician tech) {
        this.tech = tech;
    }
    
    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
    }
    
    public void setTimeDue(LocalDateTime timeDue) {
        this.timeDue = timeDue;
    }
    
    public void setCurrentStatus(VehicleStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    
    public void setPartsInactive(boolean partsInactive) {
        isPartsInactive = partsInactive;
    }
    
    public void setInactive(boolean inactive) {
        isInactive = inactive;
    }
    
    public void setRepairJobs(ArrayList<Jobs> repairJobs) {
        this.repairJobs = repairJobs;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public Adviser getAdviser() {
        return adviser;
    }
    
    public Technician getTech() {
        return tech;
    }
    
    public int getTagNumber() {
        return tagNumber;
    }
    
    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }
    
    public LocalDateTime getTimeClosed() {
        return timeClosed;
    }
    
    public LocalDateTime getTimeDue() {
        return timeDue;
    }
    
    public LocalDateTime getElapsedTime() {
        return elapsedTime;
    }
    
    public VehicleStatus getCurrentStatus() {
        return currentStatus;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public boolean isLocked() {
        return isLocked;
    }
    
    public boolean isPartsInactive() {
        return isPartsInactive;
    }
    
    public boolean isInactive() {
        return isInactive;
    }
    
    public ArrayList<Jobs> getRepairJobs() {
        return repairJobs;
    }
    
    private class Jobs {
        
        private int jobNumber;
        private String jobCode;
        private String jobDescription;
        private String payType;
        private Technician assignedTech;
        
        private Jobs (String jobCode, String jobDescription, String payType) {
            this.jobNumber = ++currentJobs;
            this.jobCode = jobCode;
            this.jobDescription = jobDescription;
            this.payType = payType;
            this.assignedTech = tech;
        }
    
        public int getJobNumber() {
            return jobNumber;
        }
    
        public void setJobNumber(int jobNumber) {
            this.jobNumber = jobNumber;
        }
    
        public String getJobCode() {
            return jobCode;
        }
    
        public void setJobCode(String jobCode) {
            this.jobCode = jobCode;
        }
    
        public String getJobDescription() {
            return jobDescription;
        }
    
        public void setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
        }
    
        public String getPayType() {
            return payType;
        }
    
        public void setPayType(String payType) {
            this.payType = payType;
        }
    
        public Technician getAssignedTech() {
            return assignedTech;
        }
    
        public void setAssignedTech(Technician assignedTech) {
            this.assignedTech = assignedTech;
        }
    }
    
}
