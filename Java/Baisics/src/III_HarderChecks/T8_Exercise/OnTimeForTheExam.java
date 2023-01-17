package III_HarderChecks.T8_Exercise;

import java.util.Scanner;

public class OnTimeForTheExam
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int examHours = Integer.parseInt(scanner.nextLine());
		int examMinutes = Integer.parseInt(scanner.nextLine());
		int studentHours = Integer.parseInt(scanner.nextLine());
		int studentMinutes = Integer.parseInt(scanner.nextLine());
		scanner.close();
		int ExamTime = examHours * 60 + examMinutes;
		int StudentTime = studentHours * 60 + studentMinutes;

		String delay = "";
		if (StudentTime > ExamTime)
		{
			delay = "Late";
		}
		else if (StudentTime + 30 < ExamTime)
		{
			delay = "Early";
		}
		else
		{
			delay = "On time";
		}
		System.out.println(delay);
		int all = ExamTime - StudentTime;
		if (all <= -60)
		{
			all *= -1;
			int h = all / 60;
			int m = all % 60;
			if (m < 10)
			{
				System.out.println(String.format("%d:0%d hours after the start", h, m));
			}
			else
			{
				System.out.println(String.format("%d:%d hours after the start", h, m));
			}
		}
		else if (all < 0)
		{
			all *= -1;
			System.out.println(String.format("%d minutes after the start", all));
		}
		else if (all >= 60)
		{
			int h = all / 60;
			int m = all % 60;
			if (m < 10)
			{
				System.out.println(String.format("%d:0%d hours before the start", h, m));
			}
			else
			{
				System.out.println(String.format("%d:%d hours before the start", h, m));
			}
		}
		else if (all > 0)
		{
			System.out.println(String.format("%d minutes before the start", all));
		}
	}
}
