package Destinations;

import AircraftPackage.DomesticAirliner;

public class DomesticDestination extends Destination {
    public DomesticDestination(String cityName, double distance, boolean isAvailable, boolean isInternational) {
        super(cityName, distance, isAvailable, isInternational);
    }
}
