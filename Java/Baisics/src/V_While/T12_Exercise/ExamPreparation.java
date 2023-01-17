package V_While.T12_Exercise;

import java.util.Scanner;

public class ExamPreparation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int maxErrors = Integer.parseInt(scanner.nextLine());
		int errors = maxErrors;
		int tasks = 0;
		Double grade = 0d;
		String problem = "";
		String lastProblem = "";
		while (true)
		{
			problem = scanner.nextLine();
			if (!problem.equals("Enough")) lastProblem = problem;
			else break;
			int g = Integer.parseInt(scanner.nextLine());
			grade += g;
			tasks++;
			if (g <= 4)
			{
				errors--;
				if (errors <= 0)
				{
					System.out.printf("You need a break, %d poor grades.", maxErrors);
					scanner.close();
					return;
				}
			}
		}
		System.out.println(String.format("Average score: %.2f", grade / tasks));
		System.out.println(String.format("Number of problems: %d", tasks));
		System.out.println(String.format("Last problem: %s", lastProblem));
		scanner.close();
	}
}
