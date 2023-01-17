package VI_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*10. Special Numbers

A number is special when its sum of digits is 5, 7, or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number
and if it is special or not (True / False).*/
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.printf("%d -> %s%n", i, (sum == 5 || sum == 7 || sum == 11) ? "True" : "False");
        }
        sc.close();
    }
}
