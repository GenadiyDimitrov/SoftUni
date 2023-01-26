package IV_Methods.T14_Lab;

import java.util.Scanner;
/*10.	Multiply Evens by Odds
Create a program that reads an integer number
and multiplies the sum of all its even digits
by the sum of all its odd digits
*/
public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the absolute value of the input number
        int number = Math.abs(Integer.parseInt(sc.nextLine()));
        //could be done in one method:
        //invoke to get only the Even sum
        int evenSum = getEvenSum(number);
        //invoke to get only the Odd sum
        int oddSum = getOddSum(number);
        //multiply the two results
        int result = evenSum * oddSum;
        //print
        System.out.println(result);
        sc.close();
    }

    private static int getOddSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    private static int getEvenSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
