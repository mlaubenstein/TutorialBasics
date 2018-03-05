package de.marvin;

public class Main {

    public static void main(String[] args) {

        String str = new String ( "Hello World !" );
        String sub = str.substring ( 0, 13);
        Ausgaben ausgabenObject = new Ausgaben();


        ausgabenObject.HelloWorldOut (sub);



    }
}
