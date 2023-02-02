package V_List.T18_Exercise.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*2.	Car Race
Write a program to calculate the winner of a car race.
You will receive an array of numbers.
Each array element represents the time needed to pass through that step (the index).
There are going to be two cars.
One of them starts from the left side,
and the other one starts from the right side.
The middle index of the array is the finish line.
(The number of elements of the array will always be odd).
Calculate the total time for each racer to reach the finish
(the middle of the array)
and print the winner with his total time.
(The racer with less time).
If you have a zero in the array,
you must reduce the racer's time that reached it by 20% (from the time so far).

Print the result in the following format
"The winner is {left/right} with total time: {total time}",
formatted with one digit after the decimal point.
*/
public class CarRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the race times
        List<Integer> race = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the finish line and each how many laps is making
        int laps = race.size() / 2;
        //initial time
        double timeLeft = 0;
        double timeRight = 0;
        //for each lap
        for (int i = 0; i < laps; i++) {
            //take times for the current lap
            int timeL = race.get(i);
            int timeR = race.get(race.size() - 1 - i);
            //add the times
            timeLeft += timeL;
            timeRight += timeR;

            //if the current time is 0 the total time is decreased by 20%
            if (timeL == 0) {
                timeLeft *= 0.8;
            }
            if (timeR == 0) {
                timeRight *= 0.8;
            }
        }
        //print
        double winningTime = Math.min(timeLeft, timeRight);
        String winner = (timeLeft < timeRight) ? "left" : (timeRight < timeLeft) ? "right" : "";
        System.out.printf("The winner is %s with total time: %.1f", winner, winningTime);
        sc.close();
    }
}
