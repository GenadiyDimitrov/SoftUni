package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class NewHouse
{

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		int count = Integer.parseInt(scanner.nextLine());
		int budget = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double discount = 1.0;
		Double pricePer = 0.0;

		switch (type)
		{
		case "Roses":
			if (count > 80) discount = 0.9;
			pricePer = 5d;
			break;
		case "Dahlias":
			if (count > 90) discount = 0.85;
			pricePer = 3.8;
			break;
		case "Tulips":
			if (count > 80) discount = 0.85;
			pricePer = 2.8;
			break;
		case "Narcissus":
			if (count < 120) discount = 1.15;
			pricePer = 3d;
			break;
		case "Gladiolus":
			if (count < 80) discount = 1.2;
			pricePer = 2.5;
			break;
		}
		Double finalPrice = count * pricePer * discount;
		if (finalPrice <= budget)
		{
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, type, (budget - finalPrice));
		}
		else
		{
			System.out.printf("Not enough money, you need %.2f leva more.", (finalPrice - budget));
		}
	}
}
