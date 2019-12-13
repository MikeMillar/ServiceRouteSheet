package com.mikemillar.routesheet;

import com.mikemillar.routesheet.DataModels.*;
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
    @FXML private TextArea custNotesField;
    
    @FXML private TextField vinField;
    @FXML private TextField yearField;
    @FXML private TextField makeField;
    @FXML private TextField modelField;
    @FXML private TextField colorField;
    @FXML private TextField mileageField;
    @FXML private TextArea vehNotesField;
    
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
        String notes = custNotesField.getText().trim();
        
        Customer newCustomer = new Customer(name, add1, add2, city, state, zip, home, work, cell, fax, other, notes);
        CustomerData.getInstance().addCustomer(newCustomer);
        return newCustomer;
    }
    
    public Vehicle addVehicle() {
        String vin = vinField.getText().trim();
        String year = yearField.getText().trim();
        String make = makeField.getText().trim();
        String model = modelField.getText().trim();
        String color = colorField.getText().trim();
        String mileage = mileageField.getText().trim();
        String notes = vehNotesField.getText().trim();
        
        Vehicle newVehicle = new Vehicle(vin,year,make, model,color,mileage, notes);
        VehicleData.getInstance().addVehicle(newVehicle);
        return newVehicle;
    }
    
    public RepairOrder addRepairOrder() {
        return null;
    }
    
    

}
