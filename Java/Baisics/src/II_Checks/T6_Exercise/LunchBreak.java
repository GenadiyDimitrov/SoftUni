package II_Checks.T6_Exercise;

import java.util.Scanner;

public class LunchBreak
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String seriesName = scanner.nextLine();
		int length = Integer.parseInt(scanner.nextLine());
		int breakLength = Integer.parseInt(scanner.nextLine());

		Double lunchTime = breakLength / 8d;
		Double restTime = breakLength / 4d;

		Double leftTime = breakLength - lunchTime - restTime;
		if (leftTime >= length)
		{
			int result = (int) Math.round(leftTime - length + 0.4);
			System.out.println("You have enough time to watch " + seriesName + " and left with " + result + " minutes free time.");
		}
		else
		{
			int result = (int) Math.round(length - leftTime + 0.4);
			System.out.println("You don't have enough time to watch " + seriesName + ", you need " + result + " more minutes.");
		}
		scanner.close();
	}
}
