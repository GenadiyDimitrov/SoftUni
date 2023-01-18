package II_DataTypesAndVariable.T9_Exercise.MoreExersises;

import java.util.Scanner;

/*4. Refactoring: Prime Checker

You are given a program that checks if numbers in a given range [2...N] are prime.
For each number is printed "{number} -> {true or false}".
The code, however, is not very well written.
Your job is to modify it in a way that is easy to read and understand.

Code

Scanner chetec = new Scanner(System.in);
int ___Do___ = Integer.parseInt(chetec.nextLine());
for (int takoa = 2; takoa <= ___Do___; takoa++) {
boolean takovalie = true;
for (int cepitel = 2; cepitel < takoa; cepitel++) {
if (takoa % cepitel == 0) {
takovalie = false;
break;
}
}
System.out.printf("%d -> %b%n", takoa, takovalie);
}

*/
public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        //renamed scanner - Fixed
        Scanner sc = new Scanner(System.in);
        //renamed the range - Fixed
        int n = Integer.parseInt(sc.nextLine());
        //renamed for index- Fixed
        for (int i = 2; i <= n; i++) {
            //renamed prime number - Fixed
            boolean isPrimeNumber = true;
            //renamed for index- Fixed
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrimeNumber);
        }
    }
}
