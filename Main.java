import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String user;
    public static String pin;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //user id and pin login and logout
        //choose between see balance, put money or withdraw

        Scanner sc = new Scanner(System.in);
        String[] users = {"user1", "user2", "user3"};
        String[] pin = new String[]{"1234", "5678", "0000"};
        int[] money = new int[]{20000, 25000, 48000};

        System.out.println("Please login");
        login();
        System.out.println("What's your decision");
        int decision = sc.nextInt();
        switch (decision) {
            case 1 -> checkBalance(users, pin, money);
            case 2 -> putMoney(users, pin, money);
            case 3 -> withdraw(users, pin, money);
            default -> System.out.println("Bye bye");
        }


    }

    public static void input() {
        // ------------------------
        //||      1.Balance       ||
        //||      2.Put money     ||
        //||      3.Withdraw      ||
        //||      4.logout        ||

        System.out.println("Welcome to the bank of Jademy ");
        System.out.println("-----------------------");
        System.out.printf("%s", "||1.Balance\n");
        System.out.printf("%s", "||2.Put money\n");
        System.out.printf("%s", "||3.Withdraw\n");
        System.out.printf("%s", "||4.Logout\n");
    }

    public static void login() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter user: ");
        user = sc.next();
        System.out.println("Enter pin: ");
        pin = sc.next();
    }

    public static void checkBalance(String[] users, String[] pins, int[] money) {

        for (int i = 0; i < users.length; i++)
            if (user.equals(users[i]) && pin.equals(pins[i])) {
                System.out.println("You have " + money[i]);
            } else {
                System.out.println("You entered a wrong pin");
            }
    }

    public static void putMoney(String[] users, String[] pins, int[] money) {

        if (user.equals(users[user.indexOf(user)]) && pin.equals(pins[pin.indexOf(pin)])) {
            System.out.println("How much money do you want to put?");
            int amount = sc.nextInt();
            money[Arrays.asList(users).indexOf(user)] += amount;
            System.out.println("You have " + money[Arrays.asList(users).indexOf(user)] + " euro");

        } else {
            System.out.println("You entered a wrong pin");

        }
    }

    public static void withdraw(String[] users, String[] pins, int[] money) {

        ArrayList<String> al = new ArrayList<>();

        if (user.equals(users[0]) && pin.equals(pins[0])) {
            System.out.println("How much money do you want to withdraw?");
            int amount = sc.nextInt();
            money[0] += amount;
            System.out.println("You have " + money[Arrays.asList(users).indexOf(user)] + " euro");

        } else if (user.equals(users[1]) && pin.equals(pins[1])) {
            System.out.println("How much money do you want to withdraw?");
            int amount = sc.nextInt();
            money[0] += amount;
            System.out.println("You have " + money[Arrays.asList(users).indexOf(user)] + " euro");
        }
        if (user.equals(users[2]) && pin.equals(pins[2])) {
            System.out.println("How much money do you want to withdraw?");
            int amount = sc.nextInt();
            money[0] += amount;
            System.out.println("You have " + money[Arrays.asList(users).indexOf(user)] + " euro");
        } else {
            System.out.println("You entered a wrong pin");

        }

    }
}
