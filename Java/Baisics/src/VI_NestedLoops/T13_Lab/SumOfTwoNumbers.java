package VI_NestedLoops.T13_Lab;

import java.util.Scanner;

public class SumOfTwoNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int min = Integer.parseInt(scanner.nextLine());
		int max = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		int combinations = 0;
		for (int a = min; a <= max; a++)
		{
			for (int b = min; b <= max; b++)
			{
				combinations++;
				int res = a + b;
				if (res == n)
				{
					System.out.println(String.format("Combination N:%d (%d + %d = %d)", combinations, a, b, res));
					scanner.close();
					return;
				}
			}
		}
		System.out.println(String.format("%d combinations - neither equals %d", combinations, n));
		scanner.close();
	}
}
