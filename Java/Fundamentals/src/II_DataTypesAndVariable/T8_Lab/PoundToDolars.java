package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
2. Pounds to Dollars
Write a program that converts British pounds to US dollars formatted to the 3rd decimal point.
1 British Pound = 1.36 Dollars*/
public class PoundToDolars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the punds
        double d = Double.parseDouble(sc.nextLine());
        //convert to dollars
        double dollars = d * 1.36;
        //print dollars
        System.out.printf("%.3f", dollars);
        sc.close();
    }
}
