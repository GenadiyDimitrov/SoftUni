package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class DepositCalculator
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double deposit = Double.parseDouble(scanner.nextLine());
		int months = Integer.parseInt(scanner.nextLine());
		Double percent = Double.parseDouble(scanner.nextLine()) / 100;
		Double sum = deposit + months * ((deposit * percent) / 12);
		String message = sum.toString();
		System.out.println(message);
		scanner.close();
	}

}
