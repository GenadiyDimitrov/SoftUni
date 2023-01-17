package II_Checks.T6_Exercise;

import java.util.Scanner;

public class SumSeconds
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int first = Integer.parseInt(scanner.nextLine());
		int second = Integer.parseInt(scanner.nextLine());
		int third = Integer.parseInt(scanner.nextLine());
		int all = first + second + third;
		int minutes = all / 60;
		int seconds = all % 60;
		if (seconds < 10)
		{
			System.out.printf("%d:0%d", minutes, seconds);
		}
		else
		{
			System.out.printf("%d:%d", minutes, seconds);
		}
		scanner.close();
	}

}
