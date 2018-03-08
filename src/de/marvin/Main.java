package de.marvin;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        /*
        Variables for the Scan
         */
        double value1;//startSpeedometer
        double value2;//endSpeedometer
        double value3;//consumption
        /*
        //Object Scanner initalized
        */
        Scanner scanCar = new Scanner(System.in);
        /*
        Request to enter the values and entry for the values
         */
        System.out.println ( "Type in your values\n" + "---------------------" );
        System.out.println ( "Startspeedometer : " );
        value1 = scanCar.nextDouble ();
        System.out.println ( "Endspeedometer : " );
        value2 = scanCar.nextDouble ();
        System.out.println ( "Consumtion : " );
        value3 = scanCar.nextDouble ();
        /*
         Object car created and provided with values
        */
        Car car1 = new Car (1904,1990,30);
        Car car2 = new Car ( 111090,120000,2000 );
        Car ownCar = new Car (value1, value2, value3);
        /*
        Output of consumption per kilometer
         */
        System.out.println ( "The first car consume " + car1.LiterPerKilometer () + "liter per kilometer" );
        System.out.println ( "The second car consume " + car2.LiterPerKilometer () + "liter per kilometer" );
        System.out.println ( "Your car consume " + ownCar.LiterPerKilometer () + "liter per kilometer" );
    }
}


