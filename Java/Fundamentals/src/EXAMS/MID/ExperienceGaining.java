package EXAMS.MID;

import java.util.Scanner;

/*
1. ExperienceGaining
Write a program to calculate if a player have enough experience tu purchase next tire item.

-Input
1. Needed exp -> double experience
2. Total Battles -> integer
3. Each battle experience -> double experience
 */
public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read the needed exp
        double needExp = Double.parseDouble(sc.nextLine());
        //read the battle count
        int battlesCount = Integer.parseInt(sc.nextLine());
        //fore each battle
        for (int i = 1; i <= battlesCount; i++) {
            //take current exp
            double battleExp = Double.parseDouble(sc.nextLine());
            //every 3 battles 15% more
            if (i % 3 == 0) {
                battleExp *= 1.15;
            }
            //every 5 battles 10% less
            if (i % 5 == 0) {
                battleExp *= 0.9;
            }
            //every 15 battles 5% more
            if (i % 15 == 0) {
                battleExp *= 1.05;
            }
            //subtract current from needed
            needExp -= battleExp;
            //if we don't need more
            if (needExp <= 0d) {
                System.out.printf("Player successfully collected his needed experience for %d battles.", i);
                return;
            }
        }
        //else print needed
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", needExp);
        sc.close();
    }
}
