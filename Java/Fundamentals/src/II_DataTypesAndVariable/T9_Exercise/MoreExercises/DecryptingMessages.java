package II_DataTypesAndVariable.T9_Exercise.MoreExercises;

import java.util.Scanner;

/*5. Decrypting Messages

You will receive a key (integer) and n characters afterward.
Add the key to each character and append them to the message.
In the end, print the message, which you decrypted.

-Input
· On the first line, you will receive the key.
· On the second line, you will receive n – the number of lines that will follow.
· On the next n lines – you will receive lower and uppercase characters from the Latin alphabet.

-Output
Print the decrypted message.

-Constraints
· The key will be in the interval [0…20].
· n will be in the interval [1…20].
· The characters will always be upper or lower-case letters from the English alphabet.
· You will receive one letter per line.*/
public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        int key = Integer.parseInt(sc.nextLine());
        int lines = Integer.parseInt(sc.nextLine());
        //default message
        StringBuilder message = new StringBuilder();
        //loop for all lines
        for (int i = 0; i < lines; i++) {
            //received char
            char character = sc.nextLine().charAt(0);
            //decrypted char
            char decrypted = (char) (character + key);
            //append message
            message.append(decrypted);
        }
        //print message
        System.out.println(message);
        sc.close();
    }
}
