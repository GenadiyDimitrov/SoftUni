package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class Jurney
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double budget = Double.parseDouble(scanner.nextLine());
		String season = scanner.nextLine();
		scanner.close();

		String place = season.equals("summer") ? "Camp" : "Hotel";
		String location = "";
		if (budget <= 100d)
		{
			location = "Bulgaria";
			budget *= season.equals("summer") ? 0.3 : 0.7;
		}
		else if (budget <= 1000d)
		{
			location = "Balkans";
			budget *= season.equals("summer") ? 0.4 : 0.8;
		}
		else
		{
			location = "Europe";
			place = "Hotel";
			budget *= 0.9;
		}

		System.out.println(String.format("Somewhere in %s", location));
		System.out.println(String.format("%s - %.2f", place, budget));
	}

}
