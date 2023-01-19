package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*7.	Max Sequence of Equal Elements
Write a program that finds
the longest sequence of equal elements
in an array of integers.
If several longest sequences exist, print the leftmost one.
*/
public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the int array
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //initializing variables
        int longestCount = 0;
        int theInteger = Integer.MIN_VALUE;
        //loop until the current number index is less than the length of array minus the longest count.
        //no point of continuing because there cant be longer count if no more positions in the array are left
        for (int i = 0; i < array.length - longestCount; i++) {
            //current number just for beautify the code
            int currentNumber = array[i];
            //initializing current count with 1, because even if there is no sequence the current number is count as one repetition
            int currentCount = 1;
            //loop from next number to the end of the array
            for (int j = i + 1; j < array.length; j++) {
                //next number just for beautify the code
                int nextNumber = array[j];
                //if the two numbers are equal
                if (currentNumber == nextNumber) {
                    //increase the current sequence count
                    currentCount++;
                }
                //otherwise we break, because is not a sequence if there is a different number in between
                else break;
            }
            //check ig we have a longer sequence from before
            if (longestCount < currentCount) {
                longestCount = currentCount;
                theInteger = currentNumber;
            }
        }
        //print the sequence
        for (int i = 0; i < longestCount; i++) {
            System.out.printf("%d ", theInteger);
        }

        sc.close();
    }
}
