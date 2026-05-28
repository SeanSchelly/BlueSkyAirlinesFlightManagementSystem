package Destinations;

import AircraftPackage.DomesticAirliner;

public class DomesticDestination extends Destination {
    boolean hasShorterFlightDuration;
    boolean isCheaper;
    public DomesticDestination(String cityName, double distance, boolean isAvailable, boolean isInternational) {
        super(cityName, distance, isAvailable, isInternational);
        this.hasShorterFlightDuration = true;
        this.isCheaper = true;
    }
}
