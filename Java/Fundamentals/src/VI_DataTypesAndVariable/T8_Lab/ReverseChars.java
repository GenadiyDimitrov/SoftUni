package VI_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
7. Reversed Chars
Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
*/
public class ReverseChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.printf("%s %s %s", c, b, a);
        sc.close();
    }
}
