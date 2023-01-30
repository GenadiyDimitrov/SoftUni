package IV_Methods.T15_Exercise.MoreExercise;

import java.awt.*;
import java.util.Scanner;

/*3.	Longer Line
You are given the coordinates of four points in the 2D plane.
The first and the second pair of points form two different lines.
Print the longer line in the format "(X1, Y1)(X2, Y2)"
starting with the point that is closer to the center of the coordinate system (0, 0)
(You can reuse the method that you wrote for the previous problem).
If the lines are of equal length, print only the first one.
*/
public class LongerLine {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //invoke method that gets input and output two points
        Point[] points1 = getPoints();
        //get line 1 length
        double length1 = getLineLength(points1[0], points1[1]);
        //invoke method that gets input and output two points
        Point[] points2 = getPoints();
        //get line 2 length
        double length2 = getLineLength(points2[0], points2[1]);

        //depending on which line is longer invoke print method
        printClosestPointFirst(length1 < length2 ? points2 : points1);
        sc.close();
    }

    private static void printClosestPointFirst(Point[] points) {
        //get which line is closest to 0x0
        if (getDistanceTo0x0(points[0]) < getDistanceTo0x0(points[1])) {
            //print closest first
            System.out.printf("(%d, %d)(%d, %d)", points[0].x, points[0].y, points[1].x, points[1].y);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", points[1].x, points[1].y, points[0].x, points[0].y);
        }
    }

    private static Point[] getPoints() {
        //get input
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        //generate points
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        //return array
        return new Point[]{p1, p2};
    }

    private static double getLineLength(Point p1, Point p2) {
        //get distance between the two points
        return p1.distance(p2);
    }

    private static double getDistanceTo0x0(Point point) {
        //get distance to 00
        return point.distance(0, 0);
    }
}
