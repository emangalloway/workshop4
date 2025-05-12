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
    public ArrayList<Vehicle> getVehicleByPrice(double min, double max){
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                results.add(vehicle);
            }
        }return results;
    }
    public ArrayList<Vehicle>  getVehicleByMakeModel(String make, String model){
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                results.add(vehicle);
            }
        }return results;
    }
    public ArrayList<Vehicle>  getVehicleByYear(double min,double max){
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                results.add(vehicle);
            }
        }return results;
    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)){
                results.add(vehicle);
            }
        }return results;
    }
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
