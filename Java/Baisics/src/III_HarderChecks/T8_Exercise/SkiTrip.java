package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class SkiTrip
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int days = Integer.parseInt(scanner.nextLine());
		String suit = scanner.nextLine();
		String star = scanner.nextLine();
		scanner.close();
		Double price = 0.0;

		Double discount = 1.0;
		switch (suit)
		{
		case "room for one person":
			price = 18.0 * (days - 1);
			break;
		case "apartment":
			if (days < 10) discount = 0.7;
			else if (days >= 10 && days <= 15) discount = 0.65;
			else discount = 0.5;
			price = 25.0 * (days - 1);
			break;
		case "president apartment":
			if (days < 10) discount = 0.9;
			else if (days >= 10 && days <= 15) discount = 0.85;
			else discount = 0.8;
			price = 35.0 * (days - 1);
			break;
		}
		price *= discount;
		if (star.equals("positive"))
		{
			price *= 1.25;
		}
		else if (star.equals("negative"))
		{
			price *= 0.9;
		}
		System.out.printf("%.2f", price);
	}
}
