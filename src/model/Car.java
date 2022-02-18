/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shreya
 */
public class Car {
    
    private String modelnumber;
    private int seats;
    private String serialnumber;
    private String manufacturer;
    private boolean maintanancecertificate;
    private boolean availability;
    private int manufactureyear;
    private String location;
    
    public Car(String model_number, int seats, String serial_number, String manufacturer, boolean maintanance_certificate, boolean availability, int manufacture_year, String location){
        this.modelnumber = model_number;
        this.seats = seats;
        this.serialnumber = serial_number;
        this.manufacturer = manufacturer;
        this.maintanancecertificate = maintanance_certificate;
        this.availability = availability;
        this.manufactureyear = manufacture_year;
        this.location = location;
    
    }
    
    public Car(){
    
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isMaintanancecertificate() {
        return maintanancecertificate;
    }

    public void setMaintanancecertificate(boolean maintanancecertificate) {
        this.maintanancecertificate = maintanancecertificate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getManufactureyear() {
        return manufactureyear;
    }

    public void setManufactureyear(int manufactureyear) {
        this.manufactureyear = manufactureyear;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
}
