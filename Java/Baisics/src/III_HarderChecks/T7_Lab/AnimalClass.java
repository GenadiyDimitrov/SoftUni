package III_HarderChecks.T7_Lab;

import java.util.Scanner;

public class AnimalClass
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		switch (input)
		{
		case "crocodile":
		case "tortoise":
		case "snake":
			System.out.println("reptile");
			break;
		case "dog":
			System.out.println("mammal");
			break;

		default:
			System.out.println("unknown");
			break;
		}
		scanner.close();
	}
}
