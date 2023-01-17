package VII_ExamPreparation.T16_TestExam;

import java.util.Scanner;

public class Exam
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int people = Integer.parseInt(s.nextLine());
		Double Fail = 0d;
		Double Mid = 0d;
		Double Good = 0d;
		Double Great = 0d;
		Double average = 0d;
		for (int i = 0; i < people; i++)
		{
			Double grade = Double.parseDouble(s.nextLine());
			average += grade;
//			if (grade >= 2d && grade < 3d)
			if (grade < 3d)
			{
				Fail++;
			}
			else if (grade >= 3d && grade < 4d)
			{
				Mid++;
			}
			else if (grade >= 4d && grade < 5d)
			{
				Good++;
			}
			else if (grade >= 5d)
			{
				Great++;
			}
		}
		Double all = Fail + Mid + Good + Great;
		average /= all;

		System.out.println(String.format("Top students: %.2f", Great / all * 100d) + "%");
		System.out.println(String.format("Between 4.00 and 4.99: %.2f", Good / all * 100d) + "%");
		System.out.println(String.format("Between 3.00 and 3.99: %.2f", Mid / all * 100d) + "%");
		System.out.println(String.format("Fail: %.2f", Fail / all * 100d) + "%");
		System.out.println(String.format("Average: %.2f", average));

		s.close();
	}
}
