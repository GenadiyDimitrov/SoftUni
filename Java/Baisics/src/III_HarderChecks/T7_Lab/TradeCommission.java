package III_HarderChecks.T7_Lab;

import java.util.Scanner;

public class TradeCommission
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String city = scanner.nextLine();
		Double sales = Double.parseDouble(scanner.nextLine());

		if (sales >= 0)
		{
			if (sales > 10000)
			{
				if (city.equals("Sofia"))
				{
					System.out.println(String.format("%.2f", sales * 0.12));
				}
				else if (city.equals("Varna"))
				{
					System.out.println(String.format("%.2f", sales * 0.13));
				}
				else if (city.equals("Plovdiv"))
				{
					System.out.println(String.format("%.2f", sales * 0.145));
				}
				else
				{
					System.out.println("error");
				}
			}
			else if (sales > 1000)
			{
				if (city.equals("Sofia"))
				{
					System.out.println(String.format("%.2f", sales * 0.08));
				}
				else if (city.equals("Varna"))
				{
					System.out.println(String.format("%.2f", sales * 0.1));
				}
				else if (city.equals("Plovdiv"))
				{
					System.out.println(String.format("%.2f", sales * 0.12));
				}
				else
				{
					System.out.println("error");
				}
			}
			else if (sales > 500)
			{
				if (city.equals("Sofia"))
				{
					System.out.println(String.format("%.2f", sales * 0.07));
				}
				else if (city.equals("Varna"))
				{
					System.out.println(String.format("%.2f", sales * 0.075));
				}
				else if (city.equals("Plovdiv"))
				{
					System.out.println(String.format("%.2f", sales * 0.08));
				}
				else
				{
					System.out.println("error");
				}
			}
			else
			{
				if (city.equals("Sofia"))
				{
					System.out.println(String.format("%.2f", sales * 0.05));
				}
				else if (city.equals("Varna"))
				{
					System.out.println(String.format("%.2f", sales * 0.045));
				}
				else if (city.equals("Plovdiv"))
				{
					System.out.println(String.format("%.2f", sales * 0.055));
				}
				else
				{
					System.out.println("error");
				}
			}
		}
		else
		{
			System.out.println("error");
		}

		scanner.close();

	}
}
