package V_List.T17_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*7. Remove Negatives and Reverse
From list of integers:
1.remove all negative numbers
2.reverse it
3.print the result.
If no numbers exist in the list print empty*/
public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get list
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //remove all negative
        numbers.removeIf(n -> n < 0);
        //reverse it
        Collections.reverse(numbers);
        //print
        if (numbers.size() > 0) {
            //print result
            StringBuilder result = new StringBuilder();
            for (Integer number : numbers) {
                result.append(number).append(" ");
            }
            System.out.println(result);
        } else {
            System.out.println("empty");
        }
        sc.close();
    }
}
