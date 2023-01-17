package IV_For.T10_Exercise;

import java.util.Scanner;

public class Salary
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int tabs = Integer.parseInt(scanner.nextLine());
		int salary = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < tabs; i++)
		{
			String tabname = scanner.nextLine();
			if (tabname.equals("Facebook")) salary -= 150;
			if (tabname.equals("Instagram")) salary -= 100;
			if (tabname.equals("Reddit")) salary -= 50;
			if (salary <= 0)
			{
				System.out.println("You have lost your salary.");
				scanner.close();
				return;
			}
		}
		System.out.println(salary);
		scanner.close();
	}
}
