package IV_Methods.T15_Exercise.Exercise;

import java.util.Scanner;

/*6.	Middle Characters
You will receive a single string. Write a method that prints the middle character.
If the length of the string is even, there are two middle characters.
*/
public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get input
        String input = sc.nextLine();
        //invoke method to get mid-chars and return result
        String result = getMiddleChars(input);
        //print
        System.out.println(result);
        sc.close();
    }

    private static String getMiddleChars(String input) {
        //get if there will be 2 chars
        boolean isEven = input.length() % 2 == 0;
        //get start trim index. If even trim index should be -1, else it will return empty
        int trim = input.length() / 2 - (isEven ? 1 : 0);
        //return trim. If it's even there will be two chars to return
        return input.substring(trim, trim + (isEven ? 2 : 1));
    }
}
