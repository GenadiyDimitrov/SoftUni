package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
9. Centuries to Minutes

Write a program to enter an integer number of centuries and convert it to years, days, hours, and minutes.

-Examples:
Input- 1 / Output- 1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes
Input- 5 / Output- 5 centuries = 500 years = 182621 days = 4382906 hours = 262974384 minutes

-Hints
· Use appropriate data types to fit the result after each data conversion.
· Assume that a year has 365.2422 days on average*/
public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cent = Integer.parseInt(sc.nextLine());
        double years = cent * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", cent, years, days, hours, minutes);
        sc.close();
    }
}
