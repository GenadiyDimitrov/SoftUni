package V_List.T18_Exercise.Exercise;

import java.util.*;
import java.util.stream.Collectors;

/*7.	Append Arrays
Write a program to append several arrays of numbers.
	Arrays are separated by "|".
	Values are separated by spaces (" ", one or several).
	Order the arrays from the last to the first and their values from left to right.
*/
public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the wierd string split by |
        List<String> arrays = Arrays.stream(sc.nextLine().split("\\|+")).collect(Collectors.toList());
        //create list for finished product
        List<List<Integer>> arraysInt = new ArrayList<>();
        //for each unfixed array
        for (String array : arrays) {
            //split it by space (one or more)
            String[] splitString = array.trim().split(" +");
            //create new array for int
            List<Integer> newArray = new ArrayList<>();
            for (String s : splitString) {
                //for each item in the string array
                try {
                    //test if int
                    int n = Integer.parseInt(s);
                    //add it to the int array
                    newArray.add(n);
                } catch (Exception ignored) {
                }
            }
            //add it in finished arrays
            if (newArray.size() > 0) arraysInt.add(newArray);
        }
        //reverse the collection
        Collections.reverse(arraysInt);
        StringBuilder result = new StringBuilder();
        //print
        for (List<Integer> array : arraysInt) {
            for (Integer n : array) {
                result.append(n).append(" ");
            }
        }
        System.out.println(result.toString().trim());
        sc.close();
    }
}
