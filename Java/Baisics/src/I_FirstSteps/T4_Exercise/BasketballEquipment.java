package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class BasketballEquipment
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int pay = Integer.parseInt(scanner.nextLine());
		Double kec = pay - pay * 0.4;
		Double ekip = kec - kec * 0.2;
		Double topka = ekip * 0.25;
		Double acc = topka * 0.2;
		Double money = kec + ekip + topka + acc + pay;
		String message = money.toString();
		System.out.println(message);
		scanner.close();
	}
}
