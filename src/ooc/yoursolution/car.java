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
public abstract class car implements CarInterface { // starting the class implementing CarInterface & its parameters
// here we create the necessary variables to save our data
    // ArrayList<car> items;
    double rate; // double for the rate of cars 
    private Make make; // bring the enum data of the name of the cars saved in make
    int id; //id of the driver
     private Map<Month, Boolean[]> map; // had to research to realize we need a hash map to "map" our availability
    public car(int id, Make make, double rate) { // the car object 
        //items = new ArrayList<>();

        this.id = id;
        this.make = make;
        this.rate = rate;   
        createAvailability (); //each car needs its own availability 
    }

    @Override //override the new data in the intarface 
    public Map createAvailability() { // once created the "map" set up the parameters  
        map = new HashMap<>();  //start the map
        map.put(Month.JANUARY, new Boolean[31]); // put info in the map
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
        return map; //return the full map
    }

    @Override // getter method 
    public Make getMake() {
        return this.make; //we specify this make is return to avoid confusion
    }

    @Override
    public void setMake(Make make) {// setter method for make
        this.make = make;  
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public Map getAvailability() {
        return map;
    }

    @Override
    public void setAvailability(Map map) {
        this.map = map;
    }

    @Override
    public int getId() {
        return this.id;
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
