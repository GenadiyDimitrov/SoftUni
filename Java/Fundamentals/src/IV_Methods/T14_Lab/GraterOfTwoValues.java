package IV_Methods.T14_Lab;

import java.util.Scanner;

/*9.	Greater of Two Values
You are given two values of the same type as input.
The values can be of type int, char of String.
Create a method getMax() that returns the greater of the two values:
*/
public class GraterOfTwoValues {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //get the type to compare
        String type = sc.nextLine();
        //default result
        String result = "";
        switch (type) {
            case "int":
                //if type is int invoke int method
                result = getMaxInt();
                break;
            case "char":
                //if type is char invoke char method
                result = getMaxChar();
                break;
            case "string":
                //if type is string invoke string method
                result = getMaxString();
                break;
        }
        //if any result
        if (result.length() != 0) {
            //print result
            System.out.println(result);
        }
        sc.close();
    }

    static String getMaxInt() {
        //get the two inputs
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        //compare with math function
        return Math.max(a, b) + "";
    }

    static String getMaxString() {
        //get the two inputs
        String a = sc.nextLine();
        String b = sc.nextLine();
        //compare string with compareTo method -1 if b bigger; 0 if equal 1; if b is smaller
        return a.compareTo(b) < 0 ? b : a;
    }

    static String getMaxChar() {
        //get the two inputs
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        //compare as ints
        if (a >= b) {
            return a + "";
        }
        return b + "";
    }

}
