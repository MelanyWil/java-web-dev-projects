package org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");
        boolean isValidNum = false;
        double radius = input.nextDouble();

        try {
            while (!isValidNum)
                if (radius < 0) {
                    System.out.println("Please enter a positive number");
                    radius = input.nextDouble();
                } else {
                    isValidNum = true;
                    System.out.println("The area of the circle is " + Circle.getArea(radius));
                }
        }
        catch (InputMismatchException e) {
            System.out.println("Not valid input! Quitting.");
        }
        input.close();
    }
}
