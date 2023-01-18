package II_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*6. Triples of Latin Letters

Write a program to read an integer n
and print all triples of the first n small Latin letters,
ordered alphabetically:
*/
public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the number
        int n = Integer.parseInt(sc.nextLine());
        //3 nested loops for each letter
        for (int i = 0; i < n; i++) {
            //get the first char
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                //get second char
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    //get third char
                    char thirdChar = (char) ('a' + k);
                    //print
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
        sc.close();
    }
}
