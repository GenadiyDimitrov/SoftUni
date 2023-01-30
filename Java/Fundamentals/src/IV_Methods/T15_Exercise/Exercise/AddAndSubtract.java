package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*5.	Add and Subtract
You will receive 3 integers.
Write a method sum to get the sum of the first two integers
and subtract the method that subtracts the third integer
from the result from the sum method.
*/
public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the three ints
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        //sum the first two
        int result = sum(a, b);
        //subtract the third from result
        result = subtract(result, c);
        //print
        System.out.println(result);
        sc.close();
    }

    private static int subtract(int result, int c) {
        return result - c;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
