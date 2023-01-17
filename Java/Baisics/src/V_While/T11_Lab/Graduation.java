package V_While.T11_Lab;

import java.util.Scanner;

public class Graduation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Double sum = 0d;
		for (int i = 1; i <= 12; i++)
		{
			Double n = Double.parseDouble(scanner.nextLine());
			if (n < 4.0)
			{
				n = Double.parseDouble(scanner.nextLine());
				if (n < 4.0)
				{
					System.out.println(String.format("%s has been excluded at %d grade", name, i));
					scanner.close();
					return;
				}
				else
				{
					sum += n;
				}
			}
			else
			{
				sum += n;
			}
		}
		System.out.println(String.format("%s graduated. Average grade: %.2f", name, sum / 12d));
		scanner.close();
	}
}
