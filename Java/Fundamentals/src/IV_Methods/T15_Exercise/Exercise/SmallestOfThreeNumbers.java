package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*1.	Smallest of Three Numbers
Write a method to print the smallest of three integer numbers.
Use an appropriate name for the method.
*/
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get 3 numbers input
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        //compare two of 3
        int smallest = compare(a, b);
        //compare the smallest of the first two with the 3rd
        smallest = compare(smallest, c);
        //print
        System.out.println(smallest);
        sc.close();
    }

    public static int compare(int a, int b) {
        return Math.min(a, b);
    }
}
