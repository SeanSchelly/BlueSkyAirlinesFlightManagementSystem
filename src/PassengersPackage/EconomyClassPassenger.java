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
        System.out.println("Welcome, to BlueSky Airlines.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Economy Class Portal:");
        System.out.println("------------------------------------------------------------------------------------");
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameNew = nameInput.nextLine();
        setName(nameNew);
        System.out.println("Name Set.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Please enter your age:");
        Scanner ageInput = new Scanner(System.in);
        int ageNew = ageInput.nextInt();
        setAge(ageNew);
        System.out.println("Age Set.");
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
                System.out.println("Please enter the distance that you have flown with us this year to obtain your remaining flight miles:");
                setFlightMiles((flightMilesInput.nextInt() * 0.25));
                System.out.println("Flight Miles Set.");
                System.out.println("----------------------------------------------------------------------------");
                break;
            } else {
                System.out.println("Err: Incorrect Password, Rerun App.");
            }
        }
    }

    public void displayDetails(int fS, double fD, String chosenAircraft) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Final Details:");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Name: "+ getName());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Age: "+getAge());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Password: "+getAccountPassword());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Flight miles: "+getFlightMiles());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Chosen Airplane of Transport: "+ chosenAircraft);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Flight duration: "+(fD/fS)+"hrs.");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Please print these details or carry this digital copy with you on date of departure. BON VOYAGE!");
    };

}