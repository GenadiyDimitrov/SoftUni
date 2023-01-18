package II_DataTypesAndVariable.T9_Exercise.Exercises;

import java.util.Scanner;

/*8. Beer Kegs

Write a program that calculates the volume of n beer kegs.
You will receive in total 3 * n lines.
Every three lines will hold information for a single keg.
First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.

Calculate the volume using the following formula: π * r^2 * h.

In the end, print the model of the biggest keg.

-Input
You will receive 3 * n lines. Each group of lines will be on a new line:
· First – model – string
· Second –radius – floating-point number
· Third – height – integer number

-Output
Print the model of the biggest keg.

-Constraints
· n will be in the interval [1…10].
· The radius will be a floating-point number in the interval [1…3.402823E+38].
· The height will be an integer in the interval [1…2147483647].*/
public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting number of kegs
        int n = Integer.parseInt(sc.nextLine());
        double max = Double.MIN_VALUE;
        String result = "";
        for (int i = 0; i < n; i++) {
            //· First – model – string
            String model = sc.nextLine();
            //· Second –radius – floating-point number
            double radius = Double.parseDouble(sc.nextLine());
            //· Third – height – integer number
            int height = Integer.parseInt(sc.nextLine());

            //calculate the volume
            double volume = Math.PI * (radius * radius) * (double) height;
            //check if bigger than previous
            if (max < volume) {
                max = volume;
                result = model;
            }
        }
        //print biggest keg
        System.out.println(result);
        sc.close();
    }
}
