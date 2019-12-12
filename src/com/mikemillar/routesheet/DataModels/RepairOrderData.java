package com.mikemillar.routesheet.DataModels;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepairOrderData {
    
    private static RepairOrderData instance = new RepairOrderData();
    
    private static final String ACTIVE_RO_FILE = "activeRO.xml";
    private static final String INACTIVE_PO_FILE = "inactivePO.xml";
    private static final String INACTIVE_RO_FILE = "inactiveRO.xml";
    
    private ObservableList<RepairOrder> activeROList;
    private ObservableList<RepairOrder> inactivePOList;
    private ObservableList<RepairOrder> inactiveROList;
    
    public RepairOrderData() {
        activeROList = FXCollections.observableArrayList();
        inactivePOList = FXCollections.observableArrayList();
        inactiveROList = FXCollections.observableArrayList();
    }
    
    public static RepairOrderData getInstance() {
        return instance;
    }
    
    public ObservableList<RepairOrder> getActiveROList() {
        return activeROList;
    }
    
    public ObservableList<RepairOrder> getInactivePOList() {
        return inactivePOList;
    }
    
    public ObservableList<RepairOrder> getInactiveROList() {
        return inactiveROList;
    }
    
    public void addRepairOrderToList(RepairOrder ro) {
        if (ro.isInactive()) {
            // add to inactive list
            inactiveROList.add(ro);
        } else if (ro.isPartsInactive()) {
            // add to inactivePO list
            inactivePOList.add(ro);
        } else {
            // add to active list
            activeROList.add(ro);
        }
    }
    
    
}
