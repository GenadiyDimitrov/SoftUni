package V_While.T11_Lab;

import java.util.Scanner;

public class Password
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String password = scanner.nextLine();
		while (!password.equals(scanner.nextLine()))
		{
		}
		System.out.println("Welcome " + name + "!");
		scanner.close();
	}
}
