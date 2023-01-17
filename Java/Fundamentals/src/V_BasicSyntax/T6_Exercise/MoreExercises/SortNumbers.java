package V_BasicSyntax.T6_Exercise.MoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
1. Sort Numbers
Read three real numbers and sort them in descending order.
Print each number on a new line.
*/
public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Generate a list
        List<Integer> list = new ArrayList<>();
        //For the next 3 lines
        for (int i = 0; i < 3; i++) {
            //read input and add it in list
            list.add(Integer.parseInt(sc.nextLine()));
        }
        //sort list
        Collections.sort(list);
        //reverse list
        Collections.reverse(list);
        //print list
        for (int i : list
        ) {
            System.out.println(i);
        }
        sc.close();
    }
}
