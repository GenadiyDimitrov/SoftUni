package III_HarderChecks.T7_Lab;

import java.util.Scanner;

public class SmallShop
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String item = scanner.nextLine();
		String city = scanner.nextLine();
		Double count = Double.parseDouble(scanner.nextLine());
		switch (city)
		{
		case "Varna":
			itemVarna(item, count);
			break;
		case "Plovdiv":
			itemPlovdiv(item, count);
			break;
		case "Sofia":
			itemSofia(item, count);
			break;
		}

		scanner.close();
	}

	private static void itemVarna(String item, Double count)
	{
		Double price = 0.0;
		switch (item)
		{
		case "coffee":
			price = 0.45;
			break;
		case "water":
			price = 0.7;
			break;
		case "beer":
			price = 1.1;
			break;
		case "sweets":
			price = 1.35;
			break;
		case "peanuts":
			price = 1.55;
			break;
		}

		System.out.println(price * count);
	}

	private static void itemPlovdiv(String item, Double count)
	{
		Double price = 0.0;
		switch (item)
		{
		case "coffee":
			price = 0.4;
			break;
		case "water":
			price = 0.7;
			break;
		case "beer":
			price = 1.15;
			break;
		case "sweets":
			price = 1.3;
			break;
		case "peanuts":
			price = 1.5;
			break;
		}

		System.out.println(price * count);
	}

	private static void itemSofia(String item, Double count)
	{
		Double price = 0.0;
		switch (item)
		{
		case "coffee":
			price = 0.5;
			break;
		case "water":
			price = 0.8;
			break;
		case "beer":
			price = 1.2;
			break;
		case "sweets":
			price = 1.45;
			break;
		case "peanuts":
			price = 1.6;
			break;
		}

		System.out.println(price * count);
	}
}
