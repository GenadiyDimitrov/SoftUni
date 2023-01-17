package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
13. Refactor Sum of Odd Numbers
You are assigned to find and fix the bugs in an existing piece of code, using the debugger.
You should trace the program execution to find the lines of code that produce incorrect or unexpected results.

You are given a program (existing source code) that prints the next n odd numbers (starting from 1) and on the last row, prints the sum of them.

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 1;
        for (int i = 0; i <= n; i++) {
        System.out.print(2 * i + 1);
        sum += 2 * i;
        }
        System.out.printf("Sum: %d%n", sum);
    }
*/
public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input - OK
        int n = Integer.parseInt(sc.nextLine());
        //The default sum must be 0 - Fixed
        int sum = 0;

        //The for loop should not include the input - Fixed
        for (int i = 0; i < n; i++) {
            //Getting the oddNumber and print - OK
            int oddNumber = (2 * i) + 1;
            System.out.println(oddNumber);

            //The sum must add the oddNumber - Fixed
            sum += oddNumber;

        }
        //Print the result - OK
        System.out.printf("Sum: %d", sum);
        sc.close();
    }
}
