package IV_Methods.T15_Exercise.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*6.	Array Manipulator
Trifon has finally become a junior developer and has received his first task.
It's about manipulating an array of integers.
He is not quite happy about it,
since he hates manipulating arrays.

They will pay him a lot of money, though,
and he is willing to give somebody half of it if to help him do his job.
You, on the other hand, love arrays (and money) so you decide to try your luck.

The array may be manipulated by one of the following commands:
•	exchange {index} – splits the array after the given index and exchanges the places of the two resulting subArrays.
    E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
o	If the index is outside the boundaries of the array, print "Invalid index".

•	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
o	If there are two or more equal min/max elements, return the index of the rightmost one.
o	If a min/max even/odd element cannot be found, print "No matches".

•	first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
•	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
o	If the count is greater than the array length, print "Invalid count".
o	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".

•	end – stop taking input and print the final state of the array.

Input
•	The input data should be read from the console.
•	On the first line, the initial array is received as a line of integers, separated by a single space.
•	On the next lines, until the command "end" is received, you will receive the array manipulation commands.
•	The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
•	The output should be printed on the console.
•	On a separate line, print the output of the corresponding command.
•	On the last line, print the final array in square brackets with its elements separated by a comma and a space.
•	See the examples below to get a better understanding of your task.

Constraints
•	The number of input lines will be in the range [2 … 50].
•	The array elements will be integers in the range [0 … 1000].
•	The number of elements will be in the range [1 ... 50].
•	The split index will be an integer in the range [-231 … 231 – 1].
•	The first/last count will be an integer in the range [1 … 231 – 1].
•	There will not be redundant whitespace anywhere in the input.
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.
*/
public class ArrayManipulator {
    static int[] ints = new int[0];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get original array
        ints = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();//get initial command
        String command = sc.nextLine();
        //loop until end command
        while (!command.equals("end")) {
            //invoke manipulation methods
            if (command.startsWith("exchange ")) {
                exchange(command);
            } else if (command.startsWith("max even")) {
                maxEven();
            } else if (command.startsWith("max odd")) {
                maxOdd();
            } else if (command.startsWith("min even")) {
                minEven();
            } else if (command.startsWith("min odd")) {
                minOdd();
            } else if (command.startsWith("first ")) {
                if (command.endsWith(" odd")) {
                    firstOdd(command);
                } else if (command.endsWith(" even")) {
                    firstEven(command);
                }
            } else if (command.startsWith("last ")) {
                if (command.endsWith(" odd")) {
                    lastOdd(command);
                } else if (command.endsWith(" even")) {
                    lastEven(command);
                }
            }

            command = sc.nextLine();
        }

        //print array
        System.out.println(Arrays.toString(ints));
        sc.close();
    }

    private static void lastEven(String command) {
        //get the count
        int count = Integer.parseInt(command.split(" ")[1]);
        //check count condition
        if (count > ints.length) {
            System.out.println("Invalid count");
            return;
        }
        //create list
        ArrayList<Integer> evens = new ArrayList<>();
        //foreach number in original array in reverse
        for (int i = ints.length - 1; i >= 0; i--) {
            //check if not over the count
            if (count > 0) {
                int n = ints[i];
                //if even
                if (n % 2 == 0) {
                    //insert at 0 index to keep left to right of the list
                    evens.add(0, n);
                    //decrease count
                    count--;
                }
            } else break;
        }
        //print array
        System.out.println(Arrays.toString(evens.toArray()));

    }

    private static void lastOdd(String command) {
        //get the count
        int count = Integer.parseInt(command.split(" ")[1]);
        //check count condition
        if (count > ints.length) {
            System.out.println("Invalid count");
            return;
        }
        //create list
        ArrayList<Integer> evens = new ArrayList<>();
        //foreach number in original array in reverse
        for (int i = ints.length - 1; i >= 0; i--) {
            //check if not over the count
            if (count > 0) {
                int n = ints[i];
                //if odd
                if (n % 2 != 0) {
                    //insert at 0 index to keep left to right of the list
                    evens.add(0, n);
                    //decrease count
                    count--;
                }
            } else break;
        }
        //print array
        System.out.println(Arrays.toString(evens.toArray()));

    }

    private static void firstEven(String command) {
        //get the count
        int count = Integer.parseInt(command.split(" ")[1]);
        //check count condition
        if (count > ints.length) {
            System.out.println("Invalid count");
            return;
        }
        //create list
        ArrayList<Integer> evens = new ArrayList<>();
        //foreach number in original array
        for (int n : ints) {
            //check if not over the count
            if (count > 0) {
                //if even
                if (n % 2 == 0) {
                    //add to list
                    evens.add(n);
                    //decrease count
                    count--;
                }
            } else break;
        }
        //print array
        System.out.println(Arrays.toString(evens.toArray()));

    }

    private static void firstOdd(String command) {
        //get the count
        int count = Integer.parseInt(command.split(" ")[1]);
        //check count condition
        if (count > ints.length) {
            System.out.println("Invalid count");
            return;
        }
        //create list
        ArrayList<Integer> evens = new ArrayList<>();
        //foreach number in original array
        for (int n : ints) {
            //check if not over the count
            if (count > 0) {
                //if odd
                if (n % 2 != 0) {
                    //add to list
                    evens.add(n);
                    //decrease count
                    count--;
                }
            } else break;
        }
        //print array
        System.out.println(Arrays.toString(evens.toArray()));
    }

    private static void minOdd() {
        //set default min val
        int min = Integer.MAX_VALUE;
        //set default index
        int index = -1;
        //foreach item in the array
        for (int i = 0; i < ints.length; i++) {
            //check if even
            if (ints[i] % 2 != 0) {
                //check if max
                if (min >= ints[i]) {
                    //set index and number
                    index = i;
                    min = ints[i];
                }
            }
        }
        //if no even
        if (index < 0) {
            //print
            System.out.println("No matches");
        } else {
            //else print index
            System.out.println(index);
        }
    }

    private static void minEven() {
        //set default min val
        int min = Integer.MAX_VALUE;
        //set default index
        int index = -1;
        //foreach item in the array
        for (int i = 0; i < ints.length; i++) {
            //check if even
            if (ints[i] % 2 == 0) {
                //check if max
                if (min >= ints[i]) {
                    //set index and number
                    index = i;
                    min = ints[i];
                }
            }
        }
        //if no even
        if (index < 0) {
            //print
            System.out.println("No matches");
        } else {
            //else print index
            System.out.println(index);
        }
    }

    private static void maxOdd() {
        //set default max val
        int max = Integer.MIN_VALUE;
        //set default index
        int index = -1;
        //foreach item in the array
        for (int i = 0; i < ints.length; i++) {
            //check if even
            if (ints[i] % 2 != 0) {
                //check if max
                if (max <= ints[i]) {
                    //set index and number
                    index = i;
                    max = ints[i];
                }
            }
        }
        //if no even
        if (index < 0) {
            //print
            System.out.println("No matches");
        } else {
            //else print index
            System.out.println(index);
        }
    }

    private static void maxEven() {
        //set default max val
        int max = Integer.MIN_VALUE;
        //set default index
        int index = -1;
        //foreach item in the array
        for (int i = 0; i < ints.length; i++) {
            //check if even
            if (ints[i] % 2 == 0) {
                //check if max
                if (max <= ints[i]) {
                    //set index and number
                    index = i;
                    max = ints[i];
                }
            }
        }
        //if no even
        if (index < 0) {
            //print
            System.out.println("No matches");
        } else {
            //else print index
            System.out.println(index);
        }
    }

    private static void exchange(String command) {
        //get the index from the command
        int index = Integer.parseInt(command.replace("exchange ", ""));
        //check index in bounds
        if (index >= ints.length || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        //get array length
        int length = index + 1;
        //1st arr is with length index + 1
        int[] firstArray = new int[length];
        //2nd arr is with length of the remaining ints
        int[] secondArray = new int[ints.length - length];
        //set default index for iterations
        index = 0;
        //in which array to write
        boolean first = true;

        //for all in the original array
        for (int n : ints) {
            //if the index is reached
            if (index == length && first) {
                //reset the index to start from 0 in the next array
                index = 0;
                //write in second array
                first = false;
            }
            //in which array to write
            if (first) {
                firstArray[index] = n;
            } else {
                secondArray[index] = n;
            }
            //increase index
            index++;
        }

        //set default index for iterations
        index = 0;
        //start with second because it will fill up the first spaces in the original
        //for second arrays fill the appropriate places in the original
        for (int k : secondArray) {
            ints[index] = k;
            index++;
        }
        //for first arrays fill the appropriate places in the original
        for (int k : firstArray) {
            ints[index] = k;
            index++;
        }
    }
}
