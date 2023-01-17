package V_While.T11_Lab;

import java.util.Scanner;

public class SumNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int max = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		while (true)
		{
			sum += Integer.parseInt(scanner.nextLine());
			if (sum >= max)
			{
				System.out.println(sum);
				break;
			}
		}
		scanner.close();
	}
}
