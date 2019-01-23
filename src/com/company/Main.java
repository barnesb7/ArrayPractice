package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] dailyAverageTemps = new double[7];
        double weeklySum = 0;
        double weeklyAverage;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < dailyAverageTemps.length; i++){
           System.out.println("Please enter the temperature for day in degrees Fahrenheit for day " + i);

           dailyAverageTemps[i] = scanner.nextDouble();
        }


        for(int i = 0; i < dailyAverageTemps.length; i++){

            System.out.println(dailyAverageTemps[i]);
            weeklySum+= dailyAverageTemps[i];
        }


        weeklyAverage = weeklySum/dailyAverageTemps.length;
        System.out.println("The weekly average temp was " + weeklyAverage + ".");
    }
}
