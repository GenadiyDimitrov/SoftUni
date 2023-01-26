package IV_Methods.T14_Lab;

import java.util.Scanner;

/*Printing Triangle

Create a method for printing triangles as shown below:
input:
4
output:
1
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1
*/
public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the max length
        int length = Integer.parseInt(sc.nextLine());
        sc.close();
        //invoke print method
        printTriangle(length);
    }

    private static void printTriangle(int length) {
        //for 1 to length
        for (int i = 1; i <= length; i++) {
            //print line
            printLine(i);
        }
        //for reverse part from length -1
        for (int i = length - 1; i >= 0; i--) {
            //print line
            printLine(i);
        }
    }

    public static void printLine(int length) {
        //for each number from 1 to the given
        for (int i = 1; i <= length; i++) {
            //print number
            System.out.printf("%d ", i);
        }
        //drop the cursor
        System.out.println();
    }
}
