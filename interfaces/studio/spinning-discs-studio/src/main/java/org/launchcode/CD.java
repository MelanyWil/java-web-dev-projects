package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    double data;
    double tracks;

    public CD(String name, int minSpeed, int maxSpeed, double data, double tracks) {
        super(name, minSpeed, maxSpeed);
        this.data = data;
        this.tracks = tracks;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getTracks() {
        return tracks;
    }

    public void setTracks(double tracks) {
        this.tracks = tracks;
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + getMinSpeed() + " - " + getMaxSpeed() + " rpm");
    }

    @Override
    public void describe() {
        System.out.println("name: " + getName() + " has " + getData() + " gigs of memory and " + getTracks() + " tracks.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
