package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
11. Multiplication Table 2.0
Rewrite your MultiplicationTable program so it can receive the multiplier from the console.
Print the table from the given multiplier to 10.
If the given multiplier is more than 10 - print only one row with the integer,
the given multiplier, and the product.

-Output
Print every row of the table in the following format:
{theInteger} X {times} = {product}
-Constraints
· The integer will be in the interval [1…100]*/
public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        int mult = Integer.parseInt(sc.nextLine());

        //If Multiplier is more than 10 print the single line
        if (mult > 10) {
            System.out.printf("%d X %d = %d%n", n, mult, n * mult);
        } else {
            //the Multiplication table
            for (int i = mult; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", n, i, n * i);
            }
        }
        sc.close();
    }
}
