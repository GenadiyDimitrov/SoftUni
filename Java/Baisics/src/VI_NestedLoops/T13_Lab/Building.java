package VI_NestedLoops.T13_Lab;

import java.util.Scanner;

public class Building
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int flors = Integer.parseInt(scanner.nextLine());
		int rooms = Integer.parseInt(scanner.nextLine());
		for (int f = flors; f > 0; f--)
		{
			for (int r = 0; r < rooms; r++)
			{
				String type = "L";
				if (f < flors) type = f % 2 == 0 ? "O" : "A";

				System.out.print(String.format("%s%d%d ", type, f, r));
			}
			System.out.println();
		}
		scanner.close();
	}
}
