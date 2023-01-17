package I_FirstSteps.T3_Lab;
import java.util.Scanner;

public class InchToCentimeters
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		float inch = Float.parseFloat(scanner.nextLine());
		Float cm = inch * 2.54f;
		System.out.println(cm);
		scanner.close();
	}

}
