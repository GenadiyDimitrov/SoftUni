package V_While.T12_Exercise;

import java.util.Scanner;

public class Moving
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		int h = Integer.parseInt(scanner.nextLine());
		int left = a * b * h;
		while (true)
		{
			Boolean end = false;
			String command = scanner.nextLine();
			if (command.equals("Done"))
			{
				end = true;
			}
			else
			{
				int current = Integer.parseInt(command);
				left -= current;
			}
			if (left <= 0) end = true;
			if (end)
			{
				if (left > 0)
				{
					System.out.println(String.format("%d Cubic meters left.", left));
				}
				else
				{
					System.out.println(String.format("No more free space! You need %d Cubic meters more.", left * -1));
				}
				break;
			}
		}
		scanner.close();
	}
}
