package EXAMS.MID;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*2. Numbers
You have number list to manipulate

-Input

*/
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the list
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());
        //get the initial command
        String command = sc.nextLine();
        //loop until command is Finish
        while (!command.equals("Finish")) {
            //split command to get parameters
            String[] commandParameters = command.split(" ");
            //type of manipulation
            String type = commandParameters[0];
            //first number
            int number = Integer.parseInt(commandParameters[1]);
            //for each manipulation execute (could be done with methods to invoke)
            switch (type) {
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == number) {
                            numbers.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(commandParameters[2]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == number) {
                            numbers.set(i, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) < number) {
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
            }
            command = sc.nextLine();
        }

        //print result
        StringBuilder result = new StringBuilder();
        for (Integer number : numbers) {
            result.append(number).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
