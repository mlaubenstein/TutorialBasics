package de.marvin;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str = new String ( "Hello World !" );
        String sub = str.substring ( 0, 13 );
        Scanner scan = new Scanner ( System.in );
        String inData;

        Ausgaben ausgabenObject = new Ausgaben ();

        //Simple HelloWorld
        ausgabenObject.HelloWorldOut ( sub );

        //Output of an Error
        str = null;
        ausgabenObject.ErrorOut ( str );

        //Input and Output of a Scanner-Object
        System.out.println ( "Input:" );
        inData = scan.nextLine ();
        ausgabenObject.ScannerOut (inData);



    }
}


