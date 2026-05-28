//Package import
package AircraftPackage;

//Aircraft Super class to define generic aircraft attributes. Uses public access modifier
public class Aircraft {
    private String make;
    private double totalCapacity;
    private int crewCapacity;
    private boolean isInternational;
    private boolean isActive;
    private int maxSpeed;

    public String getMake() {
        return make;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }
    public int getCrewCapacity() {
        return crewCapacity;
    }

    public boolean getIsInternational() {
        return isInternational;
    }
    public boolean getIsActive() {
        return isActive;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    Aircraft(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
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