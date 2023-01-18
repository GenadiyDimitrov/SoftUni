package III_Arrays.T11_Lab;

import java.util.Scanner;

/*2.	Print Numbers in Reverse Order
Read n numbers and print them in reverse order.
*/
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //getting the count
        int n = Integer.parseInt(sc.nextLine());
        //generating array for count
        int[] numbers = new int[n];
        //for each loop for that count
        for (int i = 0; i < n; i++) {
            //getting the number for each line
            int number = Integer.parseInt(sc.nextLine());
            //putting it in order
            numbers[i] = number;
        }
        //for loop from count -1(for the array index) to 0
        for (int r = n - 1; r >= 0; r--) {
            //print numbers for reverse
            System.out.printf("%d ", numbers[r]);
        }
        sc.close();
    }
}
