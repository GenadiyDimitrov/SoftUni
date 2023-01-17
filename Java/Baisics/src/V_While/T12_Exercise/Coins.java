package V_While.T12_Exercise;

import java.util.Scanner;

public class Coins
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int change = (int) (Double.parseDouble(input) * 100);
		int coins = 0;
		int Coin = 200;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 100;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 50;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 20;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 10;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 5;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 2;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		Coin = 1;
		while (change >= Coin)
		{
			coins++;
			change -= Coin;
		}
		System.out.println(coins);
		scanner.close();
	}
}
