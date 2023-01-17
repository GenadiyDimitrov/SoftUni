package V_While.T12_Exercise;

import java.util.Scanner;

public class Walking
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int steps = 0;
		while (true)
		{
			Boolean end = false;
			String command = scanner.nextLine();
			if (command.equals("Going home"))
			{
				end = true;
				command = scanner.nextLine();
			}

			int current = Integer.parseInt(command);
			steps += current;
			if (steps >= 10000) end = true;
			if (end)
			{
				if (steps >= 10000)
				{
					System.out.println("Goal reached! Good job!");
					System.out.println(String.format("%d steps over the goal!", steps - 10000));
				}
				else
				{
					System.out.println(String.format("%d more steps to reach goal.", 10000 - steps));
				}
				break;
			}
		}
		scanner.close();
	}
}
