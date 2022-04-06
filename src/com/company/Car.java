package com.company;

public class Car {
    String carModel;
    float carEngineConf;
    int carYear;
    String carTransmission;

    void printCarInfo(){
        System.out.println("Car model: " + carModel + "; " + "Year: " + carYear);
        System.out.println("Car engine configuration: " + carEngineConf + "; "
                + "Transmission : " + carTransmission);
    }
}
