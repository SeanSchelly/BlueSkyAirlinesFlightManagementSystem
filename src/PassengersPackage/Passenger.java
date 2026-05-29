//Package import
package PassengersPackage;

//Abstract Passenger super class to define generic passenger attributes. Uses public access modifier for universal access.
public abstract class Passenger {
    //Private fields to enforce encapsulation of sensitive data
    private String name;
    private String accountPassword;
    private int age;
    private double flightMiles;
    private int airplaneChoice;
    private int destinationChoice;

    //Passenger parametrized constructor created to allow for super() keyword referencing in inherited classes
    public Passenger(String name, String accountPassword, double flightMiles, int airplaneChoice, int destinationChoice, int age) {
        this.name = name;
        this.accountPassword = accountPassword;
        this.age = age;
        this.flightMiles = flightMiles;
        this.airplaneChoice = airplaneChoice;
        this.destinationChoice = destinationChoice;
    }
    //Abstract methods with empty bodies to hide complex functionality, defined in subclasses BusinessClassPassenger and EconomyClassPassenger
    public abstract void register();
    public abstract void displayDetails(int fS, double fD, String chosenAircraft);
    public abstract void displayBenefits();

    //Getters and setters to allow user to update private fields and read from them
    public String getName() {
        return name;
    }
    //
    public void setName(String newName) {
        this.name = newName;
    }
    //
    public int getAge() {
        return age;
    }
    //
    public void setAge (int newAge) {
        this.age = newAge;
    }
    //
    public double getFlightMiles() {
        return flightMiles;
    }
    //
    public void setFlightMiles(double newFlightMiles) {
        this.flightMiles = newFlightMiles;
    }
    //
    public String getAccountPassword() {
        return accountPassword;
    }
    //
    public void setAccountPassword(String newAccountPassword) {
        this.accountPassword = newAccountPassword;
    }
    //
    public int getAirplaneChoice() {
        return airplaneChoice;
    }
    //
    public void setAirplaneChoice(int newAirplaneChoice) {
        airplaneChoice = newAirplaneChoice;
    }
    //
    public int getDestinationChoice() {
        return destinationChoice;
    }
    //
    public void setDestinationChoice(int newDestinationChoice) {
        destinationChoice = newDestinationChoice;
    }
}