package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
6. Chars to String
Write a program that reads 3 lines of input.
On each line, you get a single character.
Combine all the characters into one string and print it on the console.

PS: can be done just to read 3 lines and print them
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.printf("%s%s%s",a,b,c);
*/
public class CharToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //default result
        String result = "";
        //for loop 3 rows
        for (int i = 0; i < 3; i++) {
            result += sc.nextLine();
        }
        System.out.println(result);
        sc.close();
    }
}
