package VI_DataTypesAndVariable.T9_Exercise.Exersises;

import java.util.Scanner;

/*3. Elevator

Calculate how many courses will be needed
to elevate n persons by using an elevator
with a capacity of p persons.

The input holds two lines:
the number of people n and the capacity p of the elevator.*/
public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input
        int people = Integer.parseInt(sc.nextLine());
        int cap = Integer.parseInt(sc.nextLine());

        //get the full number
        int courses = people / cap;
        //if there is not enough room for the last person add another course
        if (people % cap != 0) {
            courses++;
        }
        //OR
        //int courses = (int) Math.ceil((double) n / p);

        System.out.println(courses);
        sc.close();
    }
}
