package VI_NestedLoops.T13_Lab;

import java.util.Scanner;

public class Traveling
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String destination = scanner.nextLine();
		while (!destination.equals("End"))
		{
			Double needed = Double.parseDouble(scanner.nextLine());
			while (needed > 0)
			{
				Double n = Double.parseDouble(scanner.nextLine());
				needed -= n;
			}
			System.out.println(String.format("Going to %s!", destination));
			destination = scanner.nextLine();
		}
		scanner.close();
	}
}
