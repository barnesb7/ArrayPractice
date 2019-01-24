package com.company;

public class Temperature {

    private double tempInFahrenheit;
    private double tempInCelsius;


    public void setTempInFahrenheit(double givenTemp){
        tempInFahrenheit = givenTemp;
    }

    public double getTempInFahrenheit(){
        return tempInFahrenheit;
    }

    public void setTempInCelsius(double givenTemp) {
        tempInCelsius = givenTemp;
    }

    public double getTempInCelsius(){
        return tempInCelsius;
    }

    public void convertToCelsius(double fahrenheitTemp){
        tempInCelsius = (fahrenheitTemp - 32) * .5556;
    }

}
