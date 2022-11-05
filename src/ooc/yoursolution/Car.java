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
public final class Car implements CarInterface { // starting the class implementing CarInterface & its parameters
// here we create the necessary variables to store  our data from the txt 
    // ArrayList<car> items;
    double rate; // double for the rate of cars 
    private Make make; // bring the enum data of the name of the cars saved in make
    int id; //id of the driver
     private Map<Month, Boolean[]> map; // had to research to realize we need a hash map to "map" our availability
    public Car(int id, Make make, double rate) { // the car object 
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
        return this.make; //return the value of the make to store it
    }

    @Override
    public void setMake(Make make) {// setter method for make 
        this.make = make;   //set the make for a car 
    }

    @Override
    public double getRate() { //  return the rate for a car
        return rate;
    }

    @Override
    public void setRate(double rate) { //set rate for the car
        this.rate = rate;
    }

    @Override
    public Map getAvailability() { //  get the availability
        return map;
    }

    @Override
    public void setAvailability(Map map) { // set the availability 
        this.map = map;
    }

    @Override // ID will be set once created , just need getter method to store it
    public int getId() { 
        return this.id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
     // boolean to get the month availability true or false (available or not
        Boolean[] monthAvailability = map.get(month);
        // first time interating can be null then it means it is true 
        if(monthAvailability[day-1] == null){
          monthAvailability[day-1] = true; //monthavailability is the month and the day - 1 cause computer counting
          //true means avaialiable
          map.put(month, monthAvailability); // storing new info
          return monthAvailability[day-1];   //return
        }
        // 
        return monthAvailability[day-1]; 
    }

    @Override
    public boolean book(Month month, int day) {
        if (map.get(month)[day-1]) {  // if the map get the info false will be is available, true is not (means is there) so true
            map.get(month)[day-1] = false; //if it is available it will book and return true
            return true;
        }
        return false;
    }

}
