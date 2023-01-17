package VI_NestedLoops.T13_Lab;

import java.util.Scanner;

public class Combinations
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int combinations = 0;
		for (int a = 0; a <= n; a++)
		{
			for (int b = 0; b <= n; b++)
			{
				for (int c = 0; c <= n; c++)
				{
					if (a + b + c == n)
					{
						combinations++;
					}
				}
			}
		}
		System.out.println(combinations);
		scanner.close();
	}

}
