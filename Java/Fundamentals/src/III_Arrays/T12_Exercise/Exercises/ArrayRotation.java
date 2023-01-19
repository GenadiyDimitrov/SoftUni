package III_Arrays.T12_Exercise.Exercises;

import java.util.Scanner;

/*4.	Array Rotation
Write a program that receives an array and the number of rotations you have to perform
(the first element goes at the end).
Print the resulting array.
*/
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the array
        String[] array = sc.nextLine().split(" ");
        //get the number of rotations
        int rotations = Integer.parseInt(sc.nextLine());
        //each array length resets the array
        //if array of 4 elements is rotated 4 time the new and original array will be the same
        //rotations should always be less than the array length
        while (rotations > array.length) rotations -= array.length;
        //for each rotation
        for (int i = 0; i < rotations; i++) {
            //create the same length array as original
            String[] newArray = new String[array.length];
            //all items in the original array except the first are placed in the new array (new array last spot is empty)
            System.arraycopy(array, 1, newArray, 0, array.length - 1);
            //fill last spot of new array with first item of original array
            newArray[array.length - 1] = array[0];
            //override the original with the new array
            array = newArray;
        }
        //print the array
        System.out.println(String.join(" ", array));

        sc.close();
    }
}
