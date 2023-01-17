package IV_For.T10_Exercise;

import java.util.Scanner;

public class CleverLily
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		Double WMprice = Double.parseDouble(scanner.nextLine());
		int toyprice = Integer.parseInt(scanner.nextLine());
		int money = 0;
		int toycount = 0;
		int a = 1;
		for (int i = 1; i <= age; i++)
		{
			if (i % 2 == 0)
			{
				money += 10 * a++ - 1;
			}
			else
			{
				toycount++;
			}
		}
		money += toycount * toyprice;
		if (WMprice <= money)
		{
			System.out.println(String.format("Yes! %.2f", ((double) money - WMprice)));
		}
		else
		{
			System.out.println(String.format("No! %.2f", (WMprice - (double) money)));
		}
		scanner.close();
	}
}
