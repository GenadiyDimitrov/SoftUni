package V_List.T18_Exercise.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*8.	*Anonymous Threat
Anonymous has created a cyber-hyper virus that steals data from the CIA.
As the lead security developer in the CIA,
you have been tasked to analyze the software of the virus and observe its actions on the data.
The virus is known for its innovative and unbelievably clever technique of merging and dividing data into partitions.

You will receive a single input line containing STRINGS separated by spaces.
The strings may contain any ASCII character except whitespace.

You will then begin receiving commands in one of the following formats:
•	merge {startIndex} {endIndex}
•	divide {index} {partitions}

Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex.
In other words, you should concatenate them.
Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.

Every time you receive the divide command, you must DIVIDE the element at the given index into several small substrings with equal length.
The count of the substrings should be equal to the given partitions.
Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS, and make the LAST one – the LONGEST.
Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}

The input ends when you receive the command "3:1". At that point, you must print the resulting elements, joined by a space.

Input
•	The first input line will contain the array of data.
•	On the next several input lines, you will receive commands in the format specified above.
•	The input ends when you receive the command "3:1".
Output
•	As output, you must print a single line containing the array elements, joined by a space.
Constrains
•	The strings in the array may contain any ASCII character except whitespace.
•	The startIndex and the endIndex will be in the range [-1000, 1000].
•	The endIndex will ALWAYS be GREATER than the startIndex.
•	The index in the divide command will ALWAYS be INSIDE the array.
•	The partitions will be in the range [0, 100].
•	Allowed working time/memory: 100ms / 16MB.
*/
public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the input line
        List<String> line = Arrays.stream(sc.nextLine().split(" +")).collect(Collectors.toList());
        //get initial command
        String command = sc.nextLine();
        //loop until command 3:!
        while (!command.equals("3:1")) {
            //split command in parts
            String[] commandSplit = command.split(" ");
            //parse parameters
            int indexStartDivide = Integer.parseInt(commandSplit[1]);
            int indexEndDivideTimes = Integer.parseInt(commandSplit[2]);
            //if command merge
            if (commandSplit[0].equals("merge")) {

                int startIndex = indexStartDivide;
                int endIndex = indexEndDivideTimes;
                //check bounds
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > line.size() - 1) {
                    endIndex = line.size() - 1;
                }
                //set counter
                int counter = startIndex;
                //from start to end
                for (int i = startIndex; i < endIndex; i++) {
                    //get the current + next string
                    String concat = line.get(counter) + line.get(counter + 1);
                    //change current to new
                    line.set(counter, concat);
                    //remove next
                    line.remove(counter + 1);
                }
            }
            //if command divide
            else if (commandSplit[0].equals("divide")) {

                int index = indexStartDivide;
                int partitions = indexEndDivideTimes;

                //if index in bounds and partitions in hundreds
                if (index >= 0 && index < line.size() && partitions >= 0 && partitions <= 100) {
                    //get current element
                    String element = line.get(index);
                    //create emty list
                    List<String> newList = new ArrayList<>();
                    //get how many elements in one part
                    int portionLength = element.length() / partitions;
                    //initial count
                    int count = 0;
                    if (element.length() % partitions == 0) {
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";
                            for (int j = 0; j < portionLength; j++) {
                                char symbol = element.charAt(count);
                                concat += symbol;
                                count++;
                            }
                            newList.add(concat);
                        }
                    } else {
                        for (int i = 0; i < partitions; i++) {
                            String concat = "";

                            if (i == partitions - 1) {
                                for (int j = count; j < element.length(); j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            } else {
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                            }
                            newList.add(concat);
                        }
                    }
                    line.remove(index);
                    line.addAll(index, newList);
                }
            }
            command = sc.nextLine();
        }
        //print all
        StringBuilder result = new StringBuilder();
        for (String s : line) {
            result.append(s).append(" ");
        }
        System.out.println(result.toString().trim());

        sc.close();
    }
}
