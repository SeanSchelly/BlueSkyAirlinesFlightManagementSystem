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


    public void displayMaintainedAircraft() {
        }

    public void isFlying() {
        if (isActive) {
            System.out.println("AircraftPackage.Aircraft is in active service.");
        }
    }
}