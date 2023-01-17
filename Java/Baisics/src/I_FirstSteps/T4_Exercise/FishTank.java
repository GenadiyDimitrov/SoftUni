package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class FishTank
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine());
		int y = Integer.parseInt(scanner.nextLine());
		int z = Integer.parseInt(scanner.nextLine());
		Double percent = Double.parseDouble(scanner.nextLine());

		Double liters = ((x * y * z) / 1000d);
		liters *= (1 - (percent / 100));
		String message = liters.toString();
		System.out.println(message);
		scanner.close();
	}
}
