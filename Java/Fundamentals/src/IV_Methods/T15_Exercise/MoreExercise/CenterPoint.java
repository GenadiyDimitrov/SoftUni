package IV_Methods.T15_Exercise.MoreExercise;

import java.awt.*;
import java.util.Scanner;

/*2.	Center Point
You are given the coordinates of two points on
a Cartesian coordinate system - X1, Y1, X2, and Y2.
Create a method that prints the point that is closest
to the center of the coordinate system (0, 0) in the format (X, Y).
If the points are at the same distance from the center,
print only the first one.
*/
public class CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the coordinates
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        //invoke method to get distance to point 0 x 0
        double d1 = getDistanceTo0x0(x1, y1);
        double d2 = getDistanceTo0x0(x2, y2);


        //check which to print
        if (d1 > d2) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
        sc.close();
    }

    private static double getDistanceTo0x0(int x, int y) {
        //generate point
        Point point = new Point(x, y);
        //get distance
        return point.distance(0, 0);
    }

}
