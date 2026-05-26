package Destinations;

public class Destination {
    String cityName;
    double distance;
    boolean isAvailable;
    boolean isInternational;
    int milesRequired;

    public Destination(String cityName, double distance, boolean isAvailable, boolean isInternational) {
        this.cityName = cityName;
        this.distance = distance;
        this.isAvailable = isAvailable;
        this.isInternational = isInternational;
    }
}
