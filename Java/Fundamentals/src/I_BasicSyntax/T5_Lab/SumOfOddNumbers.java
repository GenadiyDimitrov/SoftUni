package I_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
9. Sum of Odd Numbers
Write a program that prints the next n odd numbers
(starting from 1) and
on the last row prints the sum of them.

-Input
On the first line, you will receive a number – n.
This number shows how many odd numbers you should print.
-Output
Print the next n odd numbers, starting from 1, separated by new lines.
On the last line, print the sum of these numbers.
-Constraints
· n will be in the interval [1…100]
*/
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        //Default values
        int odn = 1;
        int all = 0;
        for (int i = 0; i < n; i++) {
            //Print odd number
            System.out.println(odn);
            //Sum the odd number to the current sum
            all += odn;
            //Get the next odd number
            odn += 2;
        }

        //Print the sum
        System.out.printf("Sum: %d", all);
        sc.close();
    }
}
