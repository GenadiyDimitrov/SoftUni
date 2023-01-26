package IV_Methods.T14_Lab;

import java.util.Scanner;

/*4. Calculations

Write a program that receives a string on the first line
("add", "multiply", "subtract", "divide")
and on the next two lines receives two numbers.
Create four methods (for each calculation) and invoke the right one depending on the command.
The method should also print the result (it needs to be void).*/
public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the command
        String command = sc.nextLine();
        //get the two numbers
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        //invoke method
        calculate(command, a, b);
        sc.close();
    }

    public static void calculate(String command, int a, int b) {
        //chose which method to invoke depending on command
        switch (command) {
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
        }
    }

    private static void divide(int a, int b) {
        if (b != 0) {
            System.out.printf("%d", a / b);
        }
    }

    private static void multiply(int a, int b) {
        System.out.printf("%d", a * b);
    }

    private static void subtract(int a, int b) {
        System.out.printf("%d", a - b);
    }

    private static void add(int a, int b) {
        System.out.printf("%d", a + b);
    }
}
