package V_List.T17_Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*3.	Merging Lists
You are going to receive two lists with numbers.
Create a result list that contains the numbers from both of the lists.
The first element should be from the first list,
the second from the second list, and so on.
If the length of the two lists is not equal,
just add the remaining elements at the end of the list.
*/
public class MergeLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get the numbers
        List<Double> listOne = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        //get the numbers
        List<Double> listTwo = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        //create new empty list
        List<Double> newList = new ArrayList<>();
        //get the longest length
        int count = Math.max(listOne.size(), listTwo.size());
        //for each with the longest
        for (int i = 0; i < count; i++) {
            //check if in bounds of first list
            if (i < listOne.size()) {
                //add to new list
                newList.add(listOne.get(i));
            }
            //check if in bounds of second list
            if (i < listTwo.size()) {
                //add to new list
                newList.add(listTwo.get(i));
            }
        }
        //print result
        StringBuilder result = new StringBuilder();
        for (Double d : newList) {
            result.append(new DecimalFormat("0.#").format(d)).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
