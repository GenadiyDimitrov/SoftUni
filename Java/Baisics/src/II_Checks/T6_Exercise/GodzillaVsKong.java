package II_Checks.T6_Exercise;

import java.util.Scanner;

public class GodzillaVsKong
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double max = Double.parseDouble(scanner.nextLine());
		int statics = Integer.parseInt(scanner.nextLine());
		Double clots = Double.parseDouble(scanner.nextLine());

		Double price = statics * clots;
		if (statics > 150)
		{
			price *= 0.9;
		}
		price += max * 0.1;
		if (max >= price)
		{
			String result = String.format("%.2f", (max - price));
			System.out.println("Action!");
			System.out.println("Wingard starts filming with " + result + " leva left.");
		}
		else
		{
			String result = String.format("%.2f", (price - max));
			System.out.println("Not enough money!");
			System.out.println("Wingard needs " + result + " leva more.");
		}
		scanner.close();
	}
}
