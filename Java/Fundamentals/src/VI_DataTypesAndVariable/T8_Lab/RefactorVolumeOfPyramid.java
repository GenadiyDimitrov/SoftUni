package VI_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*11. Refactor Volume of Pyramid

You are given a working code that finds the volume of a pyramid.
However, you should consider that the variables exceed their optimum span and have improper naming.
Also, search for variables that have multiple purposes.

Code:

Scanner scanner = new Scanner(System.in);
double dul, sh, V = 0;
System.out.print("Length: ");
dul = Double.parseDouble(scanner.nextLine());
System.out.print("Width: ");
sh = Double.parseDouble(scanner.nextLine());
System.out.print("Height: ");
V = Double.parseDouble(scanner.nextLine());
V = (dul * sh * V) / 3;
System.out.printf("Pyramid Volume: %.2f", V);

Hints
· Reduce the span of the variables by declaring them at the moment they receive a value, not before
· Rename your variables to represent their real purpose (example: "dul" should become length, etc.)
· Search for variables that have multiple purposes. If you find any, introduce a new variable.
*/
public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //getting values - Not declaring them before we get them - Fixed
        //Rename values with proper names - Fixed
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        //removed the double purpose value and introducing new value volume - Fixed
        //Calculating volume
        double volume = (length * width * height) / 3;

        //removed redundant prints - Fixed
        //Print result - Fixed
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);
    }
}
