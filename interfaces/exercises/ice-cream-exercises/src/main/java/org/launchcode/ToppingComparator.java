package org.launchcode;

import java.util.Comparator;

public class ToppingComparator implements Comparator <Toppings> {

    @Override
    public int compare(Toppings topping1, Toppings topping2) {
        return topping1.getName().compareTo(topping2.getName());
    }
}
