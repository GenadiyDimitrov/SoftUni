package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class Repainting
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double nailon = (Integer.parseInt(scanner.nextLine()) + 2d) * 1.5d;
		Double boq = Integer.parseInt(scanner.nextLine()) * 1.1d * 14.5d;
		Double razreditel = Integer.parseInt(scanner.nextLine()) * 5d;
		int hours = Integer.parseInt(scanner.nextLine());
		Double all = (nailon + boq + razreditel + 0.4d);
		Double perHour = all * 0.3;
		Double money = all + (hours * perHour);
		String message = money.toString();
		System.out.println(message);
		scanner.close();
	}
}
