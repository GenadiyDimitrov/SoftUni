package X_TextProcessing.T29_Exercise.Exercise;

import java.util.Scanner;

/*2.	Character Multiplier
Create a method that takes two strings as arguments
and returns the sum of their character codes multiplied
(multiply str1[0] with str2[0] and add to the total sum).
Then continue with the next two characters.
If one of the strings is longer than the other,
add the remaining character codes to the total sum without multiplication.
*/
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" +");
        String firstWord = strings[0];
        String secondWord = strings[1];
        int length = Math.max(firstWord.length(), secondWord.length());
        int totalSum = 0;
        for (int i = 0; i < length; i++) {
            char one = 0;
            char two = 0;
            if (i < firstWord.length()) {
                one = firstWord.charAt(i);
            }
            if (i < secondWord.length()) {
                two = secondWord.charAt(i);
            }
            if (one > 0 && two > 0) {
                totalSum += one * two;
            } else {
                totalSum += two;
                totalSum += one;
            }
        }
        System.out.println(totalSum);
        sc.close();
    }
}
