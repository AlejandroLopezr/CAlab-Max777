/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author maxim
 */
public abstract class car implements CarInterface{
 
    ArrayList<car> items;
    double rate;
    int ID;
    public car(){
        items = new ArrayList<>();
    }

    private Make make; 
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
      
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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