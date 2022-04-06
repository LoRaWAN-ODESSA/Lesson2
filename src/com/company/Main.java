package com.company;

public class Main {

    public static void main(String[] args) {
        IdentityCard client1 = new IdentityCard();
        Country country1 = new Country();
        Car car1 = new Car();
        client1.clientName = "Serhii Kovalenko";
        client1.clientId = 1234567890;
        client1.passportSeries = "KM";
        client1.passportNumber = 278377;
        country1.countryName = "Ukraine";
        country1.countryCode = "+380";
        country1.countrySquare = "603 648";
        country1.isAvailableDelivery = "Yes";
        car1.carModel = "Honda Insight";
        car1.carYear = 2012;
        car1.carEngineConf = (float) 1.3;
        car1.carTransmission = "Automatic";

        IdentityCard client2 = new IdentityCard();
        Country country2 = new Country();
        Car car2 = new Car();
        client2.clientName = "Artem Kovalenko";
        client2.clientId = 1245789546;
        client2.passportSeries = "KK";
        client2.passportNumber = 354745;
        country2.countryName = "Canada";
        country2.countryCode = "+1";
        country2.countrySquare = "9 976 140";
        country2.isAvailableDelivery = "Yes";
        car2.carModel = "BMW M550i";
        car2.carYear = 2020;
        car2.carEngineConf = (float) 4.4;
        car2.carTransmission = "Automatic";

        IdentityCard client3 = new IdentityCard();
        Country country3 = new Country();
        Car car3 = new Car();
        client3.clientName = "Tetiana Vasilevska";
        client3.clientId = 1541237891;
        client3.passportSeries = "LK";
        client3.passportNumber = 888745;
        country3.countryName = "Germany";
        country3.countryCode = "+49";
        country3.countrySquare = "357 021";
        country3.isAvailableDelivery = "No";
        car3.carModel = "Nissan Altima";
        car3.carYear = 2015;
        car3.carEngineConf = (float) 2.5;
        car3.carTransmission = "Automatic";

        client1.printClientInfo();
        country1.printCountryInfo();
        car1.printCarInfo();
        client2.printClientInfo();
        country2.printCountryInfo();
        car2.printCarInfo();
        client3.printClientInfo();
        country3.printCountryInfo();
        car3.printCarInfo();

        MyObject myFirstObject = new MyObject();
        myFirstObject.number = 10;
        myFirstObject.text = "text1";

        MyObject mySecondObject = new MyObject();
        mySecondObject.number = 20;
        mySecondObject.text = "text2";

        System.out.println("myFirstObject: number=" + myFirstObject.number + ", text=" + myFirstObject.text);
        System.out.println("mySecondObject: number=" + mySecondObject.number + ", text=" + mySecondObject.text);

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
        + mySecondObject.STATIC_NUMBER + ","
        + MyObject.STATIC_NUMBER);

        MyObject.STATIC_NUMBER = MyObject.STATIC_NUMBER + 1;

        System.out.println("Static: " + myFirstObject.STATIC_NUMBER + ","
                + mySecondObject.STATIC_NUMBER + ","
                + MyObject.STATIC_NUMBER);
    }
}
