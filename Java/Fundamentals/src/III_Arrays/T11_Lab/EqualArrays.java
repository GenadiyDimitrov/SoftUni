package III_Arrays.T11_Lab;

import java.util.Arrays;
import java.util.Scanner;

/*6.	Equal Arrays
Read two arrays and print on the console
whether they are identical or not.
Arrays are identical if their elements are equal.
If the arrays are identical,
find the sum of the first one and
print on the console the following message: "Arrays are identical. Sum: {sum}",
otherwise find the first index where the arrays differ
and print on the console following message: "Arrays are not identical. Found difference at {index} index."
*/
public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //converting input to int array
        int[] firstArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //initial fields
        int index = -1;
        int sum = 0;
        //for all the items
        for (int i = 0; i < firstArray.length; i++) {
            //update the sum
            sum += firstArray[i];
            //checking equals
            if (firstArray[i] != secondArray[i]) {
                //setting index
                index = i;
                //breaking loop
                break;
            }
        }
        if (index >= 0) {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", index);
        } else {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        }
        sc.close();
    }
}
