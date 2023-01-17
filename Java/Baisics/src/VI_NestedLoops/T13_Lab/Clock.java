package VI_NestedLoops.T13_Lab;

public class Clock
{

	public static void main(String[] args)
	{
		for (int h = 0; h < 24; h++)
		{
			for (int m = 0; m < 60; m++)
			{
				System.out.println(String.format("%d:%d", h, m));
			}
		}
	}

}
