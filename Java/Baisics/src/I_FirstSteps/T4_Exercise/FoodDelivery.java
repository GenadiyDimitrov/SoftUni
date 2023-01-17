package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class FoodDelivery
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int chk = Integer.parseInt(scanner.nextLine());
		int fsh = Integer.parseInt(scanner.nextLine());
		int veg = Integer.parseInt(scanner.nextLine());
		Double all = chk * 10.35 + fsh * 12.4 + veg * 8.15;
		all *= 1.2;
		Double money = all + 2.5;
		String message = money.toString();
		System.out.println(message);
		scanner.close();
	}
}
