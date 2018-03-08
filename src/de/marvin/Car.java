package de.marvin;

public class Car  {
    /*
    Variables initialized for the calculation of the spent fuel
     */
    double startKilometer;
    double endKilometer;
    double Liter;
    /*
    Constructor
     */
    Car (double startSpeedometer, double endSpeedometer, double consumption){
        startKilometer  = startSpeedometer;
        endKilometer    = endSpeedometer;
        Liter           = consumption;
    }
    /*
    Method for calculating the liter per kilometer
     */
    double LiterPerKilometer(){

        return Liter/(endKilometer-startKilometer);
    }
}
