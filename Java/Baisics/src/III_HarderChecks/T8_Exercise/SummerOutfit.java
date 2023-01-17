package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class SummerOutfit
{

	public static void main(String[] args)
	{
		String[][] outfit = new String[3][6];
		outfit[0][0] = "Sweatshirt";
		outfit[0][1] = "Sneakers";
		outfit[0][2] = "Shirt";
		outfit[0][3] = "Moccasins";
		outfit[0][4] = "T-Shirt";
		outfit[0][5] = "Sandals";

		outfit[1][0] = "Shirt";
		outfit[1][1] = "Moccasins";
		outfit[1][2] = "T-Shirt";
		outfit[1][3] = "Sandals";
		outfit[1][4] = "Swim Suit";
		outfit[1][5] = "Barefoot";

		outfit[2][0] = "Shirt";
		outfit[2][1] = "Moccasins";
		outfit[2][2] = "Shirt";
		outfit[2][3] = "Moccasins";
		outfit[2][4] = "Shirt";
		outfit[2][5] = "Moccasins";

		Scanner scanner = new Scanner(System.in);
		int deg = Integer.parseInt(scanner.nextLine());
		String timeOfDay = scanner.nextLine();
		scanner.close();
		int c = 0;
		int d = 0;

		switch (timeOfDay)
		{
		case "Morning":
			d = 0;
			break;
		case "Afternoon":
			d = 1;
			break;
		case "Evening":
			d = 2;
			break;
		}
		if (deg >= 10 && deg <= 18)
		{
			c = 0;
		}
		else if (deg > 10 && deg <= 24)
		{
			c = 2;
		}
		else if (deg >= 25)
		{
			c = 4;
		}
		System.out.println("It's " + deg + " degrees, get your " + outfit[d][c] + " and " + outfit[d][c + 1] + ".");
	}
}
