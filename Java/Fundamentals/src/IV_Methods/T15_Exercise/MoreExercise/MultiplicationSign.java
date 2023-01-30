package IV_Methods.T15_Exercise.MoreExercise;

import java.util.Scanner;

/*5.	Multiplication Sign
You are given a number num1, num2, and num3.
Write a program that finds if num1 * num2 * num3 (the product) is negative, positive, or zero.
Try to do this WITHOUT multiplying the 3 numbers.
*/
public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the three integers
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        //if any one is 0 the result is 0
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("zero");
        } else {
            //if one is negative set true
            boolean negative = a < 0;
            //if second is negative if the previous is negative then its positive else negative
            if (b < 0) negative = !negative;
            //if third is negative if the previous is negative then its positive else negative
            if (c < 0) negative = !negative;
            //print
            System.out.println(negative ? "negative" : "positive");
        }

        sc.close();
    }
}
