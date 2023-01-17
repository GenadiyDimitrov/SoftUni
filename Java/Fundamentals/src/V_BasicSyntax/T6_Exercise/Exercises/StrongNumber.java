package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
6. Strong Number
Write a program to check whether a given number is strong.
A number is strong if the sum of the Factorial of each digit is equal to the number.
For example 145 is a strong number, because 1! + 4! + 5! = 145.
Print "yes" if the number is strong
and "no" if the number is not.

PS: easier with Variant - 2
*/
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the number
        int n = Integer.parseInt(sc.nextLine());
        //Printing the result (Chose variant of solution)

//        System.out.println(Variant1(n) ? "yes" : "no");
        System.out.println(Variant2(n) ? "yes" : "no");

        sc.close();
    }

    public static boolean Variant1(int n) {
        //Get the string of the number
        String nString = String.format("%d", n);
        //Get each character as string
        String[] letters = nString.split("");
        //the sum of factorials
        int all = 0;
        //loop each character
        for (String letter : letters) {
            //convert the char to int
            int number = Integer.parseInt(letter);
            //default fact
            long factorial = 1;
            //getting the factorial
            for (int i = 1; i <= number; ++i) {
                factorial *= i;
            }
            //adding it to the sum
            all += factorial;
        }

        //check if the number is strong
        return n == all;
    }

    public static boolean Variant2(int n) {
        int mainNumber = n;
        //the sum of factorials
        int all = 0;
        while (n > 0) {
            //Get the last digit of the number
            int lastDigit = n % 10;
            //default fact
            long factorial = 1;
            //getting the factorial
            for (int i = 1; i <= lastDigit; ++i) {
                factorial *= i;
            }
            //adding it to the sum
            all += factorial;
            //Remove the lastDigit
            n = n / 10;
        }

        //check if the number is strong
        return mainNumber == all;
    }

}
