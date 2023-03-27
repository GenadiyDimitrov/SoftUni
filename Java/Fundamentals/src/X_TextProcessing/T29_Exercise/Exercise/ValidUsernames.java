package X_TextProcessing.T29_Exercise.Exercise;

import java.util.Scanner;

/*1.	Valid Usernames
Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
A valid username is:
•	Has a length of between 3 and 16 characters.
•	It contains only letters, numbers, hyphens, and underscores.
*/
public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = sc.nextLine().split(", ");
        for (int i = 0; i < usernames.length; i++) {
            String username = usernames[i];
            if (username.length() >= 3 && username.length() <= 16) {
                if (username.matches("^[a-zA-Z0-9_-]+$")) {
                    continue;
                }
            }
            usernames[i] = "";
        }
        for (var un : usernames) {
            if (un.length() > 0)
                System.out.println(un);
        }
        sc.close();
    }
}
