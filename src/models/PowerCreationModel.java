/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Enums.FrequencyEnum;
import java.awt.Color;
import java.util.EnumMap;

/**
 *
 * @author Wouter Janssens
 */
public class PowerCreationModel extends Model{
    
    private String name;
    private String level;
    private FrequencyEnum frequency;
    private Enum source;
    private String range;
    private Enum area;
    private String size;
    private Enum target;
    
    private static final EnumMap<FrequencyEnum, Color> COLORS;
    
    static{
       COLORS = new EnumMap<FrequencyEnum, Color>(FrequencyEnum.class); 
       COLORS.put(FrequencyEnum.AT_WILL, Color.GREEN);
       COLORS.put(FrequencyEnum.ENCOUNTER, Color.RED);
       COLORS.put(FrequencyEnum.DAILY, Color.YELLOW);
    }

    public PowerCreationModel() {
    }

    public Enum getArea() {
        return area;
    }

    public void setArea(Enum area) {
        this.area = area;
        this.fireStateChanged();  
    }

    public Enum getFrequency() {
        return frequency;        
    }

    public void setFrequency(FrequencyEnum frequency) {
        this.frequency = frequency;
        this.fireStateChanged();        
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        this.fireStateChanged();  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.fireStateChanged();  
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
        this.fireStateChanged();  
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        this.fireStateChanged();  
    }

    public Enum getSource() {
        return source;
    }

    public void setSource(Enum source) {
        this.source = source;
        this.fireStateChanged();  
    }

    public Enum getTarget() {
        return target;
    }

    public void setTarget(Enum target) {
        this.target = target;
        this.fireStateChanged();  
    }

    public Color getColor() {
        return COLORS.get(frequency);
    }
    
}
