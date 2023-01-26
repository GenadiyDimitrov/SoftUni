package IV_Methods.T14_Lab;

import java.util.Scanner;

/*5. Orders

Write a method that calculates the total price of an order and prints it on the console.
The method should receive one of the following products:
coffee, water, coke, snacks, and a quantity of the product.

The prices for a single piece of each product are:
· coffee – 1.50
· water – 1.00
· coke – 1.40
· snacks – 2.00

Print the result rounded to the second decimal place.*/
public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the order
        String order = sc.nextLine();
        //get the quantity
        int quantity = Integer.parseInt(sc.nextLine());
        //invoke
        order(order, quantity);
        sc.close();
    }

    public static void order(String order, int quantity) {
        //depend on order print quantity * price
        switch (order) {
            case "coffee":
                double price = 1.5;
                System.out.printf("%.2f", price * quantity);
                break;
            case "water":
                price = 1.0;
                System.out.printf("%.2f", price * quantity);
                break;
            case "coke":
                price = 1.4;
                System.out.printf("%.2f", price * quantity);
                break;
            case "snacks":
                price = 2.0;
                System.out.printf("%.2f", price * quantity);
                break;
        }
    }
}
