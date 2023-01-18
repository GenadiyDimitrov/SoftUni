package III_Arrays.T11_Lab;

import java.util.Scanner;

/*4.	Reverse an Array of Strings
Write a program to read an array of strings,
reverse it and print its elements.
The input consists of a sequence of space-separated strings.
Print the output on a single line (space separated).
*/
public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input and splitting it by 'space' to make String array
        String[] array = sc.nextLine().split(" ");
        //for all in the array in reverse
        for (int i = array.length - 1; i >= 0; i--) {
            //print the element
            System.out.printf("%s ", array[i]);
        }
        sc.close();
    }
}
