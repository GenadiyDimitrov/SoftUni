package I_BasicSyntax.T6_Exercise.MoreExercises;

import java.util.HashMap;
import java.util.Scanner;

/*
5. Messages
Write a program that emulates typing an SMS (old phones), following this guide:
1
2 abc
3 def
4 ghi
5 jkl
6 mno
7 pqrs
8 tuv
9 wxyz
0 space

Following the guide, 2 becomes "a", 22 becomes "b" and so on.

· On the first input line - number of symbols to be entered – integer in the range [0, 1000].
*/
public class Messages {

    public static void main(String[] args) {
        //Generate Dictionary with each number
        //<editor-fold desc="HashMap">
        HashMap<Integer, String> table = new HashMap<>();
        table.put(0, " ");
        table.put(2, "a");
        table.put(22, "b");
        table.put(222, "c");
        table.put(3, "d");
        table.put(33, "e");
        table.put(333, "f");
        table.put(4, "g");
        table.put(44, "h");
        table.put(444, "i");
        table.put(5, "j");
        table.put(55, "k");
        table.put(555, "l");
        table.put(6, "m");
        table.put(66, "n");
        table.put(666, "o");
        table.put(7, "p");
        table.put(77, "q");
        table.put(777, "r");
        table.put(7777, "s");
        table.put(8, "t");
        table.put(88, "u");
        table.put(888, "v");
        table.put(9, "w");
        table.put(99, "x");
        table.put(999, "y");
        table.put(9999, "z");
        //</editor-fold>
        Scanner sc = new Scanner(System.in);
        //get the symbols count
        int n = Integer.parseInt(sc.nextLine());
        //default result
        String result = "";
        //loop the count
        for (int i = 0; i < n; i++) {
            //get the symbol from next input and the dictionary
            int code = Integer.parseInt(sc.nextLine());
            //add it to the result
            result += table.get(code);
        }
        //Print the result
        System.out.println(result);
        sc.close();

    }
}
