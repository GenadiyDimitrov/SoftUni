package V_BasicSyntax.T6_Exercise.MoreExercises;

import java.util.Scanner;

/*
4. Reverse String
Write a program that reverses a string and prints it on the console.
PS: Should be done with for loop
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

*/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the string
        String s = sc.nextLine();

        //Reverse
        String reverse = new StringBuilder(s).reverse().toString();

        //Print reverse
        System.out.println(reverse);
        sc.close();
    }
}
