package IV_Methods.T14_Lab;

import java.util.Scanner;

/*6. Calculate Rectangle Area
Create a method that calculates
and returns the area of a rectangle
by given width and length.*/
public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get width and height
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        //invoke method
        System.out.println(calculateArea(width, height));
        sc.close();
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }
}
