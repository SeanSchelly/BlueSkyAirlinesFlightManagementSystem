package PassengersPackage;
import java.util.Scanner;

public class EconomyClassPassenger extends Passenger {
    String seat_quality;
    boolean hasNetflixAccess;
    boolean sleepSupport;
    boolean extraMeals;
    boolean cocktailBarAccess;
    boolean tvAccess;

    public EconomyClassPassenger(String name, int age, String accountPassword, double flightMiles, int airplaneChoice, int destinationChoice) {
        super(name, accountPassword, flightMiles, airplaneChoice, destinationChoice, age);
        this.seat_quality = "Required Standard";
        this.hasNetflixAccess = false;
        this.sleepSupport = false;
        this.cocktailBarAccess = false;
        this.extraMeals = false;
        this.tvAccess = true;
    }

    public void register() {

        System.out.println("Economy Class Portal:");
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