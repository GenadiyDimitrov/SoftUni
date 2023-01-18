package II_DataTypesAndVariable.T9_Exercise.MoreExersises;

import java.util.Scanner;

/*3. Floating Equality

Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001.
Note that we cannot directly compare two floating-point numbers a and b by a==b because of the nature of the floating-point arithmetic.
Therefore, we assume two numbers are equal if they are closer to each other than some fixed constant eps.

You will receive two lines, each containing a floating-point number.
Your task is to compare the values of the two numbers.*/
public class FloatingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting input
        double one = Double.parseDouble(sc.nextLine());
        double two = Double.parseDouble(sc.nextLine());
        //default tolerance for difference
        double tolerance = 0.000001;
        //checking difference
        if (Math.abs(one - two) > tolerance) {
            //if different
            System.out.println("False");
        } else {
            //if equal in tolerance
            System.out.println("True");
        }
        sc.close();
    }
}
