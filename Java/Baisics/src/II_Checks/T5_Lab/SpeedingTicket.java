package II_Checks.T5_Lab;

import java.util.Scanner;

public class SpeedingTicket
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double a = Double.parseDouble(scanner.nextLine());
		if (a <= 10d)
		{
			System.out.println("slow");
		} else if (a <= 50d)
		{
			System.out.println("average");
		} else if (a <= 150d)
		{
			System.out.println("fast");
		} else if (a <= 1000d)
		{
			System.out.println("ultra fast");
		} else
		{
			System.out.println("extremely fast");
		}
		scanner.close();
	}
}
