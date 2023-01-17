package V_BasicSyntax.T5_Lab;

/*
8. Divisible by 3
Write a program that prints all the numbers from 1 to 100,
which are divisible by 3.
You have to use a single for loop.
The program should not receive input.
*/
public class DivisibleBy3 {
    public static void main(String[] args) {
        //For loop from 3 to 100 with step of 3
        for (int i = 3; i <= 100; i += 3) {
            //Print result
            System.out.println(i);
        }
    }
}
