package X_TextProcessing.T29_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5.	Multiply Big Number
You are given two lines – the first one can be a really big number (0 to 10^50).
The second one will be a single-digit number (0 to 9).
You must display the product of these numbers.
Note: do not use the BigInteger class.
*/
public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstBigNumber = sc.nextLine().replaceFirst("^0+(?!$)", "");
        int multiplier = Integer.parseInt(sc.nextLine());
        if (firstBigNumber.isEmpty()) {
            firstBigNumber = "0";
        }
        if (multiplier == 0 || firstBigNumber.equals("0")) {
            System.out.println(0);
            return;
        }
        char[] chars = firstBigNumber.toCharArray();
        List<Integer> bigNumberList = new ArrayList<>();
        for (var c : chars) {
            bigNumberList.add(Integer.parseInt(c + ""));
        }
        List<Integer> result = new ArrayList<>();
        int remainder = 0;
        for (int i = bigNumberList.size() - 1; i >= 0; i--) {
            int currentNumber = bigNumberList.get(i);
            int multiplied = currentNumber * multiplier;
            if (remainder > 0) {
                multiplied += remainder;
                remainder = 0;
            }

            if (multiplied > 9) {
                remainder = multiplied / 10;
            }
            multiplied = multiplied % 10;
            result.add(multiplied);
        }
        if (remainder > 0) {
            result.add(remainder);
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.printf("%d", result.get(i));
        }
        sc.close();
    }

}
