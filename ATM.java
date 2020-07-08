package ro.jademy.atm;

import java.util.Scanner;

public class ATM {
    public static String bankName = "Jademy";
    public static String[] userNames = {"user1", "user2", "user3"};
    public static String[] userPins = {"1234", "5678", "0000"};
    public static long[] accounts = {1000, 20000, 35000};
    public static Scanner scanner = new Scanner(System.in);
    public static int currentIndex = -1;

    public static void showGreeting() {
        System.out.println("| ----------------------------------------- |");
        System.out.println("|       Welcome to the bank of " + bankName + "       |");
        System.out.println("| ----------------------------------------- |");
        System.out.println("|                                           |");
    }

    public static int showLogin() {
        System.out.println("| ----------------------------------------- |");
        System.out.println("| Username:                                 |");
        String username = scanner.next();
        System.out.println("| PIN:                                      |");
        String pin = scanner.next();

        currentIndex = Auth.login(username, pin);
        return currentIndex;
    }

    public static void showMenu() {
        System.out.println("| ----------------------------------------- |");
        System.out.println("|                 OPERATIONS                |");
        System.out.println("| ----------------------------------------- |");
        System.out.println("|  1. SHOW BALANCE                          |");
        System.out.println("|  2. DEPOSIT                               |");
        System.out.println("|  3. WITHDRAW                              |");
        System.out.println("|  4. LOGOUT                                |");
        System.out.println("| ----------------------------------------- |");
        chooseOption();
    }

    public static void chooseOption() {
        System.out.print("Chose an option: ");
        int optionSelected = scanner.nextInt();

        switch (optionSelected) {
            case 1:
                Operations.checkBalance();
                showMenu();
                break;
            case 2:
                Operations.deposit();
                showMenu();
                break;
            case 3:
                Operations.withdraw();
                showMenu();
                break;
            case 4:
                Auth.logout();
                showGreeting();
                showLogin();
                break;
            default:
                System.out.println("Chose a correct option.");
        }
    }

}
