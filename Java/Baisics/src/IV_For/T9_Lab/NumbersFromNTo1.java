package IV_For.T9_Lab;

import java.util.Scanner;

public class NumbersFromNTo1
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		for (int i = n; i > 0; i--)
		{
			System.out.println(i);
		}
	}

}
