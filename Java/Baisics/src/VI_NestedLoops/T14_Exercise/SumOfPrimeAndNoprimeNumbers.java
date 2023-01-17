package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class SumOfPrimeAndNoprimeNumbers
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int primeNumSum = 0;
		int nonPrimeNumSum = 0;

		String input = scanner.nextLine();
		while (!input.equals("stop"))
		{
			boolean isNonPrimeNum = false;
			int num = Integer.parseInt(input);

			if (num < 0)
			{
				System.out.println("Number is negative.");
				input = scanner.nextLine();
				continue;
			}

			for (int i = 2; i <= num / 2; i++)
			{
				if (num % i == 0)
				{
					isNonPrimeNum = true;
					break;
				}
			}

			if (isNonPrimeNum)
			{
				nonPrimeNumSum += num;
			}
			else
			{
				primeNumSum += num;
			}

			input = scanner.nextLine();
		}

		System.out.println(String.format("Sum of all prime numbers is: %d", primeNumSum));
		System.out.println(String.format("Sum of all non prime numbers is: %d", nonPrimeNumSum));
		scanner.close();
	}
}
