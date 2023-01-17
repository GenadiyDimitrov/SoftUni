package II_Checks.T6_Exercise;

import java.util.Scanner;

public class TimePlus15Minutes
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int hours = Integer.parseInt(scanner.nextLine());
		int minutes = Integer.parseInt(scanner.nextLine());
		int all = hours * 60 + minutes + 15;
		int h = all / 60;
		while (h >= 24) h -= 24;
		int m = all % 60;
		if (m < 10)
		{
			System.out.printf("%d:0%d", h, m);
		}
		else
		{
			System.out.printf("%d:%d", h, m);
		}
		scanner.close();
	}
}
