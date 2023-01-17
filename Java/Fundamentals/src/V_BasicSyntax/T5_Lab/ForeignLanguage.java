package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
6. Foreign Languages
Write a program that prints the language that a given country speaks.
You can receive only the following combinations: English is spoken in England and USA;
Spanish is spoken in Spain, Argentina, and Mexico; for the others, we should print "unknown".

-Input
You will receive a single country name on a single line.
-Output
Print the language, which the country speaks, or if it is unknown for your program, print "unknown".*/
public class ForeignLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        String c = sc.nextLine();

        //Generate switch case for all the options
        switch (c) {
            case "USA":
            case "England":
                c = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                c = "Spanish";
                break;
            default:
                c = "unknown";
                break;
        }

        //Print result
        System.out.println(c);
        sc.close();
    }
}
