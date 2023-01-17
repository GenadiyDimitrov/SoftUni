package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
4. Print and Sum
Write a program to display numbers from given start to given end and their sum.
All the numbers will be integers.
On the first line,
you will receive the start number,
on the second the end number.
*/
public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the inputs
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        //Default values
        int sum = 0;

        //For loop from start to end
        for (int i = start; i <= end; i++) {
            //to print  each number on the same row with space on the end
            System.out.printf("%d ", i);
            //and get the sum of all
            sum += i;
        }
        //Print the sum
        System.out.printf("\nSum: %d", sum);
        sc.close();
    }
}
