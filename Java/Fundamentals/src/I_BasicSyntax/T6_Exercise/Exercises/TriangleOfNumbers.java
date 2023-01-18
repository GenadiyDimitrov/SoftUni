package I_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
8. Triangle of Numbers
Write a program that receives a number – n and prints a triangle from 1 to n as in the examples.
-Constraints
· n will be in the interval [1...20].*/
public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the end number
        int n = Integer.parseInt(sc.nextLine());
        //row numbers count
        int count = 0;
        //loop from 1 to the end number
        for (int i = 1; i <= n; i++) {
            //print the end number
            System.out.printf("%d", i);
            //loop for all additional numbers to print on the same row
            for (int j = 0; j < count; j++) {
                //print the additional number
                System.out.printf(" %d", i);
            }
            //increase the additional numbers count for the next row
            count++;
            //go to next row
            System.out.printf("%n");
        }
        sc.close();
    }
}
