/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author shreya
 * 
 */
public class CarDetailsList {
    
    private ArrayList<Car> carDetailsList;
    private LocalDateTime lastFleetUpdate;
    private String formatDateTime;
    
    public CarDetailsList(){
        this.carDetailsList = new ArrayList<Car>();        
        
        Car car1 = new Car("Model A", 4, "BST1987", "Honda", true, true, 2019, "Boston");
        Car car2 = new Car("Model B", 4, "LA1567", "Honda", true, false, 2021, "LA");
        Car car3 = new Car("Model X", 2, "BST6214", "Tesla", true, true, 2021, "Boston");
        Car car4 = new Car("Accent", 4, "BST6489", "Hyundai", true, true, 2020, "Boston");
        Car car5 = new Car("Model LAD", 6, "LA1204", "Tesla", true, true, 2018, "LA");
        Car car6 = new Car("Model A", 8, "NY7965", "Tesla", true, false, 2016, "New York");
        Car car7 = new Car("Model AB", 4, "NY4562", "Honda", false, false, 2013, "New York");
        Car car8 = new Car("Accent", 4, "LA2220", "Honda", true, true, 2018, "LA");
        
        carDetailsList.add(car1);
        carDetailsList.add(car2);
        carDetailsList.add(car3);
        carDetailsList.add(car4);
        carDetailsList.add(car5);
        carDetailsList.add(car6);
        carDetailsList.add(car7);
        carDetailsList.add(car8);
        
        lastFleetUpdate = LocalDateTime.now();
            }

    public ArrayList<Car> getCarDetailsList() {
        return carDetailsList;
    }
  
    public void setCarDetailsList(ArrayList<Car> carDetailsList) {
        this.carDetailsList = carDetailsList;
    }

    public LocalDateTime getLastFleetUpdate() {
        return lastFleetUpdate;
    }

    public void setLastFleetUpdate(LocalDateTime lastFleetUpdate) {
        this.lastFleetUpdate = lastFleetUpdate;
    }
    
    public Car addCar(){
        Car newCar = new Car();
        carDetailsList.add(newCar);
        return newCar;
    }
    
    public void deleteCarDetails(Car car){
        carDetailsList.remove(car);
    }
    
}
