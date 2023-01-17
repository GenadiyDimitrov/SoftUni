package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class SpecialNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 1111; i < 10000; i++)
		{
			String str = String.valueOf(i);
			if (str.contains("0")) continue;
			Boolean special = true;
			for (int p = 0; p < str.length(); p++)
			{
				int a = Integer.parseInt(String.valueOf(str.charAt(p)));
				if (n % a != 0)
				{
					special = false;
					break;
				}
			}
			if (special)
			{
				System.out.printf("%d ", i);
			}
		}
		scanner.close();
	}
}
