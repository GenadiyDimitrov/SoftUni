package II_DataTypesAndVariable.T8_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

/*
3. Exact Sum of Real Numbers
Write a program to enter n numbers and calculate and print their exact sum (without rounding).
*/
public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of rows
        int n = Integer.parseInt(sc.nextLine());
        //default sum
        BigDecimal sum = BigDecimal.valueOf(0);
        //loop for all rows
        for (int i = 0; i < n; i++) {
            //get real number
            BigDecimal d = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));
            //add to current sum
            sum = sum.add(d);
        }
        //print sum
        System.out.print(removeTrailingZeroes(sum.toString()));
        sc.close();
    }

    public static String removeTrailingZeroes(String s) {
        int index;
        for (index = s.length() - 1; index >= 0; index--) {
            if (s.charAt(index) != '0' && s.charAt(index) != '.') {
                break;
            }
        }
        return s.substring(0, index + 1);
    }
}
