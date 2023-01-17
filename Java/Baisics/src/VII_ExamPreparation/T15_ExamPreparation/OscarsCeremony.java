package VII_ExamPreparation.T15_ExamPreparation;

import java.util.Scanner;

public class OscarsCeremony
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();

		Double statues = n * 0.7;
		Double catering = statues * 0.85;
		Double sounding = catering * 0.5;

		System.out.println(String.format("%.2f", n + statues + catering + sounding));
	}

}
