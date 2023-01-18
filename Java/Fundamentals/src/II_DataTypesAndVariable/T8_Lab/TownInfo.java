package II_DataTypesAndVariable.T8_Lab;

import java.util.Scanner;

/*
4. Town Info
You will be given 3 lines of input.
On the first line, you will be given the name of the town,
on the second – the population,
and on the third – the area.

Use the correct data types and print the result in the following format:
"Town {town name} has population of {population} and area {area} square km.".*/
public class TownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting input
        String name = sc.nextLine();
        long population = Long.parseLong(sc.nextLine());
        int area = Integer.parseInt(sc.nextLine());
        //print result
        System.out.printf("Town %s has population of %d and area %d square km.", name, population, area);
        sc.close();
    }
}
