package I_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
10. Multiplication Table
You will receive an integer as input from the console.
Print the 10 times table for this integer.

-Output
Print every row of the table in the following format:
{theInteger} X {times} = {product}
-Constraints
· The integer will be in the interval [1…100]*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());

        //For loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            //Print the result and multiplication
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
        sc.close();
    }
}
