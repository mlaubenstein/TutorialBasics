package de.marvin;




public class Ausgaben {

    public  void HelloWorldOut(String str){
        System.out.println ( str );
    }


    public void ErrorOut(String str) {
        System.err.println ( "ERROR, String is NULL!" );

    }

    public void ScannerOut(String inData) {
        System.out.println ("Output: "+ inData );
    }
}
