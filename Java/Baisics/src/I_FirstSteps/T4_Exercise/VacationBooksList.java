package I_FirstSteps.T4_Exercise;

import java.util.Scanner;

public class VacationBooksList
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int pages = Integer.parseInt(scanner.nextLine());
		int speed = Integer.parseInt(scanner.nextLine());
		int days = Integer.parseInt(scanner.nextLine());
		int hours = pages / speed / days;
		System.out.println(hours);
		scanner.close();
	}

}
