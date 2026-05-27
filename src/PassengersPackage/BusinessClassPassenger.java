package PassengersPackage;

import java.util.Scanner;

public class BusinessClassPassenger extends Passenger {
    String seat_quality;
    boolean hasNetflixAccess;
    boolean sleepSupport;
    boolean extraMeals;
    boolean cocktailBarAccess;

    public BusinessClassPassenger(String name, int age, String accountPassword, double flightMiles, int airplaneChoice, int destinationChoice) {
        super(name, accountPassword, flightMiles, airplaneChoice, destinationChoice, age);
        this.hasNetflixAccess = true;
        this.sleepSupport = true;
        this.extraMeals = true;
        this.cocktailBarAccess = true;
        this.seat_quality = "Highest Standard";
    }

    public void register() {
        System.out.println("Welcome, to BlueSky Airlines.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Business Class Portal:");
        System.out.println("------------------------------------------------------------------------------------");
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameNew = nameInput.nextLine();
        setName(nameNew);
        System.out.println("Name Set.");
        System.out.println("------------------------------------------------------------------------------------");
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Please enter a new password to secure your account:");
        setAccountPassword(passwordInput.nextLine());
        System.out.println("Password Set.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Now, enter your password again to continue: ");
        Scanner anotherPasswordInput = new Scanner(System.in);
        String setPass = getAccountPassword();
        String passReInput = anotherPasswordInput.nextLine();
        while (true) {
            if (passReInput.equals(setPass)) {
                Scanner flightMilesInput = new Scanner(System.in);
                System.out.println("(Premium Rate)Please enter the distance that you have flown with us this year to obtain your remaining flight miles:");
                setFlightMiles((flightMilesInput.nextInt() * 3));
                System.out.println("Flight Miles Set.");
                System.out.println("--------------------------------------------------------------------------------");
                break;
            } else {
                System.out.println("Err: Incorrect Password, Rerun App.");
            }
        }
    }

    public void displayDetails() {
        System.out.println("Here Are your Final Details, "+getName()+getAge()+getAccountPassword()+getFlightMiles()+getAirplaneChoice()+getDestinationChoice());
        System.out.println("And your flight duration will be: ");
    };
}
