package Destinations;
import java.util.Scanner;

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

    public void destinationAdditionRequest(String destinationCountry, String destinationCity) {
        System.out.println("Send us a Request to add a new dream country and city for our next update on available destinations: ");
        Scanner additionReq1 = new Scanner(System.in);
        System.out.println("Enter country:");
        destinationCountry = additionReq1.nextLine();
        Scanner additionReq2 = new Scanner(System.in);
        System.out.println("Enter city:");
        destinationCity = additionReq2.nextLine();

        String[] requestStore = {destinationCountry,destinationCity};
        System.out.println("Your choice:");
        for(String request:requestStore) {
            System.out.println(request);
        }
    }

    public void destinationAdditionRequest(int proposedPrice) {
        System.out.println("Send us a pricing proposal(in $) for our future domestic flights. The price must be above $40: ");
        Scanner additionReq1 = new Scanner(System.in);
        System.out.println("Enter country:");
        proposedPrice = additionReq1.nextInt();
        int[] priceRequestStore = {};
        if (proposedPrice<40) {
            System.out.println("Invalid price, the request will not be logged.");
        } else {
            priceRequestStore = new int[]{proposedPrice};
            System.out.println("Your choice: "+priceRequestStore[0]);
        }
    }
}
