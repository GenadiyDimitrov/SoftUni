package IV_For.T10_Exercise;

import java.util.Scanner;

public class HalfSumElement
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			sum += a;
			if (max < a) max = a;
		}
		sum -= max;
		if (sum != max)
		{
			System.out.println("No");
			System.out.println(String.format("Diff = %d", Math.abs(max - sum)));
		}
		else
		{
			System.out.println("Yes");
			System.out.println(String.format("Sum = %d", max));
		}
		scanner.close();
	}
}
