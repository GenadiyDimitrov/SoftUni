package IV_For.T9_Lab;

import java.util.Scanner;

public class CharacterSequence
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		for (int i = 0; i < input.length(); i++)
		{
			System.out.println(input.charAt(i));
		}
	}
}
