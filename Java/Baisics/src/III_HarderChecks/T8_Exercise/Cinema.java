package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class Cinema
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		int r = Integer.parseInt(scanner.nextLine());
		int c = Integer.parseInt(scanner.nextLine());
		scanner.close();

		switch (type)
		{
		case "Premiere":
			System.out.println(String.format("%.2f", (r * c * 12.0)));
			break;
		case "Normal":
			System.out.println(String.format("%.2f", (r * c * 7.5)));
			break;
		case "Discount":
			System.out.println(String.format("%.2f", (r * c * 5.0)));
			break;
		}
	}
}
