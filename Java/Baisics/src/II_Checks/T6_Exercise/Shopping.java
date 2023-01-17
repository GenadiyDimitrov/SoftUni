package II_Checks.T6_Exercise;

import java.util.Scanner;

public class Shopping
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double budget = Double.parseDouble(scanner.nextLine());
		int gpu = Integer.parseInt(scanner.nextLine());
		int cpu = Integer.parseInt(scanner.nextLine());
		int ram = Integer.parseInt(scanner.nextLine());

		Double gpuPrice = gpu * 250.0;
		Double cpuPrice = gpuPrice * 0.35 * cpu;
		Double ramPrice = gpuPrice * 0.1 * ram;
		Double allPrice = gpuPrice + cpuPrice + ramPrice;

		if (gpu > cpu)
		{
			allPrice *= 0.85;
		}

		if (allPrice <= budget)
		{
			String result = String.format("%.2f", (budget - allPrice));
			System.out.println("You have " + result + " leva left!");
		}
		else
		{
			String result = String.format("%.2f", (allPrice - budget));
			System.out.println("Not enough money! You need " + result + " leva more!");
		}
		scanner.close();
	}
}
