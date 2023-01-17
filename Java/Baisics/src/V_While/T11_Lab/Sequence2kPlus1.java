package V_While.T11_Lab;

import java.util.Scanner;

public class Sequence2kPlus1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int calc = 1;
		while (calc <= n)
		{
			System.out.println(calc);
			calc = calc * 2 + 1;
		}
		scanner.close();
	}
}
