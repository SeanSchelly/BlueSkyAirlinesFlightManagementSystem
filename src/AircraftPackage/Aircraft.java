package AircraftPackage;

public class Aircraft {
    public String make;
    public double totalCapacity;
    public int crewCapacity;
    public boolean isInternational;
    public boolean isActive;
    public int maxSpeed;

    public Aircraft(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
        this.make = make;
        this.totalCapacity = totalCapacity;
        this.crewCapacity = crewCapacity;
        this.isInternational = isInternational;
        this.isActive = isActive;
        this.maxSpeed = maxSpeed;
    }

     final public void displayMaintainedAircraft() {
        if (isActive) {
            System.out.println(make+" is in active service.");
        } else {
            System.out.println(make+" is not in active service.");
        }
        }

    public void isFlying() {
        System.out.println("This plane: "+make+" is currently in flight to [domestic/international]! Check FlightRadar.com to check its course.");
    }
}