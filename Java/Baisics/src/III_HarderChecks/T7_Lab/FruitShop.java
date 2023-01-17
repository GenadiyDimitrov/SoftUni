package III_HarderChecks.T7_Lab;

import java.util.Scanner;

public class FruitShop
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String fruit = scanner.nextLine();
		String day = scanner.nextLine();
		Double count = Double.parseDouble(scanner.nextLine());
		scanner.close();

		Boolean isCheaper = true;
		switch (day)
		{
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			break;
		case "Saturday":
		case "Sunday":
			isCheaper = false;
			break;

		default:
			System.out.println("error");
			return;
		}
		switch (fruit)
		{
		case "banana":
			System.out.println(String.format("%.2f", count * (isCheaper ? 2.5 : 2.7)));
			break;
		case "apple":
			System.out.println(String.format("%.2f", count * (isCheaper ? 1.2 : 1.25)));
			break;
		case "orange":
			System.out.println(String.format("%.2f", count * (isCheaper ? 0.85 : 0.9)));
			break;
		case "grapefruit":
			System.out.println(String.format("%.2f", count * (isCheaper ? 1.45 : 1.6)));
			break;
		case "kiwi":
			System.out.println(String.format("%.2f", count * (isCheaper ? 2.7 : 3d)));
			break;
		case "pineapple":
			System.out.println(String.format("%.2f", count * (isCheaper ? 5.5 : 5.6)));
			break;
		case "grapes":
			System.out.println(String.format("%.2f", count * (isCheaper ? 3.85 : 4.2)));
			break;
		default:
			System.out.println("error");
			break;
		}
	}
}
