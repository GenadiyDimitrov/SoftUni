package IV_Methods.T14_Lab;

import java.util.Scanner;

/*1. Sign of Integer

Create a method that prints the sign of an integer number.

### Example

| **Input** | **Output**                 |
| --------- | -------------------------- |
| 2         | The number 2 is positive.  |
| -5        | The number -5 is negative. |
| 0         | The number 0 is zero.      |*/
public class SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the integer
        int number = Integer.parseInt(sc.nextLine());
        sc.close();
        //invoke the method
        getSign(number);
    }

    public static void getSign(int number) {
        //default zero value
        String res = "zero";
        //if the number is positive
        if (number > 0) {
            res = "positive";
        }
        //if number is negative
        else if (number < 0) {
            res = "negative";
        }

        System.out.printf("The number %d is %s.", number, res);
    }
}
