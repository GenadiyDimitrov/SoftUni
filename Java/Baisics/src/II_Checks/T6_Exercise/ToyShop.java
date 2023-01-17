package II_Checks.T6_Exercise;

import java.util.Scanner;

public class ToyShop
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double trip = Double.parseDouble(scanner.nextLine());
		int puzzels = Integer.parseInt(scanner.nextLine());
		int dolls = Integer.parseInt(scanner.nextLine());
		int bears = Integer.parseInt(scanner.nextLine());
		int minions = Integer.parseInt(scanner.nextLine());
		int trucks = Integer.parseInt(scanner.nextLine());

		Double discount = 1.0;
		int allCount = puzzels + dolls + bears + minions + trucks;
		if (allCount >= 50)
		{
			discount = 0.75;
		}

		Double profit = puzzels * 2.6 + dolls * 3d + bears * 4.1 + minions * 8.2 + trucks * 2d;
		profit *= discount;
		profit *= 0.9;

		if (profit >= trip)
		{
			String result = String.format("%.2f", (profit - trip));
			System.out.println("Yes! " + result + " lv left.");
		}
		else
		{
			String result = String.format("%.2f", (trip - profit));
			System.out.println("Not enough money! " + result+ " lv needed.");
		}
		scanner.close();
	}

}
