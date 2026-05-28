package AircraftPackage;

public class JumboJet extends Aircraft {
    public JumboJet(String make, double totalCapacity, int crewCapacity, boolean isInternational, boolean isActive, int maxSpeed) {
        super(make, totalCapacity, crewCapacity, isInternational, isActive, maxSpeed);
    }
    @Override
    public void isFlying() {
        System.out.println("Aircraft: "+getMake()+" is currently in flight to an international destination! Check FlightRadar.com to check its full course.");
    }

}
