package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class SuppliesForSchool
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int pens = Integer.parseInt(scanner.nextLine());
		int marks = Integer.parseInt(scanner.nextLine());
		int liters = Integer.parseInt(scanner.nextLine());
		Double discount = Integer.parseInt(scanner.nextLine()) / 100d;
		Double money = pens * 5.8d + marks * 7.2d + liters * 1.2d;
		money = money - money * discount;
		String message = money.toString();
		System.out.println(message);
		scanner.close();

	}

}
