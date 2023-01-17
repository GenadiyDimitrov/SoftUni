package VI_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*4. Sum of Chars

Write a program that sums the ASCII codes of n characters. Print the sum on the console.

-Input
· On the first line, you will receive n – the number of lines that follow.
· On the next n lines – you will receive letters from the Latin alphabet.

-Output
Print the total sum in the following format:
"The sum equals: {totalSum}"

-Constraints
· n will be in the interval [1…20].
· The characters will always be either upper or lower-case letters from the English alphabet.
· You will always receive one letter per line.
*/
public class SumOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read rows
        int n = Integer.parseInt(sc.nextLine());
        //default sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char character = sc.nextLine().charAt(0);
            sum += (int) character;
        }
        System.out.printf("The sum equals: %d", sum);
        sc.close();
    }
}
