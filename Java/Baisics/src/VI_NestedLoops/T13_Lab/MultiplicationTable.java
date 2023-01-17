package VI_NestedLoops.T13_Lab;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		for (int a = 1; a < 11; a++)
		{
			for (int b = 1; b < 11; b++)
			{
				int res = a * b;
				System.out.println(String.format("%d * %d = %d", a, b, res));
			}
		}
	}
}
