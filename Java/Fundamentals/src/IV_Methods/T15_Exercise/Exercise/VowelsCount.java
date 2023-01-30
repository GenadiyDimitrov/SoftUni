package IV_Methods.T15_Exercise.Exercise;

import java.util.Arrays;
import java.util.Scanner;

/*2.	Vowels Count
Write a method that receives a single string and prints the count of the vowels.
Use an appropriate name for the method. " a, e, i, o, u"
97,101,105,111,117
65,69,73,79,85
*/
public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the input
        String input = sc.nextLine();
        //invoke method that returns vowels count
        int count = getVowelsCount(input);
        //print
        System.out.println(count);
        sc.close();
    }

    private static int getVowelsCount(String input) {
        //default result
        int result = 0;
        //all vowels code
        int[] vowels = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};
        //foreach char in the input
        for (int i = 0; i < input.length(); i++) {
            //get char
            char c = input.charAt(i);
            //find if vowel
            if (Arrays.stream(vowels).anyMatch(v -> v == c)) {
                //increase count
                result++;
            }
        }

        return result;
    }
}
