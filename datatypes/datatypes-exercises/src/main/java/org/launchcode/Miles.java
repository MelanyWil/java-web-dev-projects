package org.launchcode;

import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas have you used? ");
        double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");

        input.close();

    }
}
