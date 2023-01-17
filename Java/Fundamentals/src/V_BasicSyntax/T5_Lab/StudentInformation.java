package V_BasicSyntax.T5_Lab;

import java.util.Scanner;

/*
1. Student Information
You will be given 3 lines of input –
student name, age, and average grade.
Your task is to print all the info about the student in the following format:
"Name: {student name}, Age: {student age}, Grade: {student grade}".
*/
public class StudentInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the 3 inputs
        String name = sc.nextLine();
        Integer age = Integer.parseInt(sc.nextLine());
        Double grade = Double.parseDouble(sc.nextLine());


        //Format the output
        System.out.printf("Name: %s, Age: %d, Grade: %.2f%n", name, age, grade);

        sc.close();
    }

}
