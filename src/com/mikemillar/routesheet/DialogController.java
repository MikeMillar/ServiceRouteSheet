package com.mikemillar.routesheet;

import com.mikemillar.routesheet.DataModels.Customer;
import com.mikemillar.routesheet.DataModels.CustomerData;
import com.mikemillar.routesheet.DataModels.RepairOrder;
import com.mikemillar.routesheet.DataModels.Vehicle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DialogController {
    
    @FXML private TextField customerNameField;
    @FXML private TextField address1Field;
    @FXML private TextField address2Field;
    @FXML private TextField cityField;
    @FXML private TextField stateField;
    @FXML private TextField zipField;
    @FXML private TextField homeNumberField;
    @FXML private TextField workNumberField;
    @FXML private TextField cellNumberField;
    @FXML private TextField faxNumberField;
    @FXML private TextField otherNumberField;
    @FXML private TextArea notesField;
    
    public Customer addCustomer() {
        String name = customerNameField.getText().trim();
        String add1 = address1Field.getText().trim();
        String add2 = address2Field.getText().trim();
        String city = cityField.getText().trim();
        String state = stateField.getText().trim();
        String zip = zipField.getText().trim();
        String home = homeNumberField.getText().trim();
        String work = workNumberField.getText().trim();
        String cell = cellNumberField.getText().trim();
        String fax = faxNumberField.getText().trim();
        String other = otherNumberField.getText().trim();
        String notes = notesField.getText().trim();
        
        Customer newCustomer = new Customer(name, add1, add2, city, state, zip, home, work, cell, fax, other, notes);
        CustomerData.getInstance().addCustomer(newCustomer);
        return newCustomer;
    }
    
    public Vehicle addVehicle() {
        return null;
    }
    
    public RepairOrder addRepairOrder() {
        return null;
    }
    
    

}
