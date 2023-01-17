package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class FishingBoat
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		int budget = Integer.parseInt(scanner.nextLine());
		String season = scanner.nextLine();
		int count = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double discount = 1.0;
		Double additionalDisc = 1.0;
		Double boatPrice = 0.0;

		if (count <= 6) discount = 0.9;
		else if (count <= 11) discount = 0.85;
		else discount = 0.75;

		if (count % 2 == 0 && !season.equals("Autumn")) additionalDisc = 0.95;
		switch (season)
		{
		case "Spring":
			boatPrice = 3000d;
			break;
		case "Summer":
		case "Autumn":
			boatPrice = 4200d;
			break;
		case "Winter":
			boatPrice = 2600d;
			break;
		}
		Double finalPrice = boatPrice * discount * additionalDisc;
		if (finalPrice <= budget)
		{
			System.out.printf("Yes! You have %.2f leva left.", (budget - finalPrice));
		}
		else
		{
			System.out.printf("Not enough money! You need %.2f leva.", (finalPrice - budget));
		}
	}
}
