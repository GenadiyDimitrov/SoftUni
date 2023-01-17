package VI_NestedLoops.T14_Exercise;

import java.util.Scanner;

public class CinemaTicket
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String nameOfMovie = scanner.nextLine();
		int student = 0;
		int standard = 0;
		int kid = 0;
		while (!nameOfMovie.equals("Finish"))
		{
			int spots = Integer.parseInt(scanner.nextLine());
			int currentFill = 0;
			String ticketType = scanner.nextLine();
			while (!ticketType.equals("End"))
			{
				switch (ticketType)
				{
				case "student":
					student++;
					currentFill++;
					break;
				case "standard":
					standard++;
					currentFill++;
					break;
				case "kid":
					kid++;
					currentFill++;
					break;
				}
				if (currentFill >= spots) break;
				ticketType = scanner.nextLine();
			}
			System.out.println(String.format("%s - %.2f", nameOfMovie, (double) currentFill / (double) spots * 100) + "% full.");
			nameOfMovie = scanner.nextLine();
		}
		int allCount = student + standard + kid;
		System.out.println(String.format("Total tickets: %d", allCount));
		System.out.println(String.format("%.2f", (double) student / (double) allCount * 100) + "% student tickets.");
		System.out.println(String.format("%.2f", (double) standard / (double) allCount * 100) + "% standard tickets.");
		System.out.println(String.format("%.2f", (double) kid / (double) allCount * 100) + "% kids tickets.");
		scanner.close();
	}
}
