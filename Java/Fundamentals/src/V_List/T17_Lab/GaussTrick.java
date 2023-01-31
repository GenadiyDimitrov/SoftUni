package V_List.T17_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*2.	Gauss' Trick
Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
*/
public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the numbers
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        //for each until last -1
        for (int i = 0; i < numbers.size() - 1; i++) {
            //get first and last number
            double first = numbers.get(i);
            double last = numbers.get(numbers.size() - 1);
            //sum and set it to the current index
            numbers.set(i, first + last);
            //remove last number
            numbers.remove(numbers.size() - 1);
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
