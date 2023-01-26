package IV_Methods.T14_Lab;

import java.util.Scanner;

/*7. Repeat String

Write a method that receives a string and a repeat count n (integer). 
The method should return a new string (the old one repeated n times).*/
public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the input
        String input = sc.nextLine();
        //get how many counts to repeat
        int repeat = Integer.parseInt(sc.nextLine());
        //invoke and print repeat method
        System.out.println(repeatString(input, repeat));
        sc.close();
    }

    public static String repeatString(String input, int count) {
        //set default string
        String result = "";
        //for each repeat
        for (int i = 0; i < count; i++) {
            //concatenate string
            result += input;
        }
        //return result
        return result;
    }
}
