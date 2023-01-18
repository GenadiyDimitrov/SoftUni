package II_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*7. Water Overflow

You have a water tank with a capacity of 255 liters.
On the next n lines,
you will receive liters of water,
which you must pour into your tank.
If the capacity is not enough,
print "Insufficient capacity!"
and continue reading the next line.
On the last line, print the liters in the tank.

-Input
The input will be on two lines:
· On the first line, you will receive n – the number of lines, which will follow
· On the next n lines – you receive quantities of water, which you have to pour into the tank

-Output
Every time you do not have enough capacity in the tank to pour the given liters, print:
"Insufficient capacity!".
On the last line, print only the liters in the tank.

-Constraints
· n will be in the interval [1…20].
· liters will be in the interval [1…1000].*/
public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of rows
        int n = Integer.parseInt(sc.nextLine());
        //default cap
        int cap = 0;
        int maxCap = 255;
        //loop the rows
        for (int i = 0; i < n; i++) {
            //get the fill
            int litters = Integer.parseInt(sc.nextLine());
            //if litters + current cap > max
            if (cap + litters > maxCap) {
                //print cant
                System.out.println("Insufficient capacity!");
            } else {
                //add
                cap += litters;
            }
        }
        //print cap
        System.out.println(cap);
        sc.close();
    }
}
