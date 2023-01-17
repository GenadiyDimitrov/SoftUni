package IV_For.T9_Lab;

import java.util.Scanner;

public class EvenPowerOf2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		int res = 0;
		for (int i = 0; i <= (int) Math.pow(2, n); i += 2)
		{
			res = (int) Math.pow(2, i);
			if (res <= (int) Math.pow(2, n)) System.out.println(res);
			else break;
		}
	}
}
