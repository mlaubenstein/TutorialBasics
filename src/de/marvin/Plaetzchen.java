package de.marvin;
import java.util.Scanner;


public class Plaetzchen
{
    public void setPlaetzchen(){
        {
            Abfrage abfrageObject = new Abfrage ();
            Ausgaben ausgaben = new Ausgaben ();


            // Instanzvariablen
            abfrageObject.sorte ();
            Scanner sorteEingabe = new Scanner ( System.in );
            String sorte = sorteEingabe.nextLine ();
            // weitere Instanzvariablen hier
            abfrageObject.form ();
            Scanner formEingabe = new Scanner ( System.in );
            String form = formEingabe.nextLine ();
            abfrageObject.groesse ();
            Scanner groesseEingabe = new Scanner ( System.in );
            String groesse = groesseEingabe.nextLine ();



            ausgaben.ausgeben ( sorte, groesse, form );



        }
    }
}
