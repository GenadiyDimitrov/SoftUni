package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
4. Back in 30 Minutes
Every time John tries to pay his bills,
he sees on the cash desk the sign: "I will be back in 30 minutes".
One day John was sick of waiting and decided he needed a program that prints the time after 30 minutes.
That way he won't have to wait at the desk and come at the appropriate time.
He gave the assignment to you, so you have to do it.

-Input
The input will be on two lines. On the first line, you will receive the hours, and on the second, you will receive the minutes.
-Output
Print on the console the time after 30 minutes. The result should be in the format "hh:mm". The hours have one or two numbers, and the minutes always have two numbers (with leading zero).
-Constraints
· The hours will be between 0 and 23.
· The minutes will be between 0 and 59.
*/
public class BackIn30Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int hours = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());
        //Adding 30 min to the iputed mins
        min += 30;
        //If minutes + 30 is grater than an hour - Add and hour and subtract 60min
        if (min >= 60) {
            hours += 1;
            min -= 60;
        }
        //If hours is more than a day subtract 24 hours
        if (hours >= 24) {
            hours -= 24;
        }

        //Print reuslt
        System.out.println(String.format("%d:%02d", hours, min));

        sc.close();
    }
}
