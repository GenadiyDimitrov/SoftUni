package V_BasicSyntax.T6_Exercise.MoreExercises;

import java.util.Scanner;

/*
2. English Name of the Last Digit
Write a method that returns the English name of the last digit of a given number.
Write a program that reads an integer and prints the returned value from this method.
*/
public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        //Get the last digit
        int lastDigit = n % 10;

        //print the English name for last digit
        switch (lastDigit) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        }


        sc.close();
    }
}
