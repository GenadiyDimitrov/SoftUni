package IV_For.T10_Exercise;

public class NumbersTo1000EndWith7
{
	public static void main(String[] args)
	{
		for (int i = 7; i <= 1000; i++)
		{
			if (i % 10 == 7)
			{
				System.out.println(i);
			}
		}
	}
}
