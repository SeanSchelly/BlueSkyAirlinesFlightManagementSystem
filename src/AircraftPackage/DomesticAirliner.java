//Package import
package AircraftPackage;

public class DomesticAirliner extends Aircraft {
    //DomesticAirliner constructor
    public DomesticAirliner(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
        super(make, totalCapacity, crewCapacity, isInternational, isActive, maxSpeed);
    }

    //Implementation of method overriding
    @Override
    public void isFlying() {
        System.out.println("Aircraft: "+getMake()+" is currently in flight to a domestic destination! Check FlightRadar.com to check its full course.");
    }
}