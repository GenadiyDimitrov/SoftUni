package VII_ObjectAndClasses.T22_Lab;

import java.math.BigInteger;
import java.util.Scanner;

/*2.	Sum Big Numbers
You will receive two numbers (0 to 10^50),
and print their sum.
*/
public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the two integers
        BigInteger bigIntegerOne = new BigInteger(sc.nextLine());
        BigInteger bigIntegerTwo = new BigInteger(sc.nextLine());
        //sum
        BigInteger sum = bigIntegerOne.add(bigIntegerTwo);
        //print
        System.out.println(sum);
        sc.close();
    }
}
