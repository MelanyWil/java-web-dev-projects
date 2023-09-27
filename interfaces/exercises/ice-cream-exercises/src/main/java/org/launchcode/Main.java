package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getTopping();
        Comparator comparator = new FlavorComparator();
        Comparator compareCones = new ConeComparator();
        Comparator compareTopping = new ToppingComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparator);
        for(Flavor flavor: flavors) {
            System.out.println(flavor.getName() + ": " + flavor.getAllergens().size());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(compareCones);
        for(Cone cone: cones)
            System.out.println(cone.getName() + ": " + cone.getCost());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        // TODO: Bonus Mission compare toppings

        toppings.sort(compareTopping);
        for (Toppings topping: toppings) {
            System.out.println(topping.getName());
        }


    }
}