package VI_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*9. *Spice Must Flow

Spice is Love, Spice is Life.
And most importantly, Spice must flow.
It must be extracted from the scorching sands of Arrakis,
under the constant threat of giant sandworms.
The Duke has tasked you with creating management software to make the work as efficient as possible.

Write a program that calculates the total amount of spice extracted from a source.
The source has a starting yield,
which indicates how much spice can be mined on the first day.
After it has been mined for a day,
the yield drops by 10,
meaning on the second day, it'll produce 10 less spice than on the first,
on the third day 10 less than on the second, and so on.
A source is considered profitable only while its yield is at least 100 –
when less than 100 spices are expected in a day, abandon the source.

The mining crew consumes 26 spices every day at the end of their shift
and an additional 26 after the mine has been exhausted.
Note that the workers cannot consume more spice than there is in storage.

When the operation is complete,
print on the console on two separate lines
how many days the mine has operated
and the total amount of spice extracted.

-Input
You will receive a number representing the starting yield of the source.

-Output
Print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.

Constraints
· The starting yield will be a positive integer within the range [0 … 2 147 483 647].*/
public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yield = Integer.parseInt(sc.nextLine());
        int days = 0;
        int produced = 0;
        while (yield >= 100) {
            //increase the work days
            days++;
            //gather all the resources
            produced += yield;
            //workers consume 26
            produced -= 26;
            //reduce the yield for next day
            yield -= 10;
        }
        //workers consume 26
        produced -= 26;
        //check if less than zero
        if (produced < 0) produced = 0;
        //print results
        System.out.println(days);
        System.out.println(produced);
        sc.close();
    }
}
