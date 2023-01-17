package III_HarderChecks.T7_Lab;

import java.util.Scanner;

public class PersonalTitles
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double age = Double.parseDouble(scanner.nextLine());
		String input = scanner.nextLine();

		if (age < 16)
		{
			switch (input)
			{
			case "f":
				System.out.println("Miss");
				break;
			case "m":
				System.out.println("Master");
				break;

			default:
				System.out.println("unknown");
				break;
			}
		}
		else
		{
			switch (input)
			{
			case "f":
				System.out.println("Ms.");
				break;
			case "m":
				System.out.println("Mr.");
				break;

			default:
				System.out.println("unknown");
			}
		}
		scanner.close();
	}
}
