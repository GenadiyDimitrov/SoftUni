package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*7.	NxN Matrix
Write a method that receives a single integer n and prints a nxn matrix with that number.
*/
public class NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get count
        int count = Integer.parseInt(sc.nextLine());
        //invoke draw method for number of rows
        drawRows(count);
        sc.close();
    }

    private static void drawRows(int count) {
        //foreach row
        for (int row = 0; row < count; row++) {
            //invoke draw line
            drawLine(count);
            //drop cursor
            System.out.println();
        }
    }

    private static void drawLine(int count) {
        //foreach count
        for (int i = 0; i < count; i++) {
            //draw the number
            System.out.printf("%d ", count);
        }
    }
}
