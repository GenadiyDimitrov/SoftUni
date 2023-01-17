package IV_For.T10_Exercise;

import java.util.Scanner;

public class Histogram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] percents = new int[5];
		for (int i = 0; i < n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			if (a < 200)
			{
				percents[0]++;
			}
			else if (a >= 200 && a < 400)
			{
				percents[1]++;
			}
			else if (a >= 400 && a < 600)
			{
				percents[2]++;
			}
			else if (a >= 600 && a < 800)
			{
				percents[3]++;
			}
			else
			{
				percents[4]++;
			}
		}
		for (int i = 0; i < percents.length; i++)
		{
			System.out.println(String.format("%.2f", ((double) percents[i] / (double) n * 100d)) + "%");
		}
		scanner.close();
	}
}
