package IV_Methods.T14_Lab;

import java.util.Scanner;
/*2. Grades

Write a method that receives a grade between 2.00 and 6.00
and prints the corresponding grade in words:

· 2.00 – 2.99 - "Fail"
· 3.00 – 3.49 - "Poor"
· 3.50 – 4.49 - "Good"
· 4.50 – 5.49 - "Very good"
· 5.50 – 6.00 - "Excellent"*/

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the grade
        double grade = Double.parseDouble(sc.nextLine());
        sc.close();
        //invoke method and get return word
        String word = getGradeWord(grade);
        //print result
        System.out.println(word);
    }

    public static String getGradeWord(double grade) {
        //default message
        String result = "Fail";
        //get word depending on grade
        if (grade >= 5.5) {
            result = "Excellent";
        } else if (grade >= 4.5) {
            result = "Very good";
        } else if (grade >= 3.5) {
            result = "Good";
        } else if (grade >= 3.0) {
            result = "Poor";
        }
        //return result
        return result;
    }
}
