package III_Arrays.T12_Exercise.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

/*6.	LadyBugs
You are given a field size and the indexes of ladybugs inside the field.
After that, on every new line, until the "end" command is given,
a ladybug changes its position to its left or right by a given fly length.
A command to a ladybug looks like this: "0 right 1".
This means that the little insect placed on index 0 should fly one index to its right.
If the ladybug lands on a fellow ladybug, it continues to fly in the same direction by the same fly length.
If the ladybug flies out of the field, it is gone.

For example, imagine you are given a field with size 3 and ladybugs on indexes 0 and 1.
If the ladybug on index 0 needs to fly to its right by the length of 1 (0 right 1) it will attempt to land on index 1,
but as there is another ladybug there,
it will continue further to the right by an additional length of 1, landing on index 2.
After that, if the same ladybug needs to fly to its right by the length of 1 (2 right 1),
it will land somewhere outside the field, so it flies away:

If you are given a ladybug index that does not have a ladybug there, nothing happens.
If you are given a ladybug index that is outside the field, nothing happens.
Your job is to create the program, simulating the ladybugs flying around doing nothing.
In the end, print all cells in the field separated by blank spaces.
For each cell that has a ladybug on it print '1' and for each empty cell print '0'. For the example above, the output should be '0 1 0'.

-Input
•	On the first line, you will receive an integer - the size of the field.
•	On the second line, you will receive the initial indexes of all ladybugs separated by a blank space.
        The given indexes may or may not be inside the field range.
•	On the next lines, until you get the "end" command you will receive commands in the format: "{ladybug index} {direction} {fly length}".

-Output
•	Print the all cells within the field in format: "{cell} {cell} … {cell}"
o	If a cell has a ladybug in it, print '1'.
o	If a cell is empty, print '0' .

-Constraints
•	The size of the field will be in the range [0 … 1000].
•	The ladybug indexes will be in the range [-2,147,483,647 … 2,147,483,647].
•	The number of commands will be in the range [0 … 100].
•	The fly length will be in the range [-2,147,483,647 … 2,147,483,647].
*/
public class LadyBugs {
    public static int[] field = new int[0];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the field length
        int len = Integer.parseInt(sc.nextLine());
        //get the bugs positions
        int[] bugs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //create new field
        field = new int[len];
        //position the bugs on the filed
        for (int bug : bugs) {
            //if bug is outside the field do nothing
            if (bug >= 0 && bug < len) {
                field[bug] = 1;
            }
        }

        //get initial command
        String command = sc.nextLine();
        //loop until command is end
        while (!command.equals("end")) {
            //split the command
            String[] cmdData = command.split(" ");
            //get index and speed
            int bugIndex = Integer.parseInt(cmdData[0]);
            int bugSpeed = Integer.parseInt(cmdData[2]);
            //if selected bug is on the field
            if (bugIndex >= 0 && bugIndex < len) {
                //get the direction
                if (cmdData[1].equals("right")) {
                    moveRight(bugIndex, bugSpeed);
                } else if (cmdData[1].equals("left")) {
                    moveLeft(bugIndex, bugSpeed);
                }
            }
            //read next command
            command = sc.nextLine();
        }
        //print the field
        for (int bug : field) {
            System.out.printf("%d ", bug);
        }
        sc.close();
    }

    public static void moveRight(int bugIndex, int speed) {
        //if speed is negative reverse direction
        if (speed < 0) {
            moveLeft(bugIndex, speed * -1);
            return;
        }

        //if there is a bug in the selected index
        if (field[bugIndex] == 1) {
            //bug flies
            field[bugIndex] = 0;
            //and loop until land or out of the field
            for (int i = bugIndex + speed; i < field.length; i += speed) {
                //if field spot is empty
                if (field[i] == 0) {
                    //land
                    field[i] = 1;
                    break;
                }
            }
        }
    }

    public static void moveLeft(int bugIndex, int speed) {
        //if speed is negative reverse direction
        if (speed < 0) {
            moveRight(bugIndex, speed * -1);
            return;
        }

        //if there is a bug in the selected index
        if (field[bugIndex] == 1) {
            //bug flies
            field[bugIndex] = 0;
            //and loop until land or out of the field
            for (int i = bugIndex - speed; i >= 0; i -= speed) {
                //if field spot is empty
                if (field[i] == 0) {
                    //land
                    field[i] = 1;
                    break;
                }
            }
        }
    }

}
