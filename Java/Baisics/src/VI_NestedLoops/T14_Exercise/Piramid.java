package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class Piramid
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int c = 1;
		for (int r = 1; r <= n; r++)
		{
			for (int p = 1; p <= r; p++)
			{
				System.out.print(String.format("%d ", c++));
				if (c > n)
				{
					scanner.close();
					return;
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
