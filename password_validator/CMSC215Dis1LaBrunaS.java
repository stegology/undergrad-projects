import java.util.Scanner;

/*
 * This program will ask the user to enter a password and then check if the password is valid.
 * The password is valid if it has at least 8 characters
 */

public class CMSC215Dis1LaBrunaS {

    // Main method prompting the user to enter a password then validating it
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        int attempts = 0;
        // Maximum number of attempts
        final int MAX_ATTEMPTS = 10;

        System.out.println("Welcome to the password validator!");
        System.out.println("Your password must meet the following criteria:");
        System.out.println("-Must be 6-10 characters in length \n-Must contain a letter \n-Must contain a number \n-Must NOT include whitespaces");

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Please enter a password: ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Invalid password. Please try again.");
                attempts++;
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Maximum attempts reached. Exiting program.");
        }

        scanner.close();

    }

    // Validate the password useing the MyCharacter class
    public static boolean isValidPassword(String password) {
        // check for length 6-10 chars
        if (password.length() < 6 || password.length() > 10) {
            return false;
        }

        // check for whitespace
        for (char c : password.toCharArray()) {
            if (MyCharacter.isWhitespace(c)) {
                return false;
            }
        }

            // Initialize boolean variables
            boolean hasLetter = false;
            boolean hasDigit = false;

            // Check if password has a letter and a digit
            for (char c: password.toCharArray()) {
                if (MyCharacter.isLetter(c)) {
                    hasLetter = true;
                }  
                if (MyCharacter.isDigit(c)) {
                    hasDigit = true;
                }
            }

            return hasLetter && hasDigit;
    }



    // Implementation of the Character class
    private static class MyCharacter {

        // Checks if the character is a letter
        public static boolean isLetter(char ch) {
            return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        }
        // Checks if the character is a digit
        public static boolean isDigit(char ch) {
            return (ch >= '0' && ch <= '9');
        }
        // Checks if the character is a whitespace
        public static boolean isWhitespace(char ch) {
            return ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r';
        }
    }
}
