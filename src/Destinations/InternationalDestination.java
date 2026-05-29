package Destinations;

public class InternationalDestination extends Destination {
    String countryName;
    //InternationalDestination constructor
    public InternationalDestination(String cityName, double distance, boolean isAvailable, boolean isInternational, String countryName) {
        super(cityName, distance, isAvailable, isInternational);
        this.countryName = countryName;
    }
}
