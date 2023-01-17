package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class EasterEggs
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		int greens = 0;
		int reds = 0;
		int oranges = 0;
		int blues = 0;
		String color = "";
		int max = 0;
		for (int i = 0; i < n; i++)
		{
			String egg = scanner.nextLine();

			switch (egg)
			{
			case "red":
				reds++;
				if (reds > max)
				{
					max = reds;
					color = "red";
				}
				break;
			case "orange":
				oranges++;
				if (oranges > max)
				{
					max = oranges;
					color = "orange";
				}
				break;
			case "blue":
				blues++;
				if (blues > max)
				{
					max = blues;
					color = "blue";
				}
				break;
			case "green":
				greens++;
				if (greens > max)
				{
					max = greens;
					color = "green";
				}
				break;
			}
		}
		System.out.println(String.format("Red eggs: %d", reds));
		System.out.println(String.format("Orange eggs: %d", oranges));
		System.out.println(String.format("Blue eggs: %d", blues));
		System.out.println(String.format("Green eggs: %d", greens));
		System.out.println(String.format("Max eggs: %d -> %s", max, color));

		scanner.close();
	}
}
