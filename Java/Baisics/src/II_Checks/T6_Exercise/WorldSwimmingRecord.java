package II_Checks.T6_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double record = Double.parseDouble(scanner.nextLine());
		Double distance = Double.parseDouble(scanner.nextLine());
		Double speed = Double.parseDouble(scanner.nextLine());

		Double time = (distance * speed) + ((distance - (distance % 15)) / 15 * 12.5);

		if (time < record)
		{
			String result = String.format("%.2f", time);
			System.out.println("Yes, he succeeded! The new world record is " + result + " seconds.");
		}
		else
		{
			String result = String.format("%.2f", (time - record));
			System.out.println("No, he failed! He was " + result + " seconds slower.");
		}
		scanner.close();
	}

}
