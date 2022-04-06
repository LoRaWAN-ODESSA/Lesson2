package com.company;

public class IdentityCard {

    String passportSeries;
    int passportNumber;
    String clientName;
    int clientId;

    void printClientInfo() {
        System.out.println("Client Name: " + clientName + "; " + "Client ID: " + clientId);
        System.out.println("Series and passport number: " + passportSeries + passportNumber);
    }
}
