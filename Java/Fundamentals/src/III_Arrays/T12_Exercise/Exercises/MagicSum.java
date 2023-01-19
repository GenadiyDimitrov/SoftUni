package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*8.	Magic Sum
Write a program that prints
all unique pairs in an array of integers
whose sum is equal to a given number.
*/
public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the int array
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int theSum = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            //current number just for beautify the code
            int currentNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                //next number just for beautify the code
                int nextNumber = array[j];
                //if the sum of the two numbers is equal to the inputtedSum
                if (currentNumber + nextNumber == theSum) {
                    //print the pair
                    System.out.printf("%d %d%n", currentNumber, nextNumber);
                }
            }
        }
        sc.close();
    }
}
