package II_Checks.T5_Lab;

import java.util.Scanner;

public class ExcellentResult
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine());
		if (x >= 5)
		{
			System.out.println("Excellent!");
		}
		scanner.close();
	}

}
