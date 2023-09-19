package org.launchcode;

public class FloppyDisc extends BaseDisc implements OpticalDisc {
    double tracks;
    int data;

    public FloppyDisc(String name, int minSpeed, int maxSpeed, double tracks, int data) {
        super(name, minSpeed, maxSpeed);
        this.tracks = tracks;
        this.data = data;
    }

    public double getTracks() {
        return tracks;
    }

    public void setTracks(double tracks) {
        this.tracks = tracks;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public void spinDisc() {
        System.out.println("A Floppy Disc spins at a rate of " + getMinSpeed() + " - " + getMaxSpeed() + " rpm");
    }

    @Override
    public void describe() {
        System.out.println("name: " + getName() + " has " + getData() + " gigs of memory and " + getTracks() + " tracks.");

    }
}
