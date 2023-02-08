package VI_MidExamPreparation.T19;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*3.	Memory Game
Write a program that recreates the Memory game.
On the first line, you will receive a sequence of elements.
Each element in the sequence will have a twin.
Until the player receives "end" from the console,
you will receive strings with two integers separated by a space,
representing the indexes of elements in the sequence.
If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence,
you should add two matching elements at the middle of the sequence in the following format:
"-{number of moves until now}a"
Then print this message on the console:
"Invalid input! Adding additional elements to the board"

Input
•	On the first line, you will receive a sequence of elements.
•	On the following lines, you will receive integers until the command "end".

Output
•	Every time the player hit two matching elements, you should remove them from the sequence and print on the console the following message:
"Congrats! You have found matching elements - ${element}!"
•	If the player hit two different elements, you should print on the console the following message:
"Try again!"
•	If the player hit all matching elements before he receives "end" from the console, you should print on the console the following message:
"You have won in {number of moves until now} turns!"
•	If the player receives "end" before he hits all matching elements, you should print on the console the following message:
"Sorry you lose :(
{the current sequence's state}"

Constraints
•	All elements in the sequence will always have a matching element.
*/
public class MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the board
        List<String> board = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        //get initial command
        String command = sc.nextLine();
        //initial turns
        int turns = 0;
        while (!command.equals("end")) {
            turns++;
            int[] indexes = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            //If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence
            if (checkInvalidIndex(indexes[0], indexes[1], board.size())) {
                //add two matching elements at the middle of the sequence
                int middleIndex = board.size() / 2;
                board.add(middleIndex, "-" + turns + "a");
                board.add(middleIndex, "-" + turns + "a");
                //print this message on the console
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                //Every time the player hit two matching elements
                if (board.get(indexes[0]).equals(board.get(indexes[1]))) {
                    String element = board.get(indexes[0]);
                    int lastIndex = Math.max(indexes[0], indexes[1]);
                    int firstIndex = Math.min(indexes[0], indexes[1]);

                    //, you should remove them from the sequence
                    board.remove(lastIndex);
                    board.remove(firstIndex);

                    //and print on the console
                    System.out.println("Congrats! You have found matching elements - " + element + "!");
                } else {
                    //print on the console
                    System.out.println("Try again!");
                }
            }

            if (board.size() == 0) {
                //If the player hit all matching elements before he receives "end" from the console, print on the console
                System.out.println("You have won in " + turns + " turns!");
                return;
            }
            command = sc.nextLine();
        }
        //If the player receives "end" before he hits all matching elements, you should print on the console
        System.out.println("Sorry you lose :(");
        StringBuilder builder = new StringBuilder();
        for (String element : board) {
            builder.append(element).append(" ");
        }
        System.out.println(builder);
        sc.close();
    }

    private static boolean checkInvalidIndex(int index1, int index2, int size) {
        return index1 == index2 || checkInvalidIndex(index1, size) || checkInvalidIndex(index2, size);
    }

    private static boolean checkInvalidIndex(int index, int size) {
        return index < 0 || index >= size;
    }

}
