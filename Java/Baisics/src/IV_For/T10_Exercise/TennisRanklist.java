package IV_For.T10_Exercise;

import java.util.Scanner;

public class TennisRanklist
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int sp = Integer.parseInt(scanner.nextLine());

		int all = 0;
		int wins = 0;
		for (int i = 0; i < n; i++)
		{
			String r = scanner.nextLine();
			if (r.equals("W"))
			{
				wins++;
				all += 2000;
			}
			else if (r.equals("F"))
			{
				all += 1200;
			}
			else if (r.equals("SF"))
			{
				all += 720;
			}
		}
		System.out.println(String.format("Final points: %d", all + sp));
		System.out.println(String.format("Average points: %d", all / n));
		System.out.println(String.format("%.2f", ((double) wins / (double) n * 100d)) + "%");
		scanner.close();
	}
}
