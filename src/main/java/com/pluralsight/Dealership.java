package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private  ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Vehicle> getVehicleNyPrice(double min, double max){}
    public ArrayList<Vehicle>  getVehicleByMakeModel(String make, String model){}
    public ArrayList<Vehicle>  getVehicleByYear(double min,double max){}
    public ArrayList<Vehicle> getVehicleByColor(String color){}
    public ArrayList<Vehicle> getVehicleByMileage(double min,double max){}
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){}
    public ArrayList<Vehicle> getAllVehicle(){}
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }



}
