package de.marvin;




public class Ausgaben {

    public  void HelloWorldOut(String str){
        System.out.println ( str+"" );
    }


    /*public void ErrorOut(String str) {
        System.err.println ( "ERROR, String is NULL" );

    }*/

    public void ScannerOut(String inData, int inDataNumb, double inDataDouble) {


        System.out.println ("Output = "+ inData );

        System.out.println(inDataNumb + "^2 = "+ inDataNumb*inDataNumb);

        System.out.println ( "Output Double E+Exponent = " + inDataDouble );

    }
}
