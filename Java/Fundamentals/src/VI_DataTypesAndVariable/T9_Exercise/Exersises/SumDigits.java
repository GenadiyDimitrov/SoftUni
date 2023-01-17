package VI_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*2. Sum Digits

You will be given a single integer.
Your task is to find the sum of its digits.
*/
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input
        int n = Integer.parseInt(sc.nextLine());
        //default sum
        int sum = 0;
        //while we have digits
        while (n > 0) {
            //get last digit
            int lastDigit = n % 10;
            //add it to sum
            sum += lastDigit;
            //remove last digit
            n = n / 10;
        }
        //print the result
        System.out.println(sum);
        sc.close();
    }
}
