package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class Darts
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String playerName = scanner.nextLine();
		String input = scanner.nextLine();
		int full = 301; int shots = 0;
		int failed = 0;
		while (!input.equals("Retire"))
		{
			int n = Integer.parseInt(scanner.nextLine());

			switch (input)
			{
			case "Double":
				n *= 2;
				break;
			case "Triple":
				n *= 3;
				break;
			}
			if (full - n < 0)
			{
				failed++;
			}
			else
			{
				full -= n;
				shots++;
			}
			if (full == 0)
			{
				break;
			}
			input = scanner.nextLine();
		}
		if (full == 0)
		{
			System.out.println(String.format("%s won the leg with %d shots.", playerName, shots));
		}
		else
		{

			System.out.println(String.format("%s retired after %d unsuccessful shots.", playerName, failed));
		}

		scanner.close();
	}
}
