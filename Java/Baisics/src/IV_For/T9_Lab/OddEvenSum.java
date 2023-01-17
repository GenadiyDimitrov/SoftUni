package IV_For.T9_Lab;

import java.util.Scanner;

public class OddEvenSum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int odd = 0;
		int even = 0;
		for (int i = 1; i <= n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			if (i % 2 == 0)
			{
				even += a;
			}
			else
			{
				odd += a;
			}
		}
		if (odd != even)
		{
			System.out.println("No");
			System.out.println(String.format("Diff = %d", Math.abs(odd - even)));
		}
		else
		{
			System.out.println("Yes");
			System.out.println(String.format("Sum = %d", odd));
		}
		scanner.close();
	}
}
