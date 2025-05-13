package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DealershipFileManager {

    public Dealership getDealership(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("dealership.csv"));
            String firstLine = bufferedReader.readLine();
            String[] firstLineParts = firstLine.split("\\|");
                String name = firstLineParts[0];
                String address = firstLineParts[1];
                String phone = firstLineParts[2];

                Dealership dealership = new Dealership(name,address,phone);

                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] parts = line.split("\\|");
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    Double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                    dealership.addVehicle(vehicle);
                }
                return dealership;

        }catch (Exception e){
            System.out.println("An error has occurred");
            return null;
        }

    }

    public void saveDealership(Dealership dealership){
        ArrayList<Vehicle> inventory = dealership.getAllVehicles();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dealership.csv"));
            StringBuilder dealershipInfo = new StringBuilder();//String Builder for dealership information
            dealershipInfo.append(dealership.getName()).append("|");
            dealershipInfo.append(dealership.getAddress()).append("|");
            dealershipInfo.append(dealership.getPhone()).append("|");
            bufferedWriter.write(dealershipInfo.toString());
            bufferedWriter.newLine();
            for (Vehicle vehicle : inventory) {
                bufferedWriter.write(vehicle.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        }catch (Exception e){
            System.err.println("An error has occurred");
        }

    }

}
