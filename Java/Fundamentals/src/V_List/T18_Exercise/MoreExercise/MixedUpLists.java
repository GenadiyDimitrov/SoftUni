package V_List.T18_Exercise.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

/*4.	*Mixed Up Lists
Write a program that mixes up two lists by some rules.
You will receive two lines of input, each one being a list of numbers.

The mixing rules are:
•	Start from the beginning of the first list and the ending of the second.
•	Add element from the first and element from the second.
•	In the end, there will always be a list in which there are 2 elements remaining.
•	These elements will be the range of the elements you need to print.
•	Loop through the result list and take only the elements that fulfill the condition.
•	Print the elements ordered in ascending order and separated by a space.
*/
public class MixedUpLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get both list
        List<Integer> first = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //create empty
        List<Integer> full = new ArrayList<>();
        //initial range
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        //find the bigger list
        //take its first two ot last two elements
        //find min and max range
        if (first.size() > second.size()) {
            int a = first.get(first.size() - 1);
            first.remove(first.size() - 1);
            int b = first.get(first.size() - 1);
            first.remove(first.size() - 1);
            min = Math.min(a, b);
            max = Math.max(a, b);
        } else if (first.size() < second.size()) {
            int a = second.get(0);
            second.remove(0);
            int b = second.get(0);
            second.remove(0);
            min = Math.min(a, b);
            max = Math.max(a, b);
        }
        //for each item in both lists
        //get current number
        //check if in range
        //add it to result List
        for (int i = 0; i < first.size(); i++) {
            int getFirst = first.get(i);
            if (getFirst > min && getFirst < max) {
                full.add(getFirst);
            }
            int getSecond = second.get(second.size() - 1 - i);
            if (getSecond > min && getSecond < max) {
                full.add(getSecond);
            }
        }
        //sort and print
        Collections.sort(full);
        StringBuilder result = new StringBuilder();
        for (Integer n : full) {
            result.append(n).append(" ");
        }
        System.out.println(result.toString().trim());
        sc.close();
    }
}
