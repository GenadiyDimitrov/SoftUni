package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*9.	Array Modifier
You are given an array with integers.
Write a program to modify the elements after receiving the following commands:
•	"swap {index1} {index2}" takes two elements and swap their places.
•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index.
    Save the product at the 1st index.
•	"decrease" decreases all elements in the array with 1.

-Input
On the first input line, you will be given the initial array values separated by a single space.
On the next lines, you will receive commands until you receive the command "end". The commands are as follows:
•	"swap {index1} {index2}"
•	"multiply {index1} {index2}"
•	"decrease"

-Output
The output should be printed on the console
and consist of elements of the modified array – separated by a comma and a single space ", ".

-Constraints
•	Elements of the array will be integer numbers in the range [-231...231].
•	The count of the array elements will be in the range [2...100].
•	Indexes will always be in the range of the array.
*/
public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the int array
        int[] originalArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //get the first command
        String command = sc.nextLine();
        //loop until the command is end
        while (!command.equals("end")) {
            //check if we have a swap command
            if (command.startsWith("swap ")) {
                //split the command to get all the parts
                String[] cmdArray = command.split(" ");
                //better safe than sorry
                if (cmdArray.length == 3) {
                    //get the two indexes to swap
                    int firstIndex = Integer.parseInt(cmdArray[1]);
                    int secondIndex = Integer.parseInt(cmdArray[2]);
                    //get the corresponding numbers
                    int firstNumber = originalArray[firstIndex];
                    int secondNumber = originalArray[secondIndex];
                    //swap the elements in the array
                    originalArray[firstIndex] = secondNumber;
                    originalArray[secondIndex] = firstNumber;
                }
            }
            //check if multiply command
            else if (command.startsWith("multiply ")) {
                //split the command to get all the parts
                String[] cmdArray = command.split(" ");
                //better safe than sorry
                if (cmdArray.length == 3) {
                    //get the two indexes to multiply
                    int firstIndex = Integer.parseInt(cmdArray[1]);
                    int secondIndex = Integer.parseInt(cmdArray[2]);
                    //multiply and put in first spot
                    originalArray[firstIndex] *= originalArray[secondIndex];
                }
            }
            //check if decrease command
            else if (command.equals("decrease")) {
                //loop all
                for (int i = 0; i < originalArray.length; i++) {
                    // and decrease them by 1
                    originalArray[i] -= 1;
                }
            }
            //get the next command
            command = sc.nextLine();
        }
        //print the int array. it prints [1, 2, 3, 4] so remove [ and ]
        System.out.println(Arrays.toString(originalArray).replace("[", "").replace("]", ""));
        sc.close();
    }
}
