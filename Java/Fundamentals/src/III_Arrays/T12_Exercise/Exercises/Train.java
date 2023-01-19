package III_Arrays.T12_Exercise.Exercises;

import java.util.Scanner;

/*1.	Train
You will be given a count of wagons in a train n.
On the next n lines,
you will receive how many people will get on that wagon.
In the end, print the whole train
and the sum of the people on the train.
*/
public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the wagons count
        int wagons = Integer.parseInt(sc.nextLine());
        //generate a train
        int[] train = new int[wagons];
        //initial sum
        int allPeople = 0;
        //for all wagons
        for (int i = 0; i < wagons; i++) {
            //get the ppl that get on
            int people = Integer.parseInt(sc.nextLine());
            //update the sum of all ppl
            allPeople += people;
            //update the current wagon with the people in it
            train[i] = people;
        }
        //for all the wagons(with ppl count) in the train
        for (int people : train) {
            //print the train as is
            System.out.printf("%d ", people);
        }
        //print the sum of all people
        System.out.printf("%n%d", allPeople);
        sc.close();
    }
}
