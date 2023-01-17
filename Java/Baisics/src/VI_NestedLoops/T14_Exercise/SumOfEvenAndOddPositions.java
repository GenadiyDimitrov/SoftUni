package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class SumOfEvenAndOddPositions
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int start = Integer.parseInt(scanner.nextLine());
		int end = Integer.parseInt(scanner.nextLine());
		for (int i = start; i <= end; i++)
		{
			String str = String.valueOf(i);
			int even = 0;
			int odd = 0;
			for (int p = 0; p < str.length(); p++)
			{
				int n = Integer.parseInt(String.valueOf(str.charAt(p)));
				if ((p + 1) % 2 == 0)
				{
					even += n;
				}
				else
				{
					odd += n;
				}
			}
			if (odd == even)
			{
				System.out.printf("%d ", i);
			}
		}
		scanner.close();
	}
}
