package V_BasicSyntax.T6_Exercise.Exercises;

import java.util.Scanner;

/*
5. Login
You will be given a string representing a username.
The password will be that username reversed.
Until you receive the correct password,
print on the console "Incorrect password. Try again.".
When you receive the correct password,
print "User {username} logged in."
However, on the fourth try,
if the password is still not correct,
print "User {username} blocked!" and end the program.
*/
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the input
        String un = sc.nextLine();
        //Generate reverse user name for password -- Can be done with reverse for loop
        String pw = new StringBuilder(un).reverse().toString();
        //get the first Try for correct password
        String s = sc.nextLine();
        //Max tries
        int tries = 3;

        //While password is not equal to the correct one and we have more tries to spare
        while (!s.equals(pw) && tries > 0) {
            //Print incorrect password
            System.out.println("Incorrect password. Try again.");
            //get next try
            s = sc.nextLine();
            //Decrease tries
            tries--;
        }
        //if we managed to input the right password before the limit of tries
        if (tries > 0) {
            //Print we are logged in
            System.out.printf("User %s logged in.", un);
        } else {
            //Else we are blocked
            System.out.printf("User %s blocked!", un);
        }
        sc.close();
    }
}
