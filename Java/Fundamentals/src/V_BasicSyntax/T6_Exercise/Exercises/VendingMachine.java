package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
7. Vending Machine
Your task is to calculate the total purchase price from a vending machine.
Until you receive "Start" you will be given different coins that are being inserted into the machine.
You have to sum them to have the total money inserted.
There is a problem though.
Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins.
If someone tries to insert some other coins, you have to display "Cannot accept {money}",
where the value is formatted to the second digit after the decimal point and not add it to the total money.
On the next few lines until you receive "End" you will be given products to purchase.
Your machine has, however, only "Nuts", "Water", "Crisps", "Soda", "Coke".
The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
If the person tries to purchase a not existing product, print "Invalid product".
Be careful that the person may try to purchase a product for which he doesn't have money.
In that case, print "Sorry, not enough money".
If the person purchases a product successfully print "Purchased {product name}".
After the "End" command, print the money that is left formatted to the second decimal point in the format "Change: {money left}".
*/
public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the first command
        String command = sc.nextLine();
        //default money
        double money = 0;

        //loop all the money until u get the Start command
        while (!command.equals("Start")) {
            //convert the command to money
            double d = Double.parseDouble(command);

            //check if valid coins
            if (d == 0.1 || d == 0.2 || d == 0.5 || d == 1 || d == 2) {
                money += d;
            } else {
                //Else print cannot accept
                System.out.printf("Cannot accept %.2f%n", d);
            }
            //wait next command
            command = sc.nextLine();
        }

        //After the initial Start command read the first product
        command = sc.nextLine();
        //loop all the products until u get the Start command
        while (!command.equals("End")) {

            //Default product price
            double price = Double.NaN;
            //switch case for all the product and prices
            switch (command) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
            }
            //if the price remains NaN the product is not valid
            if (Double.isNaN(price)) {
                //Print not valid
                System.out.println("Invalid product");
            } else {
                //if enough money to purchase
                if (money - price >= 0) {
                    //Print the product
                    System.out.printf("Purchased %s%n", command);
                    //subtract the price
                    money -= price;
                } else {
                    //else print not enough
                    System.out.println("Sorry, not enough money");
                }
            }
            //wait next product
            command = sc.nextLine();
        }
        //avter initial End command print the remaining money
        System.out.printf("Change: %.2f%n", money);
        sc.close();
    }
}
