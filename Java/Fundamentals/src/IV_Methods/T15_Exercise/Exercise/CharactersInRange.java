package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*3.	Characters in Range
Write a method that receives two characters and prints
all the characters in between them on a single line according to ASCII.
*/
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the input
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        //invoke print method
        print(a, b);
        sc.close();
    }

    private static void print(int a, int b) {
        //get the smallest for start
        int start = Math.min(a, b);
        //get the biggest for end
        int end = Math.max(a, b);
        //get all chars in between
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i);
        }
    }

}
