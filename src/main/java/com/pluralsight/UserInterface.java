package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    private void init(){
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealership = dfm.getDealership();
    }

    private void display(){
        init();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Welcome to "+dealership.getName());
            System.out.println("Choose an option");
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

            Integer input = scanner.nextInt();

            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
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

    private void processGetByPriceRequest(){}

    private void processGetByMakeModelRequest(){}

    private void processGetByYearRequest(){}

    private void processGetByColorRequest(){}

    private void processGetByMileageRequest(){}

    private void processGetByVehicleTypeRequest(){}

    private void processGetAllVehiclesRequest(){}

    private void processAddVehicleRequest(){}

    private void removeVehicleRequest(){}
}
