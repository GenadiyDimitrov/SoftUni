package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class HairSalon
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int target = Integer.parseInt(s.nextLine());
		String type = s.nextLine();
		int profit = 0;
		while (!type.equals("closed"))
		{
			String subType = s.nextLine();
			switch (type)
			{
			case "haircut":
				switch (subType)
				{
				case "mens":
					profit += 15;
					break;
				case "ladies":
					profit += 20;
					break;
				case "kids":
					profit += 10;
					break;
				}

				break;
			case "color":
				switch (subType)
				{
				case "touch up":
					profit += 20;
					break;
				case "full color":
					profit += 30;
					break;
				}
				break;
			}
			if (profit >= target) break;
			type = s.nextLine();
		}
		if (profit >= target)
		{
			System.out.println("You have reached your target for the day!");
		}
		else
		{
			System.out.println(String.format("Target not reached! You need %dlv. more.", target - profit));
		}
		System.out.println(String.format("Earned money: %dlv.", profit));

		s.close();
	}
}
