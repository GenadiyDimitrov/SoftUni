package III_Arrays.T12_Exercise.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

//TODO UNDERSTAND!
/*4.	Longest Increasing Subsequence (LIS)
Read a list of integers and find the longest increasing subsequence (LIS).
If several such exist, print the leftmost.
*/
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input array
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //declaring variables
        int maxLength = 0;
        int lastIndex = 1;
        int[] lengthArray = new int[array.length];
        int[] previousIndexArray = new int[array.length];

        //for each number in the input array
        for (int i = 0; i < array.length; i++) {
            //set default positions values
            lengthArray[i] = 1;
            previousIndexArray[i] = -1;
            //declaring variable for beautify
            int currentNumber = array[i];
            //for each number in the same array
            for (int j = 0; j < i; j++) {
                //declaring variable for beautify
                int innerNumber = array[j];
                int innerPositionLengthPlusOne = lengthArray[j] + 1;
                //if the inner number is smaller than the current
                //and inner position length is equal or bigger than the current position length
                if (innerNumber < currentNumber && innerPositionLengthPlusOne > lengthArray[i]) {
                    //update the current position length to + 1
                    lengthArray[i] = innerPositionLengthPlusOne;
                    //and update the end index for the sequence
                    previousIndexArray[i] = j;
                }
            }
            //if current length is bigger than the max
            if (lengthArray[i] > maxLength) {
                //update variables
                maxLength = lengthArray[i];
                lastIndex = i;
            }
        }

        //creating new array
        int[] LIS = new int[maxLength];
        //getting last index
        int currentIndex = maxLength - 1;
        //while there is a count in previousIndexArray
        while (lastIndex != -1) {
            //update variables
            LIS[currentIndex] = array[lastIndex];
            currentIndex--;
            lastIndex = previousIndexArray[lastIndex];
        }
        //print the array
        for (int number : LIS) {
            System.out.printf("%d ", number);
        }
        sc.close();
    }
}
