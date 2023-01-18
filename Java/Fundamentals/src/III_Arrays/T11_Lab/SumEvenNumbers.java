package III_Arrays.T11_Lab;

import java.util.Arrays;
import java.util.Scanner;

/*3.	Sum Even Numbers
Read an array from the console and sum only the even numbers.
*/
public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input =>
        //splitting it with 'space' and getting string array =>
        //converting the string array to stream =>
        //mapping and converting the string stream to int stream =>
        //converting to int array
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //initial sum
        int sum = 0;
        //for loop for all the numbers
        for (int number : numbers) {
            //getting only the even numbers
            if (number % 2 == 0) {
                //updating the sum
                sum += number;
            }
        }
        //printing the result
        System.out.println(sum);
        sc.close();
    }
}
