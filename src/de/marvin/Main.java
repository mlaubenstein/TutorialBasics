package de.marvin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        /*
        Variables for the Scan
         */
        List <Double> carValues = new ArrayList<>();
        List<Car> carOwn = new ArrayList<> (  );
        double value ;
        int choose, j = 0, numberOfCars =0, i ;
        boolean nextOne = true;


        /*
        //Object Scanner initalized
        */
        Scanner scan = new Scanner(System.in);

        /*
        Request to enter the values and entry for the values
         */
        do {
            for ( i=1; i <= 3; i++) {

                if (i == 1) {
                    System.out.println ( "Type in your values\n" + "---------------------" );
                    System.out.println ( "Startspeedometer : " );
                    value = scan.nextDouble ();
                    carValues.add ( j++, value );
                } else if (i == 2) {
                    System.out.println ( "Endspeedometer : " );
                    value = scan.nextDouble ();
                    carValues.add ( j++, value );
                } else {
                    System.out.println ( "Consumtion : " );
                    value = scan.nextDouble ();
                    carValues.add ( j++, value );
                    System.out.println ( " More cars ? Yes[1] No[0]" );
                    choose = scan.nextInt();
                    if (choose == 1) {
                        i=0;
                        numberOfCars++;
                    }
                    else{
                        nextOne = false;
                    }
                }
            }
        }while (nextOne == true);

        i = 0;

        /*
         Object car created and provided with values
        */
        Car car1 = new Car (1904,1990,30);
        Car car2 = new Car ( 111090,120000,2000 );

        while (i < numberOfCars){
            j=0;
            Car ownCar = new Car (carValues.get (j++), carValues.get (j++), carValues.get (j++));
            carOwn.add (i++, ownCar);
        }
        /*
        Output of consumption per kilometer
         */
        System.out.println ( "The first car consume " + car1.LiterPerKilometer () + "liter per kilometer" );
        System.out.println ( "The second car consume " + car2.LiterPerKilometer () + "liter per kilometer" );

        while( i<=numberOfCars ) {
            i=1;
            System.out.println ( "Your car "+ numberOfCars-- + " consume " + carOwn.get(0) + " liter per kilometer" );
            i++;
        }
        //System.out.println ( carValues );
    }
}


