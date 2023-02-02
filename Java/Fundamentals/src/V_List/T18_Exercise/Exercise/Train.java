package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*1.	Train
On the first line, you will be given a list of wagons (integers).
Each integer represents the number of passengers that are currently in each wagon.
On the next line, you will get the max capacity of each wagon (single integer).

Until you receive "end" you will be given two types of input:
•	Add {passengers} - add a wagon to the end with the given number of passengers
•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
In the end, print the final state of the train (all the wagons separated by a space)
*/
public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the train
        List<Integer> train = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get max cap
        int maxCapacity = Integer.parseInt(sc.nextLine());
        //get initial command
        String command = sc.nextLine();
        //loop until end command
        while (!command.equals("end")) {
            //if command is add
            if (command.startsWith("Add ")) {
                //add to the end new wagon with passengers
                train.add(Integer.parseInt(command.split(" ")[1]));
            } else {
                try {
                    //get passengers
                    int passengers = Integer.parseInt(command);
                    //start from 1st wagon and try to put all inside
                    for (int i = 0; i < train.size(); i++) {
                        //if there is free space
                        if (train.get(i) < maxCapacity) {
                            //get the new count
                            int newP = train.get(i) + passengers;
                            //if enough space
                            if (newP <= maxCapacity) {
                                //put all inside
                                train.set(i, newP);
                                //break cycle no point in checking other wagons
                                break;
                            }
                        }
                    }
                } catch (Exception ignored) {

                }
            }
            //get new command
            command = sc.nextLine();
        }
        //print result
        StringBuilder result = new StringBuilder();
        for (Integer passengers : train) {
            result.append(passengers).append(" ");
        }
        System.out.println(result);
        sc.close();
    }
}
