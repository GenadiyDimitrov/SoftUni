package V_List.T17_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*4.	List Manipulation Basics
Write a program that reads a list of integers.
Then until you receive "end",
you will be given different commands:
Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index

Note: All the indices will be valid!
When you receive the "end" command,
print the final state of the list (separated by spaces).
*/
public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the list
        List<Integer> originalList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the initial command
        String command = sc.nextLine();
        //loop until command equals end
        while (!command.equals("end")) {
            //Add {number}: add a number to the end of the list
            if (command.startsWith("Add ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //add to list
                originalList.add(number);
            }
            //RemoveAt {index}: remove a number at a given index
            else if (command.startsWith("RemoveAt ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //remove from list
                originalList.remove(number);
            }
            //Remove {number}: remove a number from the list
            else if (command.startsWith("Remove ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //remove all that are equal to that number
                originalList.removeIf(s -> s == number);
            }
            //Insert {number} {index}: insert a number at a given index
            else if (command.startsWith("Insert ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                //get the index
                int index = Integer.parseInt(command.split(" ")[2]);
                //insert in list on the index spot
                originalList.add(index, number);
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
