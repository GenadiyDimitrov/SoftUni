package II_Checks.T5_Lab;

import java.util.Scanner;

public class AreaOfFigures
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String type = scanner.nextLine();
		Double result = 0.0;
		if (type.equals("square"))
		{
			Double a = Double.parseDouble(scanner.nextLine());
			result = (a * a);
		}
		else if (type.equals("rectangle"))
		{
			Double a = Double.parseDouble(scanner.nextLine());
			Double b = Double.parseDouble(scanner.nextLine());
			result = (a * b);
		}
		else if (type.equals("circle"))
		{
			Double a = Double.parseDouble(scanner.nextLine());
			result = (Math.PI * (a * a));
		}
		else if (type.equals("triangle"))
		{
			Double a = Double.parseDouble(scanner.nextLine());
			Double h = Double.parseDouble(scanner.nextLine());
			result = (h * a / 2);
		}
		System.out.printf("%.3f", result);
		scanner.close();
	}

}
