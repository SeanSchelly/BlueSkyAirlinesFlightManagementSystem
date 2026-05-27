import AircraftPackage.*;
import PassengersPackage.*;
import Destinations.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[]args) {
        //Actively Used Aircraft
        Aircraft aircraft1 = new JumboJet("Boeing 747", 500, 12, true, true, 497);
        Aircraft aircraft2 = new TransoceanicAirliner("Boeing 777", 301, 12, true, true, 482);
        Aircraft aircraft3 = new DomesticAirliner("Boeing 737", 150, 7, false, true, 286);

        //Aircraft Data Structure
        String[] aircraft_DataStore = {aircraft1.make, aircraft2.make, aircraft3.make};

        //Supported Domestic Destinations
        Destination destination1 = new DomesticDestination("Hawassa", 114.7, true, false);
        Destination destination2 = new DomesticDestination("Bahir Dar", 179.8, true, false);

        //Supported International Destinations
        Destination destination3 = new InternationalDestination("Frankfurt",  2883.8, true, true, "Germany");
        Destination destination4 = new InternationalDestination("Seoul",  4969.8, true, true, "South Korea");
        Destination destination5 = new InternationalDestination("Singapore",  3924, true, true, "Singapore");
        Destination destination6 = new InternationalDestination("Nairobi",  625, true, true, "Kenya");
        Destination destination7 = new InternationalDestination("United States of America",  6054.4, true, true, "New York");

        //Destination Data Structure
        String[] destination_DataStore = {destination1.cityName, destination2.cityName, destination3.cityName, destination4.cityName, destination5.cityName, destination6.cityName, destination7.cityName};

        //Already Registered Passengers
        EconomyClassPassenger passenger1 = new EconomyClassPassenger("Berhanu", 29, "Twopeople12", 2.1, 1, 2);
        BusinessClassPassenger passenger2 = new BusinessClassPassenger("Wilhelm", 23, "Thatsgreat2", 3.5, 2, 3);
        EconomyClassPassenger passenger3 = new EconomyClassPassenger("Kebebush", 29, "Nahbruh7", 7.21, 2, 1);

        //New Passenger Registration
        BusinessClassPassenger passenger4 = new BusinessClassPassenger("", 0, "", 0.0, 0, 0);
        passenger4.register();



        //Aircraft Picker
        System.out.println("Please pick from the available aircraft for your travel:");
        System.out.println("1 - ".concat(aircraft1.make)+" with capacity "+aircraft1.totalCapacity +"," +"with "+ aircraft1.crewCapacity +" crew."+" Your typical flight time in this aircraft would be: ");
        System.out.println("2 - ".concat(aircraft2.make)+" with capacity "+aircraft2.totalCapacity +"," +"with "+ aircraft2.crewCapacity +" crew."+" Your typical flight time in this aircraft would be: ");
        System.out.println("3 - ".concat(aircraft3.make)+" with capacity "+aircraft3.totalCapacity +"," +"with "+ aircraft3.crewCapacity +" crew."+" Your typical flight time in this aircraft would be: ");

        //Continuation
        Scanner aircraftPicker = new Scanner(System.in);
        int choiceAircraft = aircraftPicker.nextInt();
        switch(choiceAircraft) {
            case 1:
                System.out.println("Your choice("+aircraft_DataStore[0]+")"+" has been logged.");
                break;
            case 2:
                System.out.println("Your choice("+aircraft_DataStore[1]+")"+" has been logged.");
                break;
            case 3:
                System.out.println("Your choice("+aircraft_DataStore[2]+")"+" has been logged.");
                break;
            default:
                System.out.println("Invalid choice. You must select between the available aircraft (1-3).");
        }
    }
}