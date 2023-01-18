package III_Arrays.T11_Lab;

import java.util.Arrays;
import java.util.Scanner;

/*5.	Even and Odd Subtraction
Write a program that calculates the difference
between the sum of the even
and the sum of the odd numbers
in an array.
*/
public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input =>
        //splitting it with 'space' and getting string array =>
        //converting the string array to stream =>
        //mapping and converting the string stream to int stream =>
        //converting to int array
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //initial sums
        int oddSum = 0;
        int evenSum = 0;
        //for loop for all the numbers
        for (int number : numbers) {
            //getting only the even numbers
            if (number % 2 == 0) {
                //updating the evenSum
                evenSum += number;
            } else {
                //updating the oddSum
                oddSum += number;
            }
        }
        //printing the result
        System.out.println(evenSum - oddSum);
        sc.close();
    }
}
