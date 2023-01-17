package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
5. Month Printer
Write a program that takes an integer from the console and prints the corresponding month.
If the number is more than 12 or less than 1 print "Error!".

-Input
You will receive a single integer on a single line.
-Output
If the number is within the boundaries, print the corresponding month, otherwise, print "Error!"

PS: Easier with switch case...
*/
public class MonthsPrinter {
    //Generate months array
    static String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        int month = Integer.parseInt(sc.nextLine());

        //Default message
        String m = "Error!";
        //if month index is acceptable get the month from the array
        if (month >= 1 && month <= 12) {
            m = months[month - 1];
        }

        //print result
        System.out.println(m);

        sc.close();
    }
}
