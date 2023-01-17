package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class USDToBGN
{
	public static void main(String[] args)
	{
		// 1 USD = 1.79549 BGN.
		Scanner scanner = new Scanner(System.in);
		Float dolars = Float.parseFloat(scanner.nextLine());
		Float levs = dolars * 1.79549f;
		String message = levs.toString();
		System.out.println(message);
		scanner.close();
	}
}
