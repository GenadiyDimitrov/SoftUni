package I_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
3. Passed or Failed
Modify the 2.Passed program, so it will
print "Failed!" if the grade is lower than 3.00.

-Input
The input comes as a single double number.
-Output
The output is either "Passed!" if the grade is more than 2.99, otherwise, you should print "Failed!".
*/
public class Failed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        double grade = Double.parseDouble(sc.nextLine());


        //Check grade
        if (grade >= 3.0) {
            //Print result
            System.out.println("Passed!");
        } else {
            //Print result
            System.out.println("Failed!");
        }
        sc.close();
    }
}
