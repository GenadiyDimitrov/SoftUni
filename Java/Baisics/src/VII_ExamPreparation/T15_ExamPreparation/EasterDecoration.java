package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class EasterDecoration
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		Double profit = 0d;
		for (int i = 0; i < n; i++)
		{
			int purcheses = 0;
			Double price = 0d;
			String input = scanner.nextLine();
			while (!input.equals("Finish"))
			{
				switch (input)
				{
				case "basket":
					price += 1.5;
					break;
				case "wreath":
					price += 3.8;
					break;
				case "chocolate bunny":
					price += 7d;
					break;
				}

				purcheses++;
				input = scanner.nextLine();
			}
			if (purcheses % 2 == 0)
			{
				price *= 0.8;
			}
			System.out.println(String.format("You purchased %d items for %.2f leva.", purcheses, price));
			profit += price;
		}
		System.out.println(String.format("Average bill per client is: %.2f leva.", profit / n));

		scanner.close();
	}
}
