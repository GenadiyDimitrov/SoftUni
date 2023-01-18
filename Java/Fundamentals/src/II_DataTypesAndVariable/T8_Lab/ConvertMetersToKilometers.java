package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
1. Convert Meters to Kilometers
You will be given an integer that will be a distance in meters.
Write a program that converts meters to kilometers formatted to the second decimal point.
*/
public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get the meters
        int n = Integer.parseInt(sc.nextLine());
        //Convert meters to KM
        double km = (double) n / 1000.00;
        //Print the result
        System.out.printf("%.2f", km);
        sc.close();
    }
}
