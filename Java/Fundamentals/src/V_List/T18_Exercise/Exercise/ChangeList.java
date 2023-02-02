package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*2.	Change List
Write a program that reads a list of integers from the console and receives commands which manipulate the list.
Your program may receive the following commands:
•	Delete {element} - delete all elements in the array which are equal to the given element
•	Insert {element} {position} - insert element at the given position
You should stop the program when you receive the command "end".
Print all numbers in the array, separated with a single whitespace.
*/
public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the list
        List<Integer> list = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get initial command
        String command = sc.nextLine();
        //loop until end command
        while (!command.equals("end")) {
            //if command is add
            if (command.startsWith("Delete ")) {
                //get the item
                int element = Integer.parseInt(command.split(" ")[1]);
                list.removeIf(s -> s == element);
            } else if (command.startsWith("Insert ")) {
                //get the item
                int element = Integer.parseInt(command.split(" ")[1]);
                //get the index
                int index = Integer.parseInt(command.split(" ")[2]);
                list.add(index, element);
            }
            //get new command
            command = sc.nextLine();
        }
        //print result
        StringBuilder result = new StringBuilder();
        for (Integer passengers : list) {
            result.append(passengers).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
