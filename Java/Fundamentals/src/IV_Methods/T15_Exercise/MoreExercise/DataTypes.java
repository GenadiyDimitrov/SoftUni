package IV_Methods.T15_Exercise.MoreExercise;

import java.util.Scanner;

/*1.	Data Types
Write a program that, depending on the first line of the input, reads an int, double, or string.
•	If the data type is int, multiply the number by 2.
•	If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
•	If the data type is a string, surround the input with "$".
Print the result on the console.
*/
public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //invoke switch as method
        //get the type
        String type = sc.nextLine();
        switch (type) {
            case "int":
                int i = Integer.parseInt(sc.nextLine());
                System.out.println(i * 2);
                break;
            case "real":
                double d = Double.parseDouble(sc.nextLine());
                System.out.printf("%.2f%n", d * 1.5);
                break;
            case "string":
                String s = sc.nextLine();
                System.out.printf("$%s$%n", s);
                break;
        }
        sc.close();
    }
}
