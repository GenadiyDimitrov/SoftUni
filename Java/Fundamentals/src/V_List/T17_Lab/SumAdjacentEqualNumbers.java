package V_List.T17_Lab;
/*1.	Sum Adjacent Equal Numbers
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
	After two numbers are summed,
    the obtained result could be equal to some of
    its neighbors and should be summed as well (see the examples below).
	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).
*/
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the double array to list
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        //for all elements until the last -1
        for (int i = 0; i < numbers.size() - 1; i++) {
            //get the current and next
            double firstNumber = numbers.get(i);
            double secondNumber = numbers.get(i + 1);
            //if both are equal
            if (firstNumber == secondNumber) {
                //remove the next
                numbers.remove(i + 1);
                //set the current to the sum of both (double the number or sum both or same number twice)
                numbers.set(i, firstNumber + secondNumber);
                //decrease the index by 2 ... because we are manipulation 2 numbers
                i -= 2;
                //check not to go to low
                if (i < -1) {
                    i = -1;
                }
            }
        }
        //print result
        StringBuilder result = new StringBuilder();
        for (Double d : numbers) {
            result.append(new DecimalFormat("0.#").format(d)).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
