package org.launchcode;

public class VinylRecord extends BaseDisc implements OpticalDisc {

    double tracks;
    int grooves;

    public VinylRecord(String name, int minSpeed, int maxSpeed, double tracks, int grooves) {
        super(name, minSpeed, maxSpeed);
        this.tracks = tracks;
        this.grooves = grooves;
    }

    public double getTracks() {
        return tracks;
    }

    public void setTracks(double tracks) {
        this.tracks = tracks;
    }

    public int getGrooves() {
        return grooves;
    }

    public void setGrooves(int grooves) {
        this.grooves = grooves;
    }

    @Override
    public void spinDisc() {
        System.out.println("A vinyl record spins at a rate of " + getMinSpeed() + " - " + getMaxSpeed() + " rpm");
    }

    @Override
    public void describe() {
        System.out.println("name: " + getName() + " has " + getTracks() + " tracks.");

    }
}
