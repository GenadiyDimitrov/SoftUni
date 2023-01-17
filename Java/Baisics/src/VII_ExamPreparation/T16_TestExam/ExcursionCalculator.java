package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class ExcursionCalculator
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int people = Integer.parseInt(s.nextLine());
		String season = s.nextLine();
		Double price = 0d;
		if (people <= 5)
		{
			switch (season)
			{
			case "spring":
				price = 50.0 * people;
				break;
			case "summer":
				price = 48.5 * people * 0.85;
				break;
			case "autumn":
				price = 60.0 * people;
				break;
			case "winter":
				price = 86.0 * people * 1.08;
				break;
			}
		}
		else
		{
			switch (season)
			{
			case "spring":
				price = 48.0 * people;
				break;
			case "summer":
				price = 45.0 * people * 0.85;
				break;
			case "autumn":
				price = 49.5 * people;
				break;
			case "winter":
				price = 85.0 * people * 1.08;
				break;
			}
		}
		System.out.println(String.format("%.2f leva.", price));

		s.close();
	}
}
