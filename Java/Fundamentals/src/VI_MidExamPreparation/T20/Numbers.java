package VI_MidExamPreparation.T20;

import java.util.*;

/*3.	Numbers
Write a program to read a sequence of integers and find and print the top 5 numbers greater than the average value in the sequence, sorted in descending order.
Input
•	Read from the console a single line holding space-separated integers.
Output
•	Print the above-described numbers on a single line, space-separated.
•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
•	Print "No" if no numbers hold the above property.
Constraints
•	All input numbers are integers in the range [-1 000 000 … 1 000 000].
•	The count of numbers is in the range [1…10 000].
*/
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the numbers
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //calculate average
        double average = Arrays.stream(numbers).sum() * 1.0 / numbers.length;
        //get top numbers
        int[] topNumbers = Arrays.stream(numbers).filter(n -> n > average).toArray();
        //initialize string builder
        StringBuilder stringBuilder = new StringBuilder();
        //if there are top numbers
        if (topNumbers.length > 0) {
            //sort them (array cant reverse)
            Arrays.sort(topNumbers);
            //find end index
            int end = topNumbers.length - 5;
            //check if in bounds
            if (end < 0) end = 0;
            //for each (max of 5) top numbers
            for (int i = topNumbers.length - 1; i >= end; i--) {
                //append
                stringBuilder.append(topNumbers[i]).append(" ");
            }
        } else {
            //if no top numbers append
            stringBuilder.append("No");
        }
        //print
        System.out.println(stringBuilder);
        sc.close();
    }
}
