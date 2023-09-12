package org.launchcode;


public class Main {

    public static void main(String[] args) {

        // TODO: Create 5 menu items in different categories
        MenuItem pizza = new MenuItem("Pizza", "pepperoni pizza slice", 3.99, "main course");
        MenuItem applePie = new MenuItem("Apple Pie", "Warm apple pie served a la mode", 6.99, "dessert");
        MenuItem cheeseSticks = new MenuItem("Mozzarella Cheese Sticks", "Battered and fried", 4.95, "appetizer");
        MenuItem burger = new MenuItem("Burger", "beef patty with onion, tomato and lettuce", 6.99, "main course");
        MenuItem toastedRav = new MenuItem("Toasted Ravioli", "st. louis style", 5.00, "appetizer");

        System.out.println(pizza.isNew());
        // TODO: print first item

        System.out.println(pizza);

        // TODO: create menu
        Menu menu = new Menu();

        // TODO: Add items to menu and print it
        menu.addItem(pizza);
        menu.addItem(applePie);
        menu.addItem(cheeseSticks);
        menu.addItem(burger);
        menu.addItem(toastedRav);

        //System.out.println(menu);

        // TODO: Remove an item and print menu
        menu.removeItem(pizza);

        //System.out.println(menu);

        // TODO: Test equal method
        System.out.println(pizza.equals(burger));

        MenuItem burger2 = new MenuItem("Burger", "beef patty with onion, tomato and lettuce", 6.99, "main course");


        //BONUS MISSION

        //TODO: Attempt to add a duplicate item
        menu.addItem(burger2);
        System.out.println(menu);

        menu.addItem(applePie);
        System.out.println(menu);

    }

}
