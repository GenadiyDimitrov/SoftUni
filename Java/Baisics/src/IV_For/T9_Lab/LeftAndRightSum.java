package IV_For.T9_Lab;

import java.util.Scanner;

public class LeftAndRightSum
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int left = 0;
		int right = 0;
		for (int i = 0; i < n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			left += a;
		}
		for (int i = 0; i < n; i++)
		{
			int a = Integer.parseInt(scanner.nextLine());
			right += a;
		}
		if (left != right)
		{
			System.out.println(String.format("No, diff = %d", Math.abs(left - right)));
		}
		else
		{
			System.out.println(String.format("Yes, sum = %d", left));
		}
		scanner.close();
	}
}
