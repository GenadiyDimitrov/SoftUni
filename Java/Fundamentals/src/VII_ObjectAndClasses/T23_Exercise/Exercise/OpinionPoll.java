package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*3.	Opinion Poll
Using the Person class,
write a program that reads from the console N lines
of personal information and then prints all people whose age is more than 30 years.
*/
public class OpinionPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of entries
        int rows = Integer.parseInt(sc.nextLine());
        //create list
        List<String> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            //get the person data
            String[] data = sc.nextLine().split(" ");
            //split data to variables
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            //if older than 30
            if (age > 30) {
                //add to poll list
                list.add(String.format("%s - %d", name, age));
            }
        }
        //print all result in list
        for (String row : list) {
            System.out.println(row);
        }
        sc.close();
    }
}
