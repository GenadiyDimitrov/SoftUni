package III_Arrays.T12_Exercise.Exercises;

import java.util.Scanner;

/*2.	Common Elements
Write a program that prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
*/
public class CommonElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the arrays
        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");
        //generating the array with max length
        String[] duplicated = new String[Math.max(firstArray.length, secondArray.length)];
        //initial index
        int index = 0;
        //foreach item in the second
        for (String secondItem : secondArray) {
            //and first
            for (String firstItem : firstArray) {
                //if both items are equal
                if (firstItem.equals(secondItem)) {
                    //set the indexed duplicate
                    duplicated[index] = firstItem;
                    //and increase the index
                    index++;
                }
            }
        }
        //generate clean array with the length of all the valid positions in duplicated array
        String[] cleanArray = new String[index];
        //copy the duplicated to
        System.arraycopy(duplicated, 0, cleanArray, 0, index);
        //print the duplicated items on one row
        System.out.println(String.join(" ", cleanArray));
        sc.close();
    }
}
