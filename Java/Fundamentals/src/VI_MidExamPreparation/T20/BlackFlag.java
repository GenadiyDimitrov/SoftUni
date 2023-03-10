package VI_MidExamPreparation.T20;

import java.util.Scanner;

/*1.	Black Flag
Pirates are invading the sea, and you're tasked to help them plunder
Create a program that checks if target plunder is reached.
First, you will receive how many days the pirating lasts.
Then you will receive how much the pirates plunder for a day.
Last you will receive the expected plunder at the end.

Calculate how much plunder the pirates manage to gather.

Each day they gather the plunder.

Keep in mind that they attack more ships every third day
and add additional plunder to their total gain,
which is 50% of the daily plunder.

Every fifth day the pirates encounter a warship, and after the battle, they lose 30% of their total plunder.

If the gained plunder is more or equal to the target, print the following:
"Ahoy! {totalPlunder} plunder gained."

If the gained plunder is less than the target. Calculate the percentage left and print the following:
"Collected only {percentage}% of the plunder."

Both numbers should be formatted to the 2nd decimal place.

Input
•	On the 1st line, you will receive the days of the plunder – an integer number in the range [0…100000].
•	On the 2nd line, you will receive the daily plunder – an integer number in the range [0…50].
•	On the 3rd line, you will receive the expected plunder – a real number in the range [0.0…10000.0].
Output
•	 In the end, print whether the plunder was successful or not, following the format described above.
*/
public class BlackFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get days of plunder
        int days = Integer.parseInt(sc.nextLine());
        //get daily plunder
        int plunder = Integer.parseInt(sc.nextLine());
        //get expected result
        double expected = Double.parseDouble(sc.nextLine());
        //set initial plunder
        double currentPlunder = 0;
        //for each day
        for (int i = 1; i <= days; i++) {
            //add daily to total
            currentPlunder += plunder;
            //each 3 days loot additional 50%
            if (i % 3 == 0) currentPlunder += plunder * 1.0 / 2.0;
            //each 5 days lose 30%
            if (i % 5 == 0) currentPlunder *= 0.7;
        }
        //print result
        if (currentPlunder >= expected) {
            System.out.printf("Ahoy! %.2f plunder gained.%n", currentPlunder);
        } else {
            System.out.println("Collected only " + String.format("%.2f", currentPlunder / expected * 100.0) + "% of the plunder.");
        }
        sc.close();
    }
}
