package IV_For.T9_Lab;

import java.util.Scanner;

public class NumberSequence
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			if (a > max) max = a;
			if (a < min) min = a;
		}
		System.out.println(String.format("Max number: %d", max));
		System.out.println(String.format("Min number: %d", min));
		scanner.close();
	}
}
