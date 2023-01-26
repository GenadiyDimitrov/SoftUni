package IV_Methods.T14_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

/*8. Math Power

Create a method that calculates
and returns the value of a number
raised to a given power.*/
public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the number and the power
        double number = Double.parseDouble(sc.nextLine());
        double power = Double.parseDouble(sc.nextLine());
        //get result from invoked method
        double result = getMathPower(number, power);
        //print result
        System.out.println(new DecimalFormat("0.####").format(result));
        sc.close();
    }

    private static double getMathPower(double number, double power) {
        //return mathPower
        return Math.pow(number, power);
    }
}
