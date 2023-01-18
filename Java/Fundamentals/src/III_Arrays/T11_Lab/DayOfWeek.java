package III_Arrays.T11_Lab;

import java.util.Scanner;

/*1.	Day of Week
Enter a day number
and print the day name (in English)
or "Invalid day!".
Use an array of strings.
*/
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //generating array
        String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //getting input
        int index = Integer.parseInt(sc.nextLine());
        //check if index is in range 1 to 7
        if (index >= 1 && index <= 7) {
            //print the day, but with index -1, to start from 0 from the array
            System.out.println(week[index - 1]);
        } else {
            //else print invalid
            System.out.println("Invalid day!");
        }
        sc.close();
    }
}
