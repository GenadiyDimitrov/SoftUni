package V_List.T17_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*5.	List Manipulation Advanced
Now we will implement more complicated list commands.

Again, read a list, and until you receive "end" read commands:
-Contains {number} – check if the list contains the number.
    If yes, print "Yes", otherwise, print "No such number"
-Print even – print all the numbers that are even separated by a space
-Print odd – print all the numbers that are oddly separated by a space
-Get sum – print the sum of all the numbers
-Filter {condition} {number} – print all the numbers that fulfill that condition.
    The condition will be either '<', '>', ">=", "<="

*/
public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the list
        List<Integer> originalList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the initial command
        String command = sc.nextLine();
        //loop until command equals end
        while (!command.equals("end")) {
            //Contains {number} – check if the list contains the number.If yes, print "Yes", otherwise, print "No such number"
            if (command.startsWith("Contains ")) {
                //get the number
                int number = Integer.parseInt(command.split(" ")[1]);
                System.out.println(originalList.contains(number) ? "Yes" : "No such number");
            }
            //Print even – print all the numbers that are even separated by a space
            else if (command.equals("Print even")) {
                List<Integer> newList = new ArrayList<>();
                for (Integer number : originalList) {
                    if (number % 2 == 0) {
                        newList.add(number);
                    }
                }
                //print result
                StringBuilder result = new StringBuilder();
                for (Integer n : newList) {
                    result.append(n).append(" ");
                }
                System.out.println(result);
            }
            //Print odd – print all the numbers that are oddly separated by a space
            else if (command.equals("Print odd")) {
                List<Integer> newList = new ArrayList<>();
                for (Integer number : originalList) {
                    if (number % 2 != 0) {
                        newList.add(number);
                    }
                }
                //print result
                StringBuilder result = new StringBuilder();
                for (Integer n : newList) {
                    result.append(n).append(" ");
                }
                System.out.println(result);
            }
            //Get sum – print the sum of all the numbers
            else if (command.equals("Get sum")) {
                Integer sum = 0;
                for (Integer number : originalList) {
                    sum += number;
                }
                System.out.println(sum);
            }
            //Filter {condition} {number} – print all the numbers that fulfill that condition.    The condition will be either '<', '>', ">=", "<="
            else if (command.startsWith("Filter ")) {
                //get condition
                String condition = command.split(" ")[1];
                //get the number
                int number = Integer.parseInt(command.split(" ")[2]);
                List<Integer> newList = new ArrayList<>();
                switch (condition) {
                    case "<":
                        for (Integer n : originalList) {
                            if (n < number) {
                                newList.add(n);
                            }
                        }
                        break;
                    case ">":
                        for (Integer n : originalList) {
                            if (n > number) {
                                newList.add(n);
                            }
                        }
                        break;
                    case "<=":
                        for (Integer n : originalList) {
                            if (n <= number) {
                                newList.add(n);
                            }
                        }
                        break;
                    case ">=":
                        for (Integer n : originalList) {
                            if (n >= number) {
                                newList.add(n);
                            }
                        }
                        break;
                }
                //print result
                StringBuilder result = new StringBuilder();
                for (Integer n : newList) {
                    result.append(n).append(" ");
                }
                System.out.println(result);
            }

            command = sc.nextLine();
        }
        sc.close();
    }
}
