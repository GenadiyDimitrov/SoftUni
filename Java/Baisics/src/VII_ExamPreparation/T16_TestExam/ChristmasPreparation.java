package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class ChristmasPreparation
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int paper = Integer.parseInt(s.nextLine());
		int textil = Integer.parseInt(s.nextLine());
		Double glue = Double.parseDouble(s.nextLine());
		int discount = Integer.parseInt(s.nextLine());
		discount = 100 - discount;
		Double price = (paper * 5.8 + textil * 7.2 + glue * 1.2) * ((double) discount / 100.0);
		System.out.println(String.format("%.3f", price));
		
		s.close();
	}

}
