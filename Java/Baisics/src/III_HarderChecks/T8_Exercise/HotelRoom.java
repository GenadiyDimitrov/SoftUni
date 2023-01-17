package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class HotelRoom
{
	public static void main(String[] args)
	{
		Double[][] prices = new Double[3][2];
		prices[0][0] = 50d;
		prices[0][1] = 65d;
		prices[1][0] = 75.2;
		prices[1][1] = 68.7;
		prices[2][0] = 76d;
		prices[2][1] = 77d;

		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		int count = Integer.parseInt(scanner.nextLine());
		scanner.close();

		int c = 0;
		Double apDc = 1.0;
		Double stDc = 1.0;

		switch (month)
		{
		case "May":
		case "October":
			if (count > 14) stDc = 0.7;
			else if (count > 7) stDc = 0.95;
			c = 0;
			break;
		case "June":
		case "September":
			if (count > 14) stDc = 0.8;
			c = 1;
			break;
		case "July":
		case "August":
			c = 2;
			break;
		}

		if (count > 14) apDc = 0.9;
		System.out.println(String.format("Apartment: %.2f lv.", prices[c][1] * count * apDc));
		System.out.println(String.format("Studio: %.2f lv.", prices[c][0] * count * stDc));
	}
}
