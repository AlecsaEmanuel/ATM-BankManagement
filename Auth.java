package ro.jademy.atm;

public class Auth {
    public static int login(String userName, String pin) {
        int index = -1;
        for (int i = 0; i < ATM.userNames.length; i++){
            if (ATM.userNames[i].equals(userName) && ATM.userPins[i].equals(pin)){
                index = i;
            }
        }
        return index;
    }

    public static void logout() {
        ATM.currentIndex = -1;
        System.out.println("Option logout selected");
    }
}
