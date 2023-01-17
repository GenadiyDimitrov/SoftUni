package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class TrainTheTrainers
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String command = scanner.nextLine();
		int allCount = 0;
		Double allGrade = 0d;
		while (!command.equals("Finish"))
		{
			Double currentGrade = 0d;
			for (int i = 0; i < n; i++)
			{
				currentGrade += Double.parseDouble(scanner.nextLine());
				allCount++;
			}
			allGrade += currentGrade;
			System.out.println(String.format("%s - %.2f.", command, currentGrade / n));
			command = scanner.nextLine();
		}
		System.out.println(String.format("Student's final assessment is %.2f.", allGrade / allCount));
		scanner.close();
	}

}
