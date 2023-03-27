package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*1.	Count Chars in a String
Write a program that counts all characters in a string except space (' ').
Print all occurrences in the following format:
"{char} -> {occurrences}"
*/
public class CountCharsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<Character, Integer> charDictionary = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                int count = 1;
                if (charDictionary.containsKey(c)) {
                    count = charDictionary.get(c) + 1;
                }
                charDictionary.put(c, count);
            }
        }
        for (var c : charDictionary.entrySet()) {
            System.out.printf("%c -> %d%n", c.getKey(), c.getValue());
        }
        sc.close();
    }
}
