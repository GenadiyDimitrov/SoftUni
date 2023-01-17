package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
11. Rage Expenses *(Not included in last score)
As a MOBA challenger player,
Peter has the bad habit of trashing his PC when he loses a game and rage quits.
His gaming setup consists of a headset, mouse, keyboard, and display.
You will receive Peter's lost games count.

Every second lost game, Peter trashes his headset.
Every third lost game, Peter trashes his mouse.
When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
Every second time when he trashes his keyboard, he also trashes his display.

You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment.

-Input / Constraints
· On the first input line - lost games count – integer in the range [0, 1000].
· On the second line – headset price - the floating-point number in the range [0, 1000].
· On the third line – mouse price - the floating-point number in the range [0, 1000].
· On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
· On the fifth line – display price - the floating-point number in the range [0, 1000].

-Output
· As output you must print Peter's total expenses: "Rage expenses: {expenses} lv."
· Allowed working time / memory: 100ms / 16MB.*/
public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        //Breaks HS each 2 games
        int trashedHeadsets = lostGames / 2;
        //Breaks M each 3 games
        int trashedMouses = lostGames / 3;
        //Breaks KB each 2nd time when break HS+M = 6 games
        int trashedKeyboards = lostGames / 6;
        //Breaks D each 2nd time when break KB = 12 of all or 2 of KB
        int trashedDisplays = trashedKeyboards / 2;

        //Calculate expenses
        double expenses =
                trashedHeadsets * headsetPrice
                        + trashedMouses * mousePrice
                        + trashedKeyboards * keyboardPrice
                        + trashedDisplays * displayPrice;
        //Print expenses
        System.out.printf("Rage expenses: %.2f lv.", expenses);
        sc.close();
    }
}
