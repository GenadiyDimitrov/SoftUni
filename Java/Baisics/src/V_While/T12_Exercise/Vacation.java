package V_While.T12_Exercise;

import java.util.Scanner;

public class Vacation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double price = Double.parseDouble(scanner.nextLine());
		Double balance = Double.parseDouble(scanner.nextLine());
		int dayBy = 0;
		int spendDays = 5;
		while (true)
		{
			dayBy++;

			String line = scanner.nextLine();
			Double money = Double.parseDouble(scanner.nextLine());

			if (line.equals("save"))
			{
				spendDays = 5;
				balance += money;
				if (balance >= price)
				{
					System.out.println(String.format("You saved the money for %d days.", dayBy));
					scanner.close();
					return;
				}
			}
			else if (line.equals("spend"))
			{
				balance -= money;
				if (balance < 0) balance = 0d;
				spendDays--;
				if (spendDays <= 0)
				{
					System.out.println("You can't save the money.");
					System.out.println(dayBy);
					scanner.close();
					return;
				}
			}
		}
	}
}
