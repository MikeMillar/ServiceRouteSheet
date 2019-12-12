package com.mikemillar.routesheet.DataModels;

public class Technician extends Employee {

    private char skillLevel;
    
    public Technician() {
    
    }
    
    public Technician(char skillLevel) {
        super();
        this.skillLevel = skillLevel;
    }
    
    public Technician(String name, char skillLevel) {
        super(name);
        this.skillLevel = skillLevel;
    }
    
    public char getSkillLevel() {
        return skillLevel;
    }
    
    public void setSkillLevel(char skillLevel) {
        this.skillLevel = skillLevel;
    }
}
