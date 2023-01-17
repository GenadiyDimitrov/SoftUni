package V_While.T11_Lab;

import java.util.Scanner;

public class ReadText
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String res = "";
		while (true)
		{
			res = scanner.nextLine();
			if (!res.equals("Stop")) System.out.println(res);
			else break;
		}
		scanner.close();
	}
}
