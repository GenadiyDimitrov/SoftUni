package IV_Methods.T14_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/*11.	Math Operations
Write a method that receives two numbers and an operator,
calculates the result, and returns it.

You will be given three lines of input.
The first will be the first number,
the second one will be the operator,
and the last one will be the second number.

The possible operators are: / * + -

Print the result rounded up to the second decimal point.
*/
public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double b = Double.parseDouble(sc.nextLine());
        double result = getResult(operator, a, b);
        System.out.println(new DecimalFormat("0.##").format(result));
        sc.close();
    }

    private static double getResult(String operator, double a, double b) {
        double result = 0;

        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
