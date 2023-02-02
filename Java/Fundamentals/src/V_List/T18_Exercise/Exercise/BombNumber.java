package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*5.	Bomb Numbers
Write a program that reads a sequence of numbers and a special bomb number with a certain power.
Your task is to detonate every occurrence of the special bomb number
and according to its power - his neighbors from left and right.
Detonations are performed from left to right,
and all detonated numbers disappear.
Finally, print the sum of the remaining elements in the sequence.
*/
public class BombNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get list
        List<Integer> originalList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the bomb number and power array
        String[] specNumPower = sc.nextLine().split(" ");
        //get bomb number
        int specialNumber = Integer.parseInt(specNumPower[0]);
        //get power
        int power = Integer.parseInt(specNumPower[1]);
        //foreach element in list
        for (int i = 0; i < originalList.size(); i++) {
            //if the element is bomb number
            if (originalList.get(i) == specialNumber) {
                //get the first index to detonate
                int firstIndex = i - power;
                //check if in bounds
                if (firstIndex < 0) firstIndex = 0;
                //get last index to detonate
                int lastIndex = i + power;
                //check if in bounds
                if (lastIndex > originalList.size() - 1) lastIndex = originalList.size() - 1;
                //detonate each item from start to end index
                for (int j = firstIndex; j <= lastIndex; j++) {
                    originalList.set(j, 0);
                }
            }
        }
        //print result
        int sum = 0;
        for (Integer number : originalList) {
            sum += number;
        }
        System.out.println(sum);
        sc.close();
    }
}
