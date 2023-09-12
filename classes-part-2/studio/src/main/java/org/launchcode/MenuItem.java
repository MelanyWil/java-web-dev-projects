package org.launchcode;

import java.awt.Menu;
import java.time.LocalDate;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private static LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
        //test isNew()
        //this.dateAdded = LocalDate.parse("2023-01-01");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static LocalDate getDateAdded() {
        return dateAdded;
    }

    //SPECIAL METHODS

    //TODO: Define custom toString method
    //Format name, description, price and conditional "NEW!"

    @Override
    public String toString() {
        String newText = isNew() ? " NEW!" : "";
        return name + newText + "\n" + description + "\nPrice $" + price;
    }


    //TODO: Define custom equals method
    @Override
    public boolean equals(Object toBeCompared) {

        if(this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }


    //INSTANCE METHODS

    //TODO: Define instance method isNew
    //return true if less than 90 days
    boolean isNew() {
        LocalDate currentDate = LocalDate.now();
        LocalDate thirtyDays = currentDate.minusDays(30);

        return dateAdded.isAfter(thirtyDays);
    }

}

