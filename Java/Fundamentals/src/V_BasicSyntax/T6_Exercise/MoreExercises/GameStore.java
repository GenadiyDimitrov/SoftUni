package V_BasicSyntax.T6_Exercise.MoreExercises;

import java.util.Scanner;

/*
3. Gaming Store
Write a program that helps you buy the games.
The valid games are the following games:

OutFall 4 - $39.99
CS: OG - $15.99
Zplinter Zell - $19.99
Honored 2 - $59.99
RoverWatch - $29.99
RoverWatch Origins Edition - $39.99

On the first line, you will receive your current balance – a floating-point number in the range [0.00…5000.00].
Until you receive the command "Game Time",
you have to keep buying games.
When a game is bought, the user's balance decreases by the price of the game.

-Additionally, the program should obey the following conditions:
· If a game the user is trying to buy is not present in the table above, print "Not Found" and read the next line.
· If at any point, the user has $0 left, print "Out of money!" and end the program.
· Alternatively, if the user is trying to buy a game that they can't afford, print "Too Expensive" and read the next line.

When you receive "Game Time",
print the user's remaining money and total spent on games,
rounded to the 2nd decimal place.
*/
public class GameStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting input
        double balance = Double.parseDouble(sc.nextLine());
        //Getting the name of first command/game
        String s = sc.nextLine();
        //default total
        double total = 0;
        //loop until command = Game Time
        while (!s.equals("Game Time")) {
            //current game prise
            double price = 0;
            //checking valid games
            switch (s) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    //not valid games
                    System.out.println("Not Found");
                    break;
            }
            //if valid game
            if (price > 0) {
                //and enough money to buy
                if (balance >= price) {
                    //print purchase
                    System.out.printf("Bought %s%n", s);
                    //deduct price from balance
                    balance -= price;
                    //inrease total spend
                    total += price;
                    //if reached limit
                    if (balance == 0) {
                        //print not enough
                        System.out.println("Out of money!");
                        break;
                    }
                } else {
                    //else not enough
                    System.out.println("Too Expensive");
                }
            }
            s = sc.nextLine();
        }
        //print the total spend and remaining
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", total, balance);
        sc.close();
    }
}
