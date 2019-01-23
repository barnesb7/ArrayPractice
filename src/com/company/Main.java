package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] dailyAverageFahrenheitTemps = new double[7];
        double[] dailyAverageCelsiusTemps = new double[7];

        double weeklySumFahrenheit = 0;
        double weeklySumCelsius = 0;
        double weeklyAverageFahrenheit;
        double weeklyAverageCelsius;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < dailyAverageFahrenheitTemps.length; i++){
           System.out.println("Please enter the temperature for day " + (i +1) + " in degrees Fahrenheit." );

           dailyAverageFahrenheitTemps[i] = scanner.nextDouble();
        }


        for(int i = 0; i < dailyAverageFahrenheitTemps.length; i++){
            weeklySumFahrenheit+= dailyAverageFahrenheitTemps[i];

        }

        int counter = 0;
        for (double temp: dailyAverageFahrenheitTemps) {

            double dailyTempInCelsius = ((temp - 32) * .5556);

            dailyAverageCelsiusTemps[counter] = dailyTempInCelsius;

            weeklySumCelsius += dailyTempInCelsius;

            counter++;

        }

            int count = 0;
            for(double temp : dailyAverageFahrenheitTemps){
                System.out.println("On day " + (count + 1) + " the temp of " + temp + " Fahrenheit converts to " + dailyAverageCelsiusTemps[count]);
                count++;
            }


        weeklyAverageFahrenheit = weeklySumFahrenheit/dailyAverageFahrenheitTemps.length;
        weeklyAverageCelsius = weeklySumCelsius/dailyAverageCelsiusTemps.length;

        System.out.println("The weekly average temp was " + weeklyAverageFahrenheit + " Fahrenheit which is " + weeklyAverageCelsius + " Celsius.");

    }
}
