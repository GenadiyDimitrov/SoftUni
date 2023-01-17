package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class EasterVacation
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String destination = scanner.nextLine();
		String dates = scanner.nextLine();
		int days = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double price = 0d;
		switch (destination)
		{
		case "France":
			switch (dates)
			{
			case "21-23":
				price = 30d;
				break;
			case "24-27":
				price = 35d;
				break;
			case "28-31":
				price = 40d;
				break;
			}
			break;
		case "Italy":
			switch (dates)
			{
			case "21-23":
				price = 28d;
				break;
			case "24-27":
				price = 32d;
				break;
			case "28-31":
				price = 39d;
				break;
			}
			break;
		case "Germany":
			switch (dates)
			{
			case "21-23":
				price = 32d;
				break;
			case "24-27":
				price = 37d;
				break;
			case "28-31":
				price = 43d;
				break;
			}
			break;
		}
		price *= days;
		System.out.println(String.format("Easter trip to %s : %.2f leva.", destination, price));

	}
}
