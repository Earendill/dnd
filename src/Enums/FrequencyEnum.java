/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Wouter Janssens
 */
public enum FrequencyEnum {
    
    AT_WILL("At-will"),
    ENCOUNTER("Encounter"),
    DAILY("Daily");
    
    private String name;
    
    private FrequencyEnum(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    }
    
    
}
