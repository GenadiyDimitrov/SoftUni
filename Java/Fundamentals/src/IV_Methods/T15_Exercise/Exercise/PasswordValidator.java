package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*4.	Password Validator
Write a program that checks if a given password is valid. Password rules are:
•	6 – 10 characters (inclusive);
•	Consists only of letters and digits;
•	Have at least 2 digits.
If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule, print a message:
•	"Password must be between 6 and 10 characters";
•	"Password must consist only of letters and digits";
•	"Password must have at least 2 digits".
*/
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the password
        String password = sc.nextLine();
        //invoke methods to check the password
        boolean isValidLength = checkLength(password);
        boolean isValidLettersOrDigits = checkLettersOrDigits(password);
        boolean isValidContainsTwoDigits = checkContainsTwoDigits(password);
        //if all valid print valid
        if (isValidLength && isValidContainsTwoDigits && isValidLettersOrDigits) {
            System.out.println("Password is valid");
        }
        sc.close();
    }

    private static boolean checkContainsTwoDigits(String password) {
        //default flag for two digits
        boolean flag = false;
        //foreach char
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            //if char is digit
            if (Character.isDigit(c)) {
                //set flag to true if flase
                if (!flag) {
                    flag = true;
                } else {
                    //else we already have one digit so this is the second and return true
                    return true;
                }
            }
        }
        //else print error and return false
        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean checkLettersOrDigits(String password) {
        //foreach char
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            //if char is digit or letter do nothing
            if (!Character.isLetterOrDigit(c)) {
                //else print error and return false
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        //return false if all are letters and digits
        return true;
    }

    private static boolean checkLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        //else print error and return false
        System.out.println("Password must be between 6 and 10 characters");
        return false;
    }
}
