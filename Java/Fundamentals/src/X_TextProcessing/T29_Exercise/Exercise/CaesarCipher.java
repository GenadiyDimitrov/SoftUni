package X_TextProcessing.T29_Exercise.Exercise;

import java.util.Scanner;

/*4.	Caesar Cipher
Write a program that returns an encrypted version of the same text.
Encrypt the text by shifting each character with three positions forward.
For example, A would be replaced by D, B would become E, and so on.
Print the encrypted text.
ITS NOT:
ABCDEFG(A<->D [0<->3]) => DBCAEFG(B<->E [1<->4] ) =>
DECABFG(C<->F [2<->5] ) => DEFABCG(A<->G [3<->6] ) =>
DEFGBCA(B<->D [4<->0] ) => etc...

ITS: ?!?!?
ABCDEFG(A+'3') =>DBCDEFG(B+'3')=>DECDEFG =>etc...
*/
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

//        for (int i = 0; i < chars.length; i++) {
//            char first = chars[i];
//            int nextIndex = i + 3;
//            if (nextIndex >= chars.length) {
//                nextIndex -= chars.length;
//            }
//            char second = chars[nextIndex];
//
//            chars[i] = second;
//            chars[nextIndex] = first;
//        }
//        System.out.println(new String(chars));

        StringBuilder cipher = new StringBuilder();
        for (char aChar : chars) {
            char letter = aChar;
            letter += (char) 3;
            cipher.append(letter);
        }
        System.out.println(cipher);
        sc.close();
    }
}
