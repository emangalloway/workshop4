package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private ArrayList<Vehicle> inventory;
    Scanner scanner = new Scanner(System.in);

    private void init() {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership();
    }
        private void display () {
            init();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Welcome to " + dealership.getName());
                System.out.println("Menu");
                System.out.println("1.) Find Vehicle within a price range");
                System.out.println("2.) Find Vehicle by make/model");
                System.out.println("3.) Find Vehicle by year");
                System.out.println("4.) Find Vehicle by color");
                System.out.println("5.) Find Vehicle by mileage");
                System.out.println("6.) Find Vehicle by type");
                System.out.println("7.) List All Vehicles");
                System.out.println("8.) Add a vehicle");
                System.out.println("9.) Remove a vehicle");
                System.out.println("99.) Quit");
                System.out.print("Choose an option: ");

                String intInput = scanner.nextLine();
                int input = Integer.parseInt(intInput);

                switch (input) {
                    case 1:
                        processGetByPriceRequest();
                        break;
                    case 2:
                        processGetByMakeModelRequest();
                        break;
                    case 3:
                        processGetByYearRequest();
                        break;
                    case 4:
                        processGetByColorRequest();
                        break;
                    case 5:
                        processGetByMileageRequest();
                        break;
                    case 6:
                        processGetByVehicleTypeRequest();
                        break;
                    case 7:
                        processGetAllVehiclesRequest();
                        break;
                    case 8:
                        processAddVehicleRequest();
                        break;
                    case 9:
                        removeVehicleRequest();
                        break;
                    case 99:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option please try again.");
                        break;

                }

            }
        }
        private void displayVehicle () {
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }
        }
        private void processGetByPriceRequest () {
            System.out.println("Enter a min price: ");
            double minPriceInput = scanner.nextDouble();
            System.out.println("Enter a max price: ");
            double maxPriceInput = scanner.nextDouble();
            dealership.getVehicleByPrice(minPriceInput, maxPriceInput);
        }
        private void processGetByMakeModelRequest () {
            System.out.println("Enter make/model to find vehicles in inventory: ");
            String makeInput = scanner.nextLine();
            String modelInput = scanner.nextLine();
            dealership.getVehicleByMakeModel(makeInput,modelInput);
        }
        private void processGetByYearRequest () {
            System.out.println("Enter Year you want to start from: ");
            int startYear = scanner.nextInt();
            System.out.println("Enter year you want to stop at: ");
            int endYear = scanner.nextInt();
            dealership.getVehicleByYear(startYear,endYear);
        }
        private void processGetByColorRequest () {
            System.out.println("Enter color of vehicle: ");
            String color = scanner.nextLine();
            dealership.getVehicleByColor(color);
        }
        private void processGetByMileageRequest () {
            System.out.println("Enter minimum mileage: ");
            double minMile = scanner.nextDouble();
            System.out.println("Enter max mileage: ");
            double maxMile = scanner.nextDouble();
            dealership.getVehicleByMileage(minMile,maxMile);
        }
        private void processGetByVehicleTypeRequest () {
            System.out.println("Enter vehicle Type (Car,Truck,SUV,van): ");
            String type = scanner.nextLine();
            dealership.getVehicleByType(type);
        }
        private void processGetAllVehiclesRequest () {
            System.out.println("Fetching All Vehicles in inventory....");
            dealership.getAllVehicle();
        }
        private void processAddVehicleRequest () {
            System.out.println("Adding new vehicle");
            System.out.println("==================");
            System.out.println("Enter vin number: ");
            String vinInput = scanner.nextLine();
            int vin = Integer.parseInt(vinInput);
            System.out.println("Enter year: ");
            String yearInput = scanner.nextLine();
            int year = Integer.parseInt(yearInput);
            System.out.println("Enter make: ");
            String make = scanner.nextLine();
            System.out.println("Enter model: ");
            String model = scanner.nextLine();
            System.out.println("Enter color: ");
            String color = scanner.nextLine();
            System.out.println("Enter vehicle type (Car,Truck,SUV,van): ");
            String type = scanner.nextLine();
            System.out.println("Enter current mileage of vehicle: ");
            String mileInput = scanner.nextLine();
            int mile = Integer.parseInt(mileInput);
            System.out.println("Enter the price of the vehicle: ");
            String priceInput = scanner.nextLine();
            double price = Double.parseDouble(priceInput);
            dealership.addVehicle(new Vehicle(vin,year,make,model,type,color,mile,price));
        }

        private void removeVehicleRequest () {
            System.out.println("Enter vin number of the vehicle you would like to remove from the inventory: ");
            String vinInput = scanner.nextLine();
            int vin = Integer.parseInt(vinInput);
            for (Vehicle vehicle : inventory) {
                if (vehicle.getVinNumber() == vin){
                    dealership.removeVehicle(vehicle);
                }
            }
        }
    }