package com.company;

public class Country {
    String countryName;
    String countryCode;
    String countrySquare;
    String isAvailableDelivery;

    void printCountryInfo() {
        System.out.println("Country: " + countryName + "; " + "Code: " + countryCode);
        System.out.println("Square (km2): " + countrySquare + "; " + "Delivery: " + isAvailableDelivery);
    }
}
