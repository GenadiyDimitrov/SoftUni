package V_While.T12_Exercise;

import java.util.Scanner;

public class Cake
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		int left = a * b;
		while (true)
		{
			Boolean end = false;
			String command = scanner.nextLine();
			if (command.equals("STOP"))
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
					System.out.println(String.format("%d pieces are left.", left));
				}
				else
				{
					System.out.println(String.format("No more cake left! You need %d pieces more.", left * -1));
				}
				break;
			}
		}
		scanner.close();
	}
}
