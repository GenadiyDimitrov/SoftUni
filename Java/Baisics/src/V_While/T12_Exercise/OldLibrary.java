package V_While.T12_Exercise;

import java.util.Scanner;

public class OldLibrary
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		String favBook = scanner.nextLine();
		String input = scanner.nextLine();
		int count = 0;
		while (!input.equals(favBook) && !input.equals("No More Books"))
		{
			input = scanner.nextLine();
			count++;
		}
		if (input.equals(favBook))
		{
			System.out.printf("You checked %d books and found it.", count);
		}
		else
		{
			System.out.println("The book you search is not here!");
			System.out.printf("You checked %d books.", count);
		}
		scanner.close();
	}

}
