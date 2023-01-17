package V_While.T11_Lab;

import java.util.Scanner;

public class AccountBalance
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double total = 0d;
		while (true)
		{
			String input = scanner.nextLine();
			if(input.equals("NoMoreMoney"))
			{
				break;
			}
			
			Double n = Double.parseDouble(input);
			if (n >= 0)
			{
				total += n;
				System.out.println(String.format("Increase: %.2f", n));
			}
			else
			{
				System.out.println("Invalid operation!");
				break;
			}
		}
		System.out.println(String.format("Total: %.2f", total));
		scanner.close();
	}
}
