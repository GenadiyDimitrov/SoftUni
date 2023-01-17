package V_While.T11_Lab;

import java.util.Scanner;

public class MinNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		while (true)
		{
			String input = scanner.nextLine();
			if (input.equals("Stop"))
			{
				break;
			}

			int n = Integer.parseInt(input);
			if (min > n) min = n;
		}
		System.out.println(min);
		scanner.close();
	}
}
