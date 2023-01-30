package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*10.	Top Number
Read an integer n from the console.
Find all top numbers in the range [1 … n] and print them.

A top number holds the following properties:
•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
•	Holds at least one odd digit, e.g. 232, 707, 87578.
*/
public class TopNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the number
        int number = Integer.parseInt(sc.nextLine());
        //foreach number from 17(because it's the first that satisfy the requirements) until the number
        for (int i = 17; i < number; i++) {
            //check if its top
            boolean isTop = isTopNumber(i);
            if (isTop) {
                //print
                System.out.println(i);
            }
        }
        sc.close();
    }

    private static boolean isTopNumber(int number) {
        //check if the sum of its digits are divisible by 8
        boolean isSumDivisible = isSumDivisibleByEight(number);
        //check if have atleast one odd digit
        boolean isAtLeastOneOdd = isAtLeastOneOddDigit(number);

        return isSumDivisible && isAtLeastOneOdd;
    }

    private static boolean isAtLeastOneOddDigit(int number) {
        //foreach digit
        while (number > 0) {
            //get last digit
            int digit = number % 10;
            //check if odd
            if (digit % 2 != 0) {
                //return true
                return true;
            }
            //update the number without the last digit
            number /= 10;
        }
        //else return false
        return false;
    }

    private static boolean isSumDivisibleByEight(int number) {
        //default sum
        int sum = 0;
        //foreach digit
        while (number > 0) {
            //add the last digit to the previous sum
            sum += number % 10;
            //update the number without the last digit
            number /= 10;
        }
        //check if sum can be divided by 8
        return sum % 8 == 0;
    }
}
