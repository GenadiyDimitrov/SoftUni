package X_TextProcessing.T29_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*6.	Replace Repeating Chars
Write a program that reads a string from the console and replaces any sequence of the same letters with a single corresponding letter.
*/
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        List<Character> charList = new ArrayList<>();
        for (var c : chars) {
            charList.add(c);
        }
        chars = null;
        for (int i = 0; i < charList.size() - 1; i++) {
            char first = charList.get(i);
            int nextIndex = i + 1;
            char second = charList.get(nextIndex);
            if (first == second) {
                charList.remove(nextIndex);
                i--;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (var c : charList) {
            builder.append(c);
        }
        System.out.println(builder);
        sc.close();
    }
}
