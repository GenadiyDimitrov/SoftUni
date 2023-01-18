package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
8. Lower or Upper
Write a program that prints whether a given character is upper-case or lower-case.
*/
public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting input
        String s = sc.nextLine();
        //check if string to lower is the same as the original
        if (s.toLowerCase().equals(s)) {
            //print lower
            System.out.println("lower-case");
        } else {
            //else print upper
            System.out.println("upper-case");
        }
        sc.close();
    }
}
