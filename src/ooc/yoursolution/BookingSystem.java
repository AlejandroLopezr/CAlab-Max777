/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;

/**
 *
 * @author Melvn Alejandor Lopez 
 */
public class BookingSystem implements BookingSystemInterface{
    
    //BookingSystem.java - mplements the BookingSystemInterface
    //This class there is only one method that is implemented bellow
    

    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
      //This method receives a file using BufferedReader and it throws an exception in case it get any error
 
      //Declarin variables
      String readingFile = "";
      String nameOfRentAcar = "";
      List<Car> cars = new ArrayList<>(); //Creating an arraylist to get the car and its details  
      nameOfRentAcar = in.readLine();//It takes the first line that is the name of the place
      
      while ((readingFile = in.readLine()) !=null){ //using a looping to go thru the file till it reaches the end 
          String gettingInfo[] = readingFile.split(":");
          Make make = Make.valueOf(gettingInfo[0]);
          int rate = Integer.parseInt(gettingInfo[1]);
          int carsNum = Integer.parseInt(gettingInfo[2]); // Getting info of the file separating where is:
          
          for (int i=0; i<carsNum; i++){ //looping thill the end of number of cars 
              Car car = new Car (i, make, rate);
              cars.add(car); // adding car to arraylist of car
          }
          
      }
     RentACarInterface rentACarInterface = new RentACar(cars, nameOfRentACar);
        return rentACarInterface; //Will return the methods from class rentACarInterface.
      
      
    }
}
     

//This method return an Object of rentACarInterface class as asked on BookingSystemInterface