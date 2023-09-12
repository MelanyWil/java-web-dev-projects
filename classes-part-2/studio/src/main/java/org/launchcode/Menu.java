package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    //Allow for default constructor


    //Getter & Setters

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    //SPECIAL METHODS

    //TODO: Define custom toString method
    //list menu items, grouped by category

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item: menuItems)
            if (item.getCategory().equals("appetizer")){
                appetizer.append("\n").append(item.toString()).append("\n");
            }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item: menuItems)
            if (item.getCategory().equals("main course")){
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item: menuItems)
            if (item.getCategory().equals("dessert")){
                dessert.append("\n").append(item.toString()).append("\n");
            }
        return "***MENU***" + " Updated-" + lastUpdated + "\n" + "Appetizers" + appetizer.toString() + "\n" +
                "Main Courses" + mainCourse.toString() + "\n" +
                "Desserts" + dessert.toString() + "\n";
    }


    //INSTANCE METHODS

    //TODO: Define addItem()
    //Make sure to update lastUpdated anytime a new item is added
    //BONUS MISSION: prevent addition of duplicate
    void addItem(MenuItem newItem) {
        String message = "That item has already been added";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();

    }

    //TODO: Define removeItem()
    //Make sure to update lastUpdated anytime something is removed
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

}


