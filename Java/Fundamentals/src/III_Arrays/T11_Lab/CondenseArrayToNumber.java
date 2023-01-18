package III_Arrays.T11_Lab;

import java.util.Arrays;
import java.util.Scanner;

/*7.	Condense Array to Number
Write a program to read an array of integers
and condense them by summing adjacent couples of elements
until a single integer is obtained.
For example, if we have 3 elements {2, 10, 3},
we sum the first two and the second two elements
and obtain {2+10, 10+3} = {12, 13},
then we sum again all adjacent elements and obtain {12+13} = {25}.
*/
public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //converting input to int array
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //while there are more than one number a sum can be done
        while (numbers.length > 1) {
            //generating array with length the original array - 1
            int[] condensed = new int[numbers.length - 1];
            //foreach number in original array
            for (int i = 0; i < numbers.length - 1; i++) {
                //sum the adjacent numbers
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            //override the original array to the new condensed one
            numbers = condensed;
        }
        //print the last single remaining sum
        System.out.println(numbers[0]);
        sc.close();
    }
}
