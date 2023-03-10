package I_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
9. Orders
We are placing N orders at a time.
You need to calculate the price on the following formula:
((daysInMonth * capsulesCount) * pricePerCapsule)

-Input / Constraints
· On the first line, you will receive integer N – the count of orders the shop will receive.
· For each order, you will receive the following information:
    o Price per capsule - floating-point number in the range [0.00…1000.00].
    o Days – integer in the range [1…31].
    o Capsules count - integer in the range [0…2000].

The input will be in the described format, there is no need to check it explicitly.

-Output
The output should consist of N + 1 line. For each order, you must print a single line in the following format:
· "The price for the coffee is: ${price}"
On the last line, you need to print the total price in the following format:
· "Total: ${totalPrice}"
The price must be formatted to 2 decimal places.*/
public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int n = Integer.parseInt(sc.nextLine());
        //Default total
        double total = 0;
        //loop the orders
        for (int i = 0; i < n; i++) {
            //for each order:
            //get the input
            double price = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsules = Integer.parseInt(sc.nextLine());
            //calculate the order total
            double orderTotal = (days * capsules) * price;
            //print the order total
            System.out.printf("The price for the coffee is: $%.2f%n", orderTotal);
            //increase the all total
            total += orderTotal;
        }
        //print the all total
        System.out.printf("Total: $%.2f%n", total);
        sc.close();
    }
}
