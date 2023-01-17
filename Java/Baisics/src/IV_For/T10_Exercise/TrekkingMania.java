package IV_For.T10_Exercise;

import java.util.Scanner;

public class TrekkingMania
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] percents = new int[5];
		int all = 0;
		for (int i = 0; i < n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			all += a;
			if (a < 6)
			{
				percents[0] += a;
			}
			else if (a >= 6 && a < 13)
			{
				percents[1] += a;
			}
			else if (a >= 13 && a < 26)
			{
				percents[2] += a;
			}
			else if (a >= 26 && a < 41)
			{
				percents[3] += a;
			}
			else
			{
				percents[4] += a;
			}
		}
		for (int i = 0; i < percents.length; i++)
		{
			System.out.println(String.format("%.2f", ((double) percents[i] / (double) all * 100d)) + "%");
		}
		scanner.close();
	}
}
