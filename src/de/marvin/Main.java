package de.marvin;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str = new String ( "Hello World !" );
        String sub = str.substring ( 0, 13 );
        Scanner scan = new Scanner ( System.in );
        Scanner scanNumb = new Scanner ( System.in );
        Scanner scanDouble = new Scanner ( System.in );
        String inData;
        int inDataNumb;
        double inDataDouble = 0;

        Ausgaben ausgabenObject = new Ausgaben ();

        //Simple HelloWorld
        ausgabenObject.HelloWorldOut ( sub );

        //Output of an Error
        //str = null;
        //ausgabenObject.ErrorOut ( str );

        //Input and Output of a Scanner-Object
        System.out.println ( "Input:" );
        inData = scan.nextLine ();

        //Input just Numbers and ^2 them
        System.out.println ( "Input Numbers: " );
        inDataNumb = scanNumb.nextInt ();

        //Double with Exponential Spelling
        System.out.println ( "Input Double with E+Exponent: " );
        inDataDouble = scanDouble.nextDouble ();
        ausgabenObject.ScannerOut (inData, inDataNumb, inDataDouble);





    }
}


