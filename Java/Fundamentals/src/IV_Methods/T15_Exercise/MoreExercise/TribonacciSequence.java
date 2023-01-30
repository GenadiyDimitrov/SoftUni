package IV_Methods.T15_Exercise.MoreExercise;

import java.util.Scanner;

/*4.	Tribonacci Sequence
In the "Tribonacci" sequence,
every number is formed by the sum of the previous 3.
You are given a number num.
Write a program that prints num numbers from the Tribonacci sequence,
each on a new line, starting from 1.
The input comes as a parameter named num.
The value num will always be a positive integer.
*/
public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of iterations
        int n = Integer.parseInt(sc.nextLine());
        //default last 3 sums
        int sum = 1;
        int sum1 = 0;
        int sum2 = 0;
        //for all the iterations
        for (int i = 0; i < n; i++) {
            //get the new sum
            int newSum = sum + sum1 + sum2;
            //print the new sum
            System.out.printf("%d ", newSum);

            //update the sums for next iteration
            sum = sum1;
            sum1 = sum2;
            sum2 = newSum;
        }
        sc.close();
    }
}
