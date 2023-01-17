package VI_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*5. Print Part of the ASCII Table
Find online more information about ASCII (American Standard Code for Information Interchange)
and write a program that prints part of the ASCII table of characters at the console.
On the first line of input, you will receive the char index you should start with,
and on the second line - the index of the last character you should print.*/
public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting start and end index
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        //for loop from start to end index
        for (int i = start; i <= end; i++) {
            //print the number as char
            System.out.printf("%s ", (char) i);
        }
        sc.close();
    }
}
