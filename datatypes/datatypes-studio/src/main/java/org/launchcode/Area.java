package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius: ");

        double radius = input.nextDouble();
        System.out.println("The area of the circle is " + radius * radius * 3.14);

    }
}
