package II_DataTypesAndVariable.T9_Exercise.MoreExersises;

import java.util.Scanner;

/*2. From Left to the Right

You will receive a number representing how many lines we will get as input.
On the next N lines, you will receive a string with 2 numbers separated by a single space.
You need to compare them.
If the left number is greater than the right number,
you need to print the sum of all digits in the left number,
otherwise,
print the sum of all digits in the right number.*/
public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the input
        int n = Integer.parseInt(sc.nextLine());
        //for each row
        for (int i = 0; i < n; i++) {
            //get input
            String row = sc.nextLine();
            //split the numbers
            String[] numbers = row.split(" ");
            //convert the numbers
            long leftNumber = Long.parseLong(numbers[0]);
            long rightNumber = Long.parseLong(numbers[1]);
            //get the bigger number and get its abs value
            long number = Math.abs(Math.max(leftNumber, rightNumber));
            //default sum
            long sum = 0;
            //loop while numbers left
            while (number != 0) {
                //get last digit
                long lastDigit = number % 10;
                //sum it
                sum += lastDigit;
                //remove it
                number /= 10;
            }
            //print result
            System.out.println(sum);
        }
        sc.close();
    }
}
