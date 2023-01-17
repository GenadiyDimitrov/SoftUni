package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class BraceletStand
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		Double balance = Double.parseDouble(s.nextLine());
		Double profitPerDay = Double.parseDouble(s.nextLine());
		Double bills = Double.parseDouble(s.nextLine());
		Double presentPrice = Double.parseDouble(s.nextLine());

		Double profit = profitPerDay * 5d + balance * 5d - bills;

		if (profit >= presentPrice)
		{
			System.out.println(String.format("Profit: %.2f BGN, the gift has been purchased.", profit));
		}
		else
		{
			System.out.println(String.format("Insufficient money: %.2f BGN.", presentPrice - profit));
		}

		s.close();
	}

}
