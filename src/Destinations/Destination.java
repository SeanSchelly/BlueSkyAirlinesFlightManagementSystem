package Destinations;

public class Destination {
    public String cityName;
    public double distance;
    public boolean isAvailable;
    public boolean isInternational;

    public Destination(String cityName, double distance, boolean isAvailable, boolean isInternational) {
        this.cityName = cityName;
        this.distance = distance;
        this.isAvailable = isAvailable;
        this.isInternational = isInternational;
    }
}
