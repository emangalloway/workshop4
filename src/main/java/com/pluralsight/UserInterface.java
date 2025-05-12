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
            System.out.println("Welcome to"+dealership.getName());
            System.out.println();

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
