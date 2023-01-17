package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class SceneDay
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int limit = Integer.parseInt(scanner.nextLine());
		int nScene = Integer.parseInt(scanner.nextLine());
		int timePer = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double preparations = limit * 0.15;
		Double all = nScene * timePer + preparations;
		if (all > limit)
		{
			System.out.println(String.format("Time is up! To complete the movie you need %.0f minutes.", all - limit));

		}
		else
		{
			System.out.println(String.format("You managed to finish the movie on time! You have %.0f minutes left!", limit - all));

		}
	}
}
