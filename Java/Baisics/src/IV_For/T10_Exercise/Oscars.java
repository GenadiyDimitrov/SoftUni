package IV_For.T10_Exercise;

import java.util.Scanner;

public class Oscars
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String actor = scanner.nextLine();
		Double points = Double.parseDouble(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++)
		{
			String name = scanner.nextLine();
			Double p = Double.parseDouble(scanner.nextLine());

			points += ((name.length() * p) / 2);
			if (points > 1250.5)
			{
				System.out.println(String.format("Congratulations, %s got a nominee for leading role with %.1f!", actor, points));
				scanner.close();
				return;
			}
		}

		System.out.println(String.format("Sorry, %s you need %.1f more!", actor, 1250.5 - points));
		scanner.close();
	}
}
