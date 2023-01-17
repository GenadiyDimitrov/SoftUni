package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
1. Ages
Write a program that determines whether a person is based on the given age:
baby, child, teenager, adult, or elder.

The bounders are:
· 0-2 – baby;
· 3-13 – child;
· 14-19 – teenager;
· 20-65 – adult;
· >=66 – elder;

· All the values are inclusive.
*/
public class Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        //Checking ranges
        if (n < 3) {
            //Print result
            System.out.println("baby");
        } else if (n < 14) {
            //Print result
            System.out.println("child");
        } else if (n < 20) {
            //Print result
            System.out.println("teenager");
        } else if (n < 66) {
            //Print result
            System.out.println("adult");
        } else {
            //Print result
            System.out.println("elder");
        }
        sc.close();
    }
}
