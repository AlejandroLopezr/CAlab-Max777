/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author maxim
 */
public class RentACar implements RentACarInterface {
//variables to store list of cars and name of the place
    private List<Car> cars;
 private String nameOfRentACar; 
 //constructor
    public RentACar(List<Car>cars, String nameOfRentAcar) {
     this.cars = cars;
     this.nameOfRentACar = nameOfRentACar;
     
     
    }

    //Insert code implements bring all methods that should be implemented empty - the it to make what it asks
    @Override
    public List getCars() {
        return cars;
        
        //it return the list of cars that the company has
    }

    @Override
    public void setCars(List cars) {
        this.cars = cars;
        //set the list of cars that the company has
    }

     // get and set to the name of the rental car
    @Override
    public String getName() {
     return nameOfRentACar;
    }

    @Override
    public void setName(String name) {
       nameOfRentACar = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
    //Method to check availability of a car in a specific day and duration 
    //creating variable to control the en of the checking 
    
    int finalDay= day + lengthOfRent;
    for (Car car : cars){ //This loop takes each car to check 
       if (car.getMake().equals(make)){
           if (car.isAvailable(month, day)){
               //checking if car is available all the length
               for(int i=0;<lengthOfRent; i++){
                   if(car.isAvailable(month, finalDay){
                       finalDay--;
                       if(finalDay ==day){
                           return true;
                       }
                   }
               }
           }
           
       } 
        
    }
    return false;
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
