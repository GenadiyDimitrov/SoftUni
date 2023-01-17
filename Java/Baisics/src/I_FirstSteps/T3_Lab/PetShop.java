package I_FirstSteps.T3_Lab;
import java.util.Scanner;

public class PetShop
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int dogs = Integer.parseInt(scanner.nextLine());
		int cats = Integer.parseInt(scanner.nextLine());
		Float dogPrice = dogs * 2.5f;
		Float catPrice = cats * 4f;
		String message = (dogPrice + catPrice) + " lv.";
		System.out.println(message);
		scanner.close();
	}

}
