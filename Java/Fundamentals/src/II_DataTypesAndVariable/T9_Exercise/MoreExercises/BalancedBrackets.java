package II_DataTypesAndVariable.T9_Exercise.MoreExercises;

import java.util.Scanner;

/*6. Balanced Brackets

You will receive n lines. On those lines, you will receive one of the following:

· Opening bracket – "("
· Closing bracket – ")"
· Random string

Your task is to find out if the brackets are balanced.
That means after every closing bracket should follow an opening one.
Nested parentheses are not valid,
and if two consecutive opening brackets exist,
the expression should be marked as unbalanced.

-Input
· On the first line, you will receive n – the number of lines that will follow.
· On the next n lines, you will receive "(", ")" or another string.

-Output
You must print "BALANCED" if the parentheses are balanced and "UNBALANCED" otherwise.

-Constraints
· n will be in the interval [1…20].
· The length of the stings will be between [1…100] characters.*/
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting rows count
        int lines = Integer.parseInt(sc.nextLine());
        //default flags
        boolean isBalanced = true;
        boolean lastOpened = false;
        //for all lines
        for (int i = 0; i < lines; i++) {
            //read the row
            String row = sc.nextLine();
            //check if its opening bracket
            if (row.equals("(")) {
                //if last bracket was also opened they are not balanced
                if (lastOpened) isBalanced = false;
                    //else  change to last bracket to opened
                else lastOpened = true;
                //check if its closing bracket
            } else if (row.equals(")")) {
                //if last bracket was also closed they are not balanced
                if (!lastOpened) isBalanced = false;
                    //else  change to last bracket to closed
                else lastOpened = false;
            }
            //if they are not balanced, no point in continuing so break the loop
            if (!isBalanced) break;
        }
        //if we have balanced and last bracket is a closing one
        System.out.println(isBalanced && !lastOpened ? "BALANCED" : "UNBALANCED");
        sc.close();
    }
}
