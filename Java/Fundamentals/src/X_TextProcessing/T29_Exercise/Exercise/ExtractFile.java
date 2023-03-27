package X_TextProcessing.T29_Exercise.Exercise;

import java.util.Scanner;

/*3.	Extract File
Write a program that reads the path to a file and subtracts the file name and its extension.
*/
public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String[] pathParts = path.split("\\\\");
        String[] file = pathParts[pathParts.length - 1].split("\\.");
        System.out.printf("File name: %s%n",file[0]);
        System.out.printf("File extension: %s",file[1]);
        sc.close();
    }
}
