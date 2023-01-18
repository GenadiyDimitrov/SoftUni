package II_DataTypesAndVariable.T9_Exercise.Exercises;

import java.util.Scanner;

/*11. *Snowballs

Tony and Andi love playing in the snow and having snowball fights,
but they always argue about which makes the best snowballs.
They have decided to involve you in their fray by
making you write a program that calculates snowball data and outputs the best snowball value.

You will receive N – an integer, the number of snowballs being made by Tony and Andi.

For each snowball, you will receive 3 input lines:
· On the first line, you will get the snowballSnow – an integer.
· On the second line, you will get the snowballTime – an integer.
· On the third line, you will get the snowballQuality – an integer.

For each snowball, you must calculate its snowballValue by the following formula:
(snowballSnow / snowballTime) ^ snowballQuality

In the end, you must print the highest calculated snowballValue.

-Input
· On the first input line, you will receive N – the number of snowballs.
· On the next N * 3 input lines, you will receive data about snowballs.

-Output
· As output, you must print the highest calculated snowballValue, by the formula specified above.
· The output format is: "{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"

-Constraints
· The number of snowballs (N) will be an integer in the range [0, 100].
· The snowballSnow is an integer in the range [0, 1000].
· The snowballTime is an integer in the range [1, 500].
· The snowballQuality is an integer in the range [0, 100].
· Allowed working time / memory: 100ms / 16MB.*/
public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get count
        int n = Integer.parseInt(sc.nextLine());
        //initial stats
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = Double.MIN_VALUE;
        //foreach snowball
        for (int i = 0; i < n; i++) {
            //get info
            int snow = Integer.parseInt(sc.nextLine());
            int time = Integer.parseInt(sc.nextLine());
            int quality = Integer.parseInt(sc.nextLine());
            //calculate value
            double value = Math.pow(((double) snow / time), quality);
            //if better than before override
            if (value > bestValue) {
                bestValue = value;
                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
            }
        }
        //print result
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
        sc.close();
    }
}
