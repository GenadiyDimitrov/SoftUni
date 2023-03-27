package VII_ObjectAndClasses.T22_Lab;

import java.math.BigInteger;
import java.util.Scanner;

/*3.	Big Factorial
You will receive N - the number in the range [0 - 1000].
Calculate the Factorial of N and print the result.
*/
public class BigFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number
        int number = Integer.parseInt(sc.nextLine());
        //print
        System.out.println(getFact(number));
        sc.close();
    }
    private static BigInteger getFact(int number) {
        //default fact
        BigInteger factorial = BigInteger.valueOf(1);
        //getting the factorial
        for (int i = 1; i <= number; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
