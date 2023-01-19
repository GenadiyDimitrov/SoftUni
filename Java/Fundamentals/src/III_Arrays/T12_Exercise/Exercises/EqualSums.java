package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*6.	Equal Sums
Write a program that determines
if an element exists in the array
such that the sum of the elements
on its left is equal to the sum of the elements on its right.

If there are no elements to the left/right, their sum is considered to be 0.
Print the index that satisfies the required condition
or "no" if there is no such index.
*/
public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String index = "no";
        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = array.length - 1; j > i; j--) {
                rightSum += array[j];
            }
            if (leftSum == rightSum) {
                index = String.valueOf(i);
            }
        }
        System.out.println(index);
        sc.close();
    }
}
