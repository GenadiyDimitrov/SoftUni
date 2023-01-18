package II_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*1. Integer Operations

Read four integer numbers.
Add first to the second,
divide (integer) the sum by the third number,
and multiply the result by the fourth number.
Print the result.

-Constraints
· The four numbers from the input are in the range [-2,147,483,648… 2,147,483,647].*/
public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read 4 integers
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        //add 1st and 2nd
        int result = a + b;
        //divide to 3d
        result /= c;
        //multiply by 4th
        result *= d;

        //print the result
        System.out.println(result);
        sc.close();
    }
}
