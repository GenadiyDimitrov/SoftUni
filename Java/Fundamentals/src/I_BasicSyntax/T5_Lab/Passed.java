package I_BasicSyntax.T5_Lab;

import java.util.Scanner;
/*
2. Passed
Write a program that takes as an input a grade and
prints "Passed!" if the grade is equal or more than 3.00.

-Input
The input comes as a single floating-point number.
-Output
The output is either "Passed!" if the grade is equal or more than 3.00, otherwise, you should print nothing.
* */
public class Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        double grade = Double.parseDouble(sc.nextLine());


        //Check grade
        if (grade >= 3.0) {
            //Print result
            System.out.println("Passed!");
        }
        sc.close();
    }
}
