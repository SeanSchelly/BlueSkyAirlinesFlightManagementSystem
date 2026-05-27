package AircraftPackage;

public class DomesticAirliner extends Aircraft {
    public DomesticAirliner(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
        super(make, totalCapacity, crewCapacity, isInternational, isActive, maxSpeed);
    }

    @Override
    public void isFlying() {
        System.out.println("Aircraft: "+make+" is currently in flight to a domestic destination! Check FlightRadar.com to check its full course.");
    }
}