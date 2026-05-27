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
        System.out.println("Business Class Portal:");
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Please enter a new password to secure your account:");
        setAccountPassword(passwordInput.nextLine());
        System.out.println("Password Set.");
        System.out.println(getAccountPassword());
        System.out.println("Now, enter your password again to continue: ");
        Scanner anotherPasswordInput = new Scanner(System.in);
        String setPass = getAccountPassword();
        String passReInput = anotherPasswordInput.nextLine();
        if (passReInput.equals(setPass)) {
            Scanner flightMilesInput = new Scanner(System.in);
            System.out.println("Please enter the distance that you have flown with us this year to obtain your remaining flight miles:");
            setFlightMiles((flightMilesInput.nextInt()*0.25));
            System.out.println("Flight Miles Set.");
            System.out.println(getFlightMiles());
        } else {
            System.out.println("Incorrect re-entry. Can't continue registration. Restart app.");
        }
    }
}
