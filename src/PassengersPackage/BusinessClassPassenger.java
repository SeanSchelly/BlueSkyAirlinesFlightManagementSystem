//Package imports
package PassengersPackage;
import java.util.InputMismatchException;
import java.util.Scanner;

//BusinessClassPassenger subclass, which inherits properties from a generic passenger. Uses public access modifier for universal access
public class BusinessClassPassenger extends Passenger {
    String seat_quality;
    boolean hasNetflixAccess;
    boolean sleepSupport;
    boolean extraMeals;
    boolean cocktailBarAccess;

    //BusinessClassPassenger parametrized constructor created to enable object creation, uses super keyword to refer to superclass fields
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
        if (passReInput.equals(setPass)) {
            System.out.println("Correct reentry, continue.");
        } else {
            while (!(passReInput.equals(setPass))) {
                System.out.println("You've not reentered the correct password. Please input it again to continue: ");
                anotherPasswordInput = new Scanner(System.in);
                setPass = getAccountPassword();
                passReInput = anotherPasswordInput.nextLine();
            }
        }
        try {
            Scanner flightMilesInput = new Scanner(System.in);
            System.out.println("Please enter the distance(KM) that you have flown with us this year to obtain your remaining flight miles(Premium Rate):");
            setFlightMiles((flightMilesInput.nextInt() * 1.25));
            System.out.println("Flight Miles Set.");
            System.out.println("----------------------------------------------------------------------------");
        } catch(InputMismatchException e) {
            System.out.println("Err: Wrong type of input! Rerun program and enter an integer when prompted.");
        }
    }

    //Defined abstract method from super class
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
        System.out.println("Flight duration: "+(Math.round(fD/fS))+"hrs.");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Please print this form or carry this digital copy with you as proof of registration on date of departure. BON VOYAGE!");
    }

    public void displayBenefits() {
        System.out.println("As a Business Class passenger, your benefits are as follows: ");
        //
        if (seat_quality.equals("Highest Standard")) {
            System.out.println("1. You have the highest standard seat.");
        } else {
            System.out.println("1. Your seat respects required standards.");
        }
        //
        if (hasNetflixAccess) {
            System.out.println("2. You have complete access of Netflix Premium Subscription.");
        } else {
            System.out.println("2. On-demand streaming services are unsupported for your plan.");
        }
        //
        if (sleepSupport) {
            System.out.println("3. Your polymorph seat has quality sleep support.");
        } else {
            System.out.println("3. You have retractable seat.");
        }
        //
        if (extraMeals) {
            System.out.println("4. You may request extra meals and snacks without extra cost.");
        } else {
            System.out.println("4. Your snack requests can't exceed quota of 4, and meals are served once.");
        }
    }
}
