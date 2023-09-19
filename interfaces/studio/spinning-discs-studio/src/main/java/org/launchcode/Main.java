package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("music", 200, 500, 32, 10);
        DVD dvd1 = new DVD("movie", 500, 1200, 16, 3);
        VinylRecord record = new VinylRecord("MJ", 200, 600, 12, 12);
        FloppyDisc disc = new FloppyDisc("text", 300, 800, 8, 32);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.spinDisc();
        dvd1.spinDisc();
        cd1.describe();
        dvd1.describe();
        record.spinDisc();
        record.describe();
        disc.spinDisc();
        disc.describe();
    }
}