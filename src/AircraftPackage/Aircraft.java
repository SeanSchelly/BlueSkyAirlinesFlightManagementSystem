//Package import
package AircraftPackage;

//Aircraft Super class to define generic aircraft attributes. Uses public access modifier
public class Aircraft {
    //Private fields to enforce encapsulation of sensitive data
    private final String make;
    private final double totalCapacity;
    private final int crewCapacity;
    private final boolean isInternational;
    private final boolean isActive;
    private final int maxSpeed;

    //Getters and setters to allow user to update private fields and read from them
    public String getMake() {
        return make;
    }
    //
    public double getTotalCapacity() {
        return totalCapacity;
    }
    //
    public int getCrewCapacity() {
        return crewCapacity;
    }
    //
    public boolean getIsInternational() {
        return isInternational;
    }
    //
    public boolean getIsActive() {
        return isActive;
    }
    //
    public int getMaxSpeed() {
        return maxSpeed;
    }
    //
    //constructor
    Aircraft(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
        this.make = make;
        this.totalCapacity = totalCapacity;
        this.crewCapacity = crewCapacity;
        this.isInternational = isInternational;
        this.isActive = isActive;
        this.maxSpeed = maxSpeed;
    }
    //
     final public void displayMaintainedAircraft() {
        if (isActive) {
            System.out.println(getMake()+" is in active service.");
            System.out.println("Here is its information: ");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Total capacity: "+getTotalCapacity());
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Crew capacity: "+getCrewCapacity());
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("International status: "+getIsInternational());
            System.out.println("-----------------------------------------------------------------------------");

        } else {
            System.out.println(getMake()+" is not in active service. Can't display information for now.");
        }
        }
    //Method to use for overriding.
    public void isFlying() {
        System.out.println("This plane: "+getMake()+" is currently in flight to [domestic/international]! Check FlightRadar.com to check its course.");
    }
}