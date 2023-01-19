package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*5.	Top Integers
Write a program to find all the top integers in an array.
A top integer is an integer that is bigger than all the elements to its right.
*/
public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create int array from input
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //create string array for all the numbers
        String[] bigger = new String[array.length];
        //default index for the bigger array
        int index = 0;
        //for each number
        for (int i = 0; i < array.length; i++) {
            //flag
            boolean isBigger = true;
            //loop all the items in the array but start from next position
            for (int j = i + 1; j < array.length; j++) {
                //check if current number is smaller (equal or higher means the number is not bigger)
                if (array[i] <= array[j]) {
                    //if smaller break the cycle
                    isBigger = false;
                    break;
                }
            }
            //if the item is bigger than all on the right
            if (isBigger) {
                //add it to the array
                bigger[index] = String.valueOf(array[i]);
                //increase the bigger array index
                index++;
            }
        }
        //generate clean array with the length of all the valid positions in bigger array
        String[] cleanArray = new String[index];
        //copy the bigger to
        System.arraycopy(bigger, 0, cleanArray, 0, index);
        //print the bigger items on one row
        System.out.println(String.join(" ", cleanArray));
        sc.close();
    }
}
