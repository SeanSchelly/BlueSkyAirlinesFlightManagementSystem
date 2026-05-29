//Package imports
import AircraftPackage.*;
import PassengersPackage.*;
import Destinations.*;
import java.util.Scanner;

//Main Class with main method for running the core console-based management system
public class MainApp {
    public static void main(String[]args) {
        //Supported Aircraft demonstration, showing object creation. Demonstrates hierarchical inheritance
        Aircraft aircraft1 = new JumboJet("Boeing 747", 500, 12, true, true, 497);
        Aircraft aircraft2 = new TransoceanicAirliner("Boeing 777", 301, 12, true, true, 482);
        Aircraft aircraft3 = new DomesticAirliner("Boeing 737", 150, 7, false, true, 286);
        Aircraft aircraft4 = new DomesticAirliner("A320", 180, 6, false, false, 828);

        //Aircraft Data Structure, using Arrays and calling fields using objects previously created
        String[] aircraft_DataStore = {aircraft1.getMake(), aircraft2.getMake(), aircraft3.getMake()};

        //Supported Domestic Destinations, showing object creation. Demonstrates hierarchical inheritance
        Destination destination1 = new DomesticDestination("Hawassa", 114.7, true, false);
        Destination destination2 = new DomesticDestination("Bahir Dar", 179.8, true, false);

        //Supported International Destinations, showing object creation. Demonstrates hierarchical inheritance
        Destination destination3 = new InternationalDestination("Frankfurt", 2883.8, true, true, "Germany");
        Destination destination4 = new InternationalDestination("Seoul", 4969.8, true, true, "South Korea");
        Destination destination5 = new InternationalDestination("Singapore", 3924, true, true, "Singapore");
        Destination destination6 = new InternationalDestination("Nairobi", 625, true, true, "Kenya");
        Destination destination7 = new InternationalDestination("New York", 6054.4, true, true, "United States of America");

        //Destination Data Structure illustrating Array use with destination object fields being called
        String[] destination_DataStore = {destination1.cityName, destination2.cityName, destination3.cityName, destination4.cityName, destination5.cityName, destination6.cityName, destination7.cityName};

        //Already Registered Passengers showing object creation. Demonstrates inheritance and subclass referencing
        EconomyClassPassenger passenger1 = new EconomyClassPassenger("Berhanu", 29, "Twopeople12", 2.1, 1, 2);
        BusinessClassPassenger passenger2 = new BusinessClassPassenger("Wilhelm", 23, "Thatsgreat2", 3.5, 2, 3);
        EconomyClassPassenger passenger3 = new EconomyClassPassenger("Kebebush", 29, "Nahbruh7", 7.21, 2, 1);

        //New Passenger Registration
        Passenger passenger4 = new BusinessClassPassenger("", 0, "", 0.0, 0, 0);

        passenger4.register();
        //Destination Picker Options, using Array Indexing to pick out individual options
        System.out.println("Please pick your next destination:");
        System.out.println("1 - ".concat(destination_DataStore[0]));
        System.out.println("2 - ".concat(destination_DataStore[1]));
        System.out.println("3 - ".concat(destination_DataStore[2]));
        System.out.println("4 - ".concat(destination_DataStore[3]));
        System.out.println("5 - ".concat(destination_DataStore[4]));
        System.out.println("6 - ".concat(destination_DataStore[5]));
        System.out.println("7 - ".concat(destination_DataStore[6]));
        //Scanner being implemented to add input for switch case decision-making
        Scanner pickDestination = new Scanner(System.in);
        int newDestinationChoice = pickDestination.nextInt();
        //
        double flightDistance = 0;
        //
        //In the following, the chosen no. will be set as the destinationChoice field's value using the setter mutator.
        switch (newDestinationChoice) {
            case 1:
                passenger4.setDestinationChoice(1);
                System.out.println(destination_DataStore[0] + " logged.");
                flightDistance = destination1.distance;
                break;

            case 2:
                passenger4.setDestinationChoice(2);
                System.out.println(destination_DataStore[1] + " logged.");
                flightDistance = destination2.distance;
                break;

            case 3:
                passenger4.setDestinationChoice(3);
                System.out.println(destination_DataStore[2] + " logged.");
                flightDistance = destination3.distance;
                break;

            case 4:
                passenger4.setDestinationChoice(4);
                System.out.println(destination_DataStore[3] + " logged.");
                flightDistance = destination4.distance;
                break;

            case 5:
                passenger4.setDestinationChoice(5);
                System.out.println(destination_DataStore[4] + " logged.");
                flightDistance = destination5.distance;
                break;

            case 6:
                passenger4.setDestinationChoice(6);
                System.out.println(destination_DataStore[5] + " logged.");
                flightDistance = destination6.distance;
                break;

            case 7:
                passenger4.setDestinationChoice(7);
                System.out.println(destination_DataStore[6] + " logged.");
                flightDistance = destination7.distance;
                break;

            default:
                System.out.println("Invalid destination choice. Pick (1-7)");
                System.out.println("Rerun app.");
        }


        //Aircraft Picker with Aircraft objects being used to call, for display, respective fields
        System.out.println("Please pick from the available aircraft for your travel:");
        System.out.println("1 - ".concat(aircraft1.getMake()) + " with capacity " + aircraft1.getTotalCapacity() + "," + "with " + aircraft1.getCrewCapacity() + " crew.");
        System.out.println("2 - ".concat(aircraft2.getMake()) + " with capacity " + aircraft2.getTotalCapacity() + "," + "with " + aircraft2.getCrewCapacity() + " crew.");
        System.out.println("3 - ".concat(aircraft3.getMake()) + " with capacity " + aircraft3.getTotalCapacity() + "," + "with " + aircraft3.getCrewCapacity() + " crew.");
        System.out.println("4 - ");

        //Scanner implemented for input to record aircraft choice for flight details as an integer
        Scanner aircraftPicker = new Scanner(System.in);
        int choiceAircraft = aircraftPicker.nextInt();
        //
        //Following variable is declared outside local switch scope so its value (the max speed of the selected aircraft, can be used in flight duration calculation)
        int flightSpeed = 0;
        String chosenPlane = "";
        switch (choiceAircraft) {
            case 1:
                passenger4.setAirplaneChoice(1);
                System.out.println("Your choice(" + aircraft_DataStore[0] + ")" + " has been logged.");
                chosenPlane = aircraft_DataStore[0];
                flightSpeed = aircraft1.getMaxSpeed();
                break;
            case 2:
                passenger4.setAirplaneChoice(2);
                System.out.println("Your choice(" + aircraft_DataStore[1] + ")" + " has been logged.");
                chosenPlane = aircraft_DataStore[1];
                flightSpeed = aircraft2.getMaxSpeed();
                break;
            case 3:
                passenger4.setAirplaneChoice(3);
                System.out.println("Your choice(" + aircraft_DataStore[2] + ")" + " has been logged.");
                flightSpeed = aircraft3.getMaxSpeed();
                chosenPlane = aircraft_DataStore[2];
                break;
            default:
                System.out.println("Invalid choice. You must select between the available aircraft (1-3).");
                System.out.println("Rerun app.");
        }

        //Form details Display, takes 3 arguments, with the first two being used to calculate the flight duration (flightDistance/flightSpeed)
        passenger4.displayDetails(flightSpeed, flightDistance, chosenPlane);

        //Extra Scanner implementation to obtain input and provide additional functionality to the app (displaying flight logs, e.g., as demonstrated below)
        Scanner feedRequest = new Scanner(System.in);
        System.out.println("What to do now? Check out our flight feed to track current flights, or see which planes are available! (Input y or n to confirm)");
        String newFeedRequest = feedRequest.nextLine();
        if (newFeedRequest.equals("y")) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("En-route Aircraft: ");
            //aircraft 1,2,3 can call following method as isFlying() is an override.
            aircraft1.isFlying();
            aircraft2.isFlying();
            aircraft3.isFlying();
            System.out.println("-------------------------------------------------------");
            System.out.println("Available aircraft: ");
            //Following method being called is final, can't be inherited
            aircraft1.displayMaintainedAircraft();
            aircraft2.displayMaintainedAircraft();
            aircraft3.displayMaintainedAircraft();
            aircraft4.displayMaintainedAircraft();
        } else {
            System.out.println("In that case, please complete the following (It will help develop our future business model): ");
            Destination newDestination = new DomesticDestination("", 0.0, false, false);

            //Following illustrates compile-time polymorphism (method overloading) through the creation of a new destination request.
            newDestination.destinationAdditionRequest(50);
            newDestination.destinationAdditionRequest("Spain", "Milan");
        }

        passenger4.displayBenefits();
    }
}