/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author maxim
 */
public abstract class car implements CarInterface{
 
    ArrayList<car> items;
  
    public car(int id, Make make, double rate){
        items = new ArrayList<>();
    }
     double rate;
    int ID;
    private Make make; 
    private Month month;
      private Map<Month, Boolean[]> map;
    
    @Override
    public Map createAvailability() {
     map = new HashMap<>();
        map.put(Month.JANUARY, new Boolean[31]);
        map.put(Month.FEBRUARY, new Boolean[28]);
        map.put(Month.MARCH, new Boolean[31]);
        map.put(Month.APRIL, new Boolean[30]);
        map.put(Month.MAY, new Boolean[31]);
        map.put(Month.JUNE, new Boolean[30]);
        map.put(Month.JULY, new Boolean[31]);
        map.put(Month.AUGUST, new Boolean[31]);
        map.put(Month.SEPTEMBER, new Boolean[30]);
        map.put(Month.OCTOBER, new Boolean[31]);
        map.put(Month.NOVEMBER, new Boolean[30]);
        map.put(Month.DECEMBER, new Boolean[31]);
        return map;
    }

    @Override
    public Make getMake() {
    return this.make;
    }

    @Override
    public void setMake(Make make) {
       this.make = make;    
    }

    @Override
    public double getRate(double rate) {
    return this.rate;
    }

    @Override
    public void setRate(double rate) {
    this.rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
       
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
       return this.ID;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}