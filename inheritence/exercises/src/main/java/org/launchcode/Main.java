package org.launchcode;

public class Main {


    public static void main(String[] args) {
        HouseCat cypress = new HouseCat("Cypress", 8);
        cypress.eat();
        System.out.println(cypress.isTired());

        HouseCat elmo = new HouseCat("Elmo");
        System.out.println(elmo.getWeight());

    }
}
