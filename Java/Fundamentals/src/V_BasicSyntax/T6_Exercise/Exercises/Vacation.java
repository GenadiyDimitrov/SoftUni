package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
3. Vacation
You are given a group of people, type of the group, on which day of the week they will stay. Based on that information, calculate how much they must pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.

         | Friday | Saturday | Sunday
Students |  8.45  |  9.80    | 10.46
Business |  10.90 |  15.60   | 16
Regular  |  15    |  20      | 22.50

There are also discounts based on some conditions:
· Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
· Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
· Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%

You should reduce the prices in that EXACT order.
*/
public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        String t = sc.nextLine();
        String d = sc.nextLine();

        //Two dimensional array for the table
        double[][] table = new double[][]{{8.45, 9.8, 10.46}, {10.9, 15.6, 16.0}, {15.0, 20.0, 22.5}};
        //Default indexes
        int r = -1;
        int c = -1;
        //Getting the row index
        switch (t) {
            case "Students":
                r = 0;
                break;
            case "Business":
                r = 1;
                break;
            case "Regular":
                r = 2;
                break;
        }
        //Getting the column index
        switch (d) {
            case "Friday":
                c = 0;
                break;
            case "Saturday":
                c = 1;
                break;
            case "Sunday":
                c = 2;
                break;
        }

        //If indexes are ok
        if (r != -1 && c != -1) {

            //Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
            if (n >= 100 && r == 1) {
                n -= 10;
            }

            //Calculating total
            double total = n * table[r][c];

            //Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
            if (n >= 30 && r == 0) {
                total *= 0.85;
            }

            //Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
            if (n >= 10 && n <= 20 && r == 2) {
                total *= 0.95;
            }

            //Printing the result
            System.out.printf("Total price: %.2f", total);
        }
        sc.close();
    }
}
