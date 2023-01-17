package I_FirstSteps.T3_Lab;
import java.util.Scanner;

public class YardGreening
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Float squareMeters = Float.parseFloat(scanner.nextLine());
		Float price = squareMeters * 7.61f;
		Float discount = price * 18f / 100f;
		String message = "The final price is: " + (price - discount) + " lv.";
		System.out.println(message);
		message = "The discount is: " + discount + " lv.";
		System.out.println(message);
		scanner.close();
	}
}
