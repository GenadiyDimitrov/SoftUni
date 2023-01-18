package I_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
7. Theatre Promotions
A theatre is having a ticket sale,
but they need a program to calculate the price of a single ticket.
If the given age does not fit one of the categories,
you should print "Error!".
You can see the prices in the table below:

Day / Age   | 0 <= age <= 18 | 18 < age <= 64 | 64 < age <= 122
Weekday     |   12$          |   18$          |       12$
Weekend     |   15$          |   20$          |       15$
Holiday     |   5$           |   12$          |       10$

-Input
The input comes in two lines. On the first line, you will receive the type of day. On the second – is the age of the person.
-Output
Print the ticket price according to the table, or "Error!" if the age is not in the table.
-Constraints
· The age will be in the interval [-1000…1000].
· The type of day will always be valid.*/
public class TheatrePromotions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        String day = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        //Generate 2 dimensional array for the table
        int[][] table = {{12, 18, 12}, {15, 20, 15}, {5, 12, 10}};
        //Default indexes
        int r = -1;
        int c = -1;

        //Get the column index
        if (0 <= age && age <= 18) {
            c = 0;
        } else if (18 < age && age <= 64) {
            c = 1;
        } else if (64 < age && age <= 122) {
            c = 2;
        }
        //Get the row index
        switch (day) {
            case "Weekday":
                r = 0;
                break;
            case "Weekend":
                r = 1;
                break;
            case "Holiday":
                r = 2;
                break;
        }
        //if Indexes are valid print result otherwise print Error!
        if (r != -1 && c != -1) {
            System.out.printf("%d$", table[r][c]);
        } else {
            System.out.println("Error!");
        }
        sc.close();
    }
}
