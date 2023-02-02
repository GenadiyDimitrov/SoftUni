package V_List.T18_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*3.	House Party
Write a program that keeps track of guests going to a house party.
On the first input line, you are going to receive how many commands you are going to have. On the next lines you are going to receive some of the following inputs:
•	"{name} is going!"
•	"{name} is not going!"
If you receive the first type of input, you have to add the person if he/she is not on the list. If he/she is in the list, print on the console: "{name} is already in the list!". If you receive the second type of input, you must remove the person if he/she is on the list. If not, print: "{name} is not in the list!". In the end, print all guests.
*/
public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of commands
        int n = Integer.parseInt(sc.nextLine());
        //create empty list
        List<String> guests = new ArrayList<>();
        //for al number of commands
        for (int i = 0; i < n; i++) {
            //get command
            String command = sc.nextLine();
            //if person is going
            if (command.endsWith(" is going!")) {
                //get name
                String name = command.split(" ")[0];
                //check if in list
                if (guests.contains(name)) {
                    //already in list
                    System.out.println(name + " is already in the list!");
                } else {
                    //ad to list
                    guests.add(name);
                }
            }
            //if person is not going
            else if (command.endsWith(" is not going!")) {
                //get name
                String name = command.split(" ")[0];
                //check if in list
                if (!guests.contains(name)) {
                    //not in list
                    System.out.println(name + " is not in the list!");
                } else {
                    //remove from list
                    guests.remove(name);
                }
            }
        }
        //print
        for (String guest : guests) {
            System.out.println(guest);
        }
        sc.close();
    }
}
