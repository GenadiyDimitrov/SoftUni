package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*3.	Zig-Zag Arrays
Write a program that creates 2 arrays.
You will be given an integer n.
On the next n lines, you get 2 integers.
Form 2 arrays as shown below.
First array must start from index 0
Second array must start from index 1
First array must continue on next row from index 1
Second array must continue on next row from index 0
First array must continue on next row from index 0
Second array must continue on next row from index 1
etc...
Input   |	Output
--------------------
4       |
1 5     |1 10 31 20
9 10    |5 9 81 41
31 81   |
41 20   |
--------------------
2       |80 19
80 23   |23 31
31 19   |

PS:
-The two arrays could be String[] firstArray/secondArray
-When adding the element to the arrays must then be:
 Array[i] = String.valueOf(rowArray[indexFlag ? 1 : 0])
-And the two last print cycles could be just:
 System.out.println(String.join(" ",Array));
*/
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of rows
        int rows = Integer.parseInt(sc.nextLine());
        //define the two arrays
        int[] firstArray = new int[rows];
        int[] secondArray = new int[rows];
        //the flip flag to change index from 1 to 0 and from 0 to 1
        boolean indexFlag = false;
        //foreach row
        for (int i = 0; i < rows; i++) {
            //read the row and convert to int array
            int[] rowArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //put the indexed number in the first array
            firstArray[i] = rowArray[indexFlag ? 1 : 0];
            //flip da flag
            indexFlag = !indexFlag;
            //put the indexed number in the second array
            secondArray[i] = rowArray[indexFlag ? 1 : 0];
        }
        //for all items in  the array print with 'space'
        for (int item : firstArray) {
            System.out.printf("%d ", item);
        }
        //drop the cursor on the next line
        System.out.println();
        //for all items in  the array print with 'space'
        for (int item : secondArray) {
            System.out.printf("%d ", item);
        }
        sc.close();
    }
}
