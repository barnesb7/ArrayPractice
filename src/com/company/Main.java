package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Temperature[] dailyTemperatures = new Temperature[7];

        double weeklySumFahrenheit = 0;
        double weeklySumCelsius = 0;
        int printFahrenheitOrCelsius = 1;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < dailyTemperatures.length; i++){
           System.out.println("Please enter the temperature for day " + (i +1) + " in degrees Fahrenheit." );
           dailyTemperatures[i] = new Temperature();

           double enteredTemperature = scanner.nextDouble();
           dailyTemperatures[i].setTempInFahrenheit(enteredTemperature);
        }


        System.out.println("Would you like your results in [1] Fahrenheit or [2] Celsius");
        printFahrenheitOrCelsius = scanner.nextInt();

        int dayCounterLabel = 0;
        for (Temperature temp: dailyTemperatures) {

            temp.convertToCelsius(temp.getTempInFahrenheit());

            weeklySumCelsius += temp.getTempInCelsius();
            weeklySumFahrenheit += temp.getTempInFahrenheit();

              if(printFahrenheitOrCelsius == 1) {
                  System.out.println("Day " + (dayCounterLabel + 1) + " : " + temp.getTempInFahrenheit() + " Fahrenheit.");
              } else {
                  System.out.println("Day " + (dayCounterLabel + 1) + " : " + temp.getTempInCelsius() + " Celsius.");
              }

            dayCounterLabel++;
        }

        if(printFahrenheitOrCelsius == 1) {
            System.out.println("The weekly average temp in Fahrenheit was " + (weeklySumFahrenheit / dailyTemperatures.length));
        } else {
            System.out.println("The weekly average temp in Celsius was " + (weeklySumCelsius / dailyTemperatures.length));
        }
    }
}
