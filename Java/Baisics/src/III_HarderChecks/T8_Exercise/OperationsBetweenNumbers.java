package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n1 = Integer.parseInt(scanner.nextLine());
		int n2 = Integer.parseInt(scanner.nextLine());
		String operator = scanner.nextLine();
		scanner.close();

		if (n2 == 0)
		{
			System.out.println(String.format("Cannot divide %d by zero", n1));
			return;
		}

		int result = 0;
		switch (operator)
		{
		case "+":
			result = n1 + n2;
		case "-":
			result = n1 - n2;
		case "*":
			result = n1 * n2;
			System.out.println(String.format("%d %s %d = %d - %s", n1, operator, n2, result, result % 2 == 0 ? "even" : "odd"));
			break;
		case "/":
			System.out.println(String.format("%d %s %d = %.2f", n1, operator, n2, n1 / n2));
			break;
		case "%":
			System.out.println(String.format("%d %s %d = %d", n1, operator, n2, n1 % n2));
			break;

		default:
			break;
		}
	}
}
