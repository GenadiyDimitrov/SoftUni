package II_Checks.T6_Exercise;

import java.util.Scanner;

public class BonusPoints
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Integer a = Integer.parseInt(scanner.nextLine());
		Double bonus = 0d;
		if (a <= 100)
		{
			bonus += 5.0;
		}
		else if (a > 100)
		{
			bonus += a > 1000 ? a * 0.1 : a * 0.2;
		}

		if (a % 2 == 0)
		{
			bonus += 1.0;
		}

		if (a.toString().endsWith("5"))
		{
			bonus += 2.0;
		}
		scanner.close();
		System.out.println(bonus);
		System.out.println(bonus + a);
	}
}
