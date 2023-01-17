package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class Substitute
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int k = Integer.parseInt(scanner.nextLine());
		int l = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		int count = 0;
		for (int firstNumberFirstDigit = k; firstNumberFirstDigit <= 8; firstNumberFirstDigit++)
		{
			for (int firstNumberSecondDigit = 9; firstNumberSecondDigit >= l; firstNumberSecondDigit--)
			{
				for (int secondNumberFirstDigit = m; secondNumberFirstDigit <= 8; secondNumberFirstDigit++)
				{
					for (int secondNumberSecondDigit = 9; secondNumberSecondDigit >= n; secondNumberSecondDigit--)
					{
						boolean isValid = firstNumberFirstDigit % 2 == 0 && secondNumberFirstDigit % 2 == 0 && firstNumberSecondDigit % 2 != 0 && secondNumberSecondDigit % 2 != 0;

						if (isValid)
						{
							int secondnumber = secondNumberFirstDigit * 10 + secondNumberSecondDigit;
							int firstnumber = firstNumberFirstDigit * 10 + firstNumberSecondDigit;
							if (firstnumber != secondnumber)
							{
								System.out.println(String.format("%d%d - %d%d", firstNumberFirstDigit, firstNumberSecondDigit, secondNumberFirstDigit, secondNumberSecondDigit));
								count++;
							}
							else
							{
								System.out.println("Cannot change the same player.");
							}

							if (count >= 6)
							{
								scanner.close();
								return;

							}
						}
					}
				}
			}
		}

		scanner.close();
	}
}
