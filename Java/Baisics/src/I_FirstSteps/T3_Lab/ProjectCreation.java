package I_FirstSteps.T3_Lab;
import java.util.Scanner;

public class ProjectCreation
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int projects = Integer.parseInt(scanner.nextLine());
		int hours = projects * 3;
		String message = "The architect " + name + " will need " + hours + " hours to complete " + projects +" project/s.";
		System.out.println(message);
		scanner.close();
	}
}
