package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = input.nextDouble();

        System.out.println("Enter width: ");
        double width = input.nextDouble();

        double recArea = length * width;
        System.out.println("The area of the rectangle is " + recArea);

        input.close();
    }
}
