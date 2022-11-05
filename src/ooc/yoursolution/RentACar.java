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
    public RentACar() {
     this.cars = cars;
     this.nameOfRentACar = nameOfRentACar;
    }

    @Override
    public List getCars() {
        return cars;
        
        //it return the list of cars that the company has
    }

    @Override
    public void setCars(List cars) {
        this.cars = cars;
    }

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
