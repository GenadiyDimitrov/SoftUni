package XI_RegularExpressions.T32_Exercise.Exercise;

import java.util.*;
public class RaceJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] racePpl = input.split(", ");
        input = sc.nextLine();
        while (!input.equals("end of race")) {
            input = sc.nextLine();
        }
        System.out.printf("1st place: %s", racePpl[0]);
        System.out.println();
        System.out.printf("2nd place: %s", racePpl[1]);
        System.out.println();
        System.out.printf("3rd place: %s", racePpl[2]);
        sc.close();
    }
}
