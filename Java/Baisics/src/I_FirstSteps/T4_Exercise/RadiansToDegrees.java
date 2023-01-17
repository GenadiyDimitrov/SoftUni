package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class RadiansToDegrees
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Double radians = Double.parseDouble(scanner.nextLine());
		Double degree = radians * 180 / Math.PI;
		String message = degree.toString();
		System.out.println(message);
		scanner.close();
	}

}
