package III_Arrays.T12_Exercise.MoreExercises;

import java.util.Scanner;

/*2.	Pascal Triangle
The triangle may be constructed in the following manner:
In row 0 (the topmost row), there is a unique nonzero entry 1.
Each entry of each subsequent row is constructed by adding the number
above and to the left with the number above and to the right,
treating blank entries as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.
If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle
Print each row element, separated with whitespace.
*/
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get rows to print
        int rows = Integer.parseInt(sc.nextLine());
        //create initial array
        int[] previousRowArray = new int[]{1};
        //for each row
        for (int i = 0; i < rows; i++) {
            //create current row array longer with 1 than the previous row array
            int[] currentRowArray = new int[previousRowArray.length + 1];
            //foreach number in the previous array
            for (int j = -1; j < previousRowArray.length; j++) {
                //create first number
                int firstNumber = 0;
                //if correct index
                if (j > -1) {
                    //get the first number
                    firstNumber = previousRowArray[j];
                }
                //get second index
                int secondIndex = j + 1;
                //create second number
                int secondNumber = 0;
                //if correct index
                if (secondIndex < previousRowArray.length) {
                    //get second number
                    secondNumber = previousRowArray[secondIndex];
                }
                //update the corresponding spot in the current row
                currentRowArray[j + 1] = firstNumber + secondNumber;
            }
            //print the previous row
            for (int number : previousRowArray) {
                System.out.printf("%d ", number);
            }
            //drop the cursor a row
            System.out.println();
            //update the row for next iteration
            previousRowArray = currentRowArray;
        }
        sc.close();
    }
}
