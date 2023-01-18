package I_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
12. Even Number
Take as an input an even number and print its absolute value with a message:
"The number is: {absoluteValue}".
If the number is odd,
print "Please write an even number."
and continue reading numbers.
*/
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the inpit
        int n = Integer.parseInt(sc.nextLine());

        //While input is odd continue getting input
        while (n % 2 != 0) {
            //print Requirements
            System.out.println("Please write an even number.");
            n = Integer.parseInt(sc.nextLine());
        }
        //Print the even number
        System.out.printf("The number is: %d%n", Math.abs(n));
        sc.close();
    }
}
