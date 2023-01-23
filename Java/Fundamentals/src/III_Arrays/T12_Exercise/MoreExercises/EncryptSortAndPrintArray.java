package III_Arrays.T12_Exercise.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

/*1.	Encrypt, Sort and Print Array
Write a program that reads a sequence of strings from the console.
Encrypt every string by summing:
•	The code of each vowel multiplied by the string length. //a, e, i, o, u, and sometimes y
•	The code of each consonant is divided by the string length.
Sort the number sequence in ascending order and print it on the console.
On the first line, you will always receive the number of strings you must read.
*/
public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of rows to be read
        int rows = Integer.parseInt(sc.nextLine());
        //create int arrya to store the encrypted codes
        int[] array = new int[rows];
        //for each row
        for (int i = 0; i < rows; i++) {
            //create temp code
            int code = 0;
            //read the message
            String input = sc.nextLine();
            //foreach character in the message
            for (char c : input.toCharArray()) {
                //multiply the vowels
                //divide the consonant
                switch (c) {
                    case 'A': //65
                    case 'a': //97
                    case 'E': //69
                    case 'e': //101
                    case 'I': //73
                    case 'i': //105
                    case 'O': //79
                    case 'o': //111
                    case 'U': //85
                    case 'u': //117
                        code += c * input.length();
                        break;
                    default:
                        code += c / input.length();
                        break;
                }
            }
            //update the current position in the array with the generated code
            array[i] = code;
        }
        //order the array
        array = Arrays.stream(array).sorted().toArray();
        //print sorted
        for (int code : array) {
            System.out.println(code);
        }
        sc.close();
    }
}
