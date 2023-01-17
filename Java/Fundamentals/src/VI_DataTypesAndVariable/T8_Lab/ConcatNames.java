package VI_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
5. Concat Names
Read two names and a delimiter. Print the names joined by the delimiter
*/
public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        String del = sc.nextLine();

        System.out.printf("%s%s%s", n1, del, n2);
        sc.close();
    }
}
