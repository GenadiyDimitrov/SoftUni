package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*4.	List Operations
You will be given numbers (a list of integers) on the first input line.
Until you receive "End" you will be given operations you must apply on the list.

The possible commands are:
•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times

Note: The index given may be outside the array's bounds. In that case, print "Invalid index".
*/
public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the list
        List<Integer> originalList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the initial command
        String command = sc.nextLine();
        //loop until command equals end
        while (!command.equals("End")) {
            //Add {number}: add a number to the end of the list
            if (command.startsWith("Add ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //add to list
                originalList.add(number);
            }
            //Shift left {count} - first number becomes last 'count' times
            else if (command.startsWith("Shift left ")) {
                //get the number
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int item = originalList.get(0);
                    originalList.remove(0);
                    originalList.add(item);
                }
            }
            //Shift right {count} - last number becomes first 'count' times
            else if (command.startsWith("Shift right ")) {
                //get the number
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int item = originalList.get(originalList.size() - 1);
                    originalList.remove(originalList.size() - 1);
                    originalList.add(0, item);
                }
            }
            //Remove {number}: remove a number from the list
            else if (command.startsWith("Remove ")) {
                //get the number
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index < originalList.size()) {
                    //remove all that are equal to that number
                    originalList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            }
            //Insert {number} {index}: insert a number at a given index
            else if (command.startsWith("Insert ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //get the index
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < originalList.size()) {
                    //insert in list on the index spot
                    originalList.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            }

            command = sc.nextLine();
        }
        //print result
        StringBuilder result = new StringBuilder();
        for (Integer number : originalList) {
            result.append(number).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
