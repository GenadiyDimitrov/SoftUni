package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*8.	Factorial Division
Read two integer numbers.
Calculate the factorial of each number.
Divide the first result by the second
and print the division formatted to the second decimal point.
*/
public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the two numbers
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        //get factorial for the two numbers
        long factorialA = getFact(a);
        long factorialB = getFact(b);
        //print the division
        System.out.printf("%.2f", (factorialA * 1.0) / (factorialB * 1.0));
        sc.close();
    }

    private static long getFact(int number) {
        //default fact
        long factorial = 1;
        //getting the factorial
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}
