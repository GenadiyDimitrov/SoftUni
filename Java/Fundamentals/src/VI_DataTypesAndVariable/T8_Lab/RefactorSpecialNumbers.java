package VI_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*12. Refactor Special Numbers

You are given a working code that is a solution to Problem 9. Special Numbers. However, the variables are improperly named, declared before they are needed, and some of them are used for multiple things. Without using your previous solution, modify the code so that it is easy to read and understand.

Code:

Scanner scanner = new Scanner(System.in);
int kolkko = Integer.parseInt(scanner.nextLine());
int obshto = 0;
int takova = 0;
boolean toe = false;
for (int ch = 1; ch <= kolkko; ch++) {
takova = ch;
while (ch > 0) {
obshto += ch % 10; ch = ch / 10; } toe = (obshto == 5) || (obshto == 7) || (obshto == 11); System.out.printf("%d -> %b%n", takova, toe); obshto = 0; ch = takova; }

Hints
· Reduce the span of the variables by declaring them at the moment they receive a value, not before
· Rename your variables to represent their real purpose (example: "toe" should become isSpecialNum, etc.)
· Search for variables that have multiple purposes. If you find any, introduce a new variable*/
public class RefactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Getting input
        //Rename input - Fixed
        int n = Integer.parseInt(scanner.nextLine());
        //for loop from 1 to input
        for (int i = 1; i <= n; i++) {
            //removed redundant declarations - Fixed
            //Renamed variables - Fixed
            int number = i;
            int sum = 0;
            //Fixed while to the proper variables -Fixed
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            boolean isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            //Fixed print - Fixed
            System.out.printf("%d -> %s%n", i, isSpecialNumber ? "True" : "False");
            //Removed redundant variable set - Fixed
        }
    }
}
