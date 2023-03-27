package X_TextProcessing.T29_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*7.	String Explosion
Explosions are marked with ">".
Immediately after the mark,
there will be an integer,
which signifies the strength of the explosion.
You should remove x characters (where x is the strength of the explosion),
starting after the punched character (">").
If you find another explosion mark (">") while you're deleting characters,
you should add the strength to your previous explosion.
When all characters are processed,
print the string without the deleted characters.
You should not delete the explosion character – ">",
but you should delete the integers,
which represent the strength.

Input
You will receive a single line with the string.

Output
Print what is left from the string after explosions.

Constraints
•	You will always receive strength for the punches.
•	The path will consist only of letters from the Latin alphabet, integers, and the char ">".
•	The strength of the punches will be in the interval [0…9].
*/
public class StringExplosion {
    static List<Character> charList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        for (var c : chars) {
            charList.add(c);
        }
        int powerAccumulation = 0;
        for (int i = 0; i < charList.size(); i++) {
            char currentChar = charList.get(i);
            if (currentChar == '>') {
                int nextIndex = i + 1;
                if (nextIndex < charList.size()) {
                    char nextChar = charList.get(nextIndex);
                    int power = Integer.parseInt(String.valueOf(nextChar));
                    powerAccumulation += power - 1;

                    charList.remove(nextIndex);
                }
            } else if (powerAccumulation > 0) {
                charList.remove(i);
                i--;
                powerAccumulation--;
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
