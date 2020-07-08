package ro.jademy.atm;

public class Operations {
    public static void checkBalance() {
        System.out.println("Current balance: " + ATM.accounts[ATM.currentIndex]);
    }

    public static void deposit() {
        System.out.println("Option deposit selected");
    }

    public static void withdraw() {
        System.out.println("Option withdraw selected");
    }
}
