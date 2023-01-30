package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*9.	Palindrome Integers
A palindrome is a number that reads the same backward as forward,
such as 323 or 1001.
Write a program that reads a positive integer number until you receive "END".
For each numbered print,
whether the number is palindrome or not.
*/
public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the number or command
        String command = sc.nextLine();
        //loop until end command
        while (!command.equals("END")) {
            //check if number is palindrome
            boolean isPal = isPalindrome(command);
            //print true/false
            System.out.printf("%b%n".toLowerCase(), isPal);
            command = sc.nextLine();
        }
        sc.close();
    }

    private static boolean isPalindrome(String command) {
        //empty reverse default
        StringBuilder reverse = new StringBuilder();
        //for each in reverse
        for (int i = command.length() - 1; i >= 0; i--) {
            //add to reverse string
            reverse.append(command.charAt(i));
        }
        //is palindrome if the two are equal
        return reverse.toString().equals(command);
    }
}
