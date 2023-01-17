package IV_For.T9_Lab;

import java.util.Scanner;

public class NumbersFrom1ToNBy3
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		for (int i = 1; i <= n; i += 3)
		{
			System.out.println(i);
		}
	}
}
