package PassengersPackage;
import java.util.Scanner;

abstract class Passenger {
    String name;
    private String accountPassword;
    int age;
    double flightMiles;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void register();

    public String getAccountPassword() {
        return accountPassword;
    }
    public void setAccountPassword(String newAccountPassword) {
        this.accountPassword = newAccountPassword;
    }
}