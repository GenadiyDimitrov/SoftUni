package III_Arrays.T12_Exercise.Exercises;

import java.util.Arrays;
import java.util.Scanner;

/*10.	Treasure Hunt
The pirates must safely carry a treasure chest back to the ship,
looting along the way.

Create a program that manages the state of the treasure chest along the way.
On the first line,
you will receive the initial loot of the treasure chest,
a string of items separated by a "|".
"{loot1}|{loot2}|{loot3} … {loot...n}"

The following lines represent commands until "Yohoho!" which ends the treasure hunt:
•	"Loot {item1} {item2}…{item...n}":
	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
	If an item is already contained, don't insert it.
•	"Drop {index}":
	Remove the loot at the given position and add it to the end of the treasure chest.
	If the index is invalid, skip the command.
•	"Steal {count}":
	Someone steals the last count loot items.
	If there are fewer items than the given count, remove as many as there are.
	Print the stolen items separated by ", ":
    "{item1}, {item2}, {item3} … {item..n}"

In the end,
output the average treasure gain,
which is the sum of all treasure items length divided by the count of all items inside the chest
formatted to the second decimal point:
"Average treasure gain: {averageGain} pirate credits."
If the chest is empty,
print the following message:
"Failed treasure hunt."

-Input
•	On the 1st line, you will receive the initial treasure chest (loot separated by "|").
•	On the following lines, you will receive commands until "Yohoho!".
-Output
•	Print the output in the format described above.
-Constraints
•	The loot items will be strings containing any ASCII code.
•	The indexes will be integers in the range [-200…200].
•	The count will be an integer in the range [1….100].

PS: This problem could be done with lists in few lines of code!
*/
public class TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the treasure array
        String[] treasure = sc.nextLine().split("\\|");
        //first command
        String command = sc.nextLine();
        //loop until command is Yohoho
        while (!command.equals("Yohoho!")) {
            //check type of command Loot, Drop,Steal
            if (command.startsWith("Loot ")) {
                //remove the Loot and get the new loot as string array
                String[] loot = command.replace("Loot ", "").split(" ");
                //loop the new loot
                for (String currentItem : loot) {
                    //check if the current treasure have the new item
                    if (Arrays.stream(treasure).noneMatch(s -> s.equals(currentItem))) {
                        //create new temp treasure to store the modifications
                        String[] newTreasure = new String[treasure.length + 1];
                        //each item is put in the first spot
                        newTreasure[0] = currentItem;
                        //if we have elements in the current treasure
                        if (treasure.length > 0) {
                            //copy the old treasure to the new but from next index as first spot is filled up by the new item
                            System.arraycopy(treasure, 0, newTreasure, 1, treasure.length);
                        }
                        //update the original treasure
                        treasure = newTreasure;
                    }
                }
            } else if (command.startsWith("Drop ")) {
                //get the dropped index
                int dropIndex = Integer.parseInt(command.split(" ")[1]);
                //check if valid index to drop
                if (dropIndex >= 0 && dropIndex < treasure.length) {
                    //create temp treasure with same length as original as only drop and then pick up
                    String[] newTreasure = new String[treasure.length];
                    //get the dropped item
                    String droppedItem = treasure[dropIndex];
                    //update the temp treasure last spot with the dropped item
                    newTreasure[treasure.length - 1] = droppedItem;
                    //tem index for the new array
                    int index = 0;
                    //loop until the dropped index
                    for (int i = 0; i < dropIndex; i++) {
                        //and update the corresponding spot
                        newTreasure[index] = treasure[i];
                        //increase the index
                        index++;
                    }
                    //skip the dropped index
                    for (int i = dropIndex + 1; i < treasure.length; i++) {
                        //and continue update the temp treasure
                        newTreasure[index] = treasure[i];
                        //increase the index
                        index++;
                    }
                    //update the original treasure
                    treasure = newTreasure;
                }
            } else if (command.startsWith("Steal ")) {
                //get the steal items count
                int stealCount = Integer.parseInt(command.split(" ")[1]);
                //get the length for the new array after stolen item
                int length = treasure.length - stealCount; // start Index for the next copy
                //check for negative number
                if (length < 0) length = 0;
                //create the temp array
                String[] newTreasure = new String[length];
                //if we have something to copy update the new treasure
                if (length > 0) {
                    System.arraycopy(treasure, 0, newTreasure, 0, length);
                }
                //if the old treasure have items
                if (treasure.length > 0) {
                    //update steal count to not be more than the current treasure
                    if (stealCount > treasure.length) stealCount = treasure.length;
                    //create temp array
                    String[] stolen = new String[stealCount];
                    //copy the stolen items to print them
                    System.arraycopy(treasure, length, stolen, 0, stealCount);
                    //print them
                    System.out.println(Arrays.toString(stolen).replace("[", "").replace("]", ""));
                }
                //update the original treasure
                treasure = newTreasure;
            }
            //wait for next command
            command = sc.nextLine();
        }
        //if there is a treasure
        if (treasure.length > 0) {
            //initialize profit
            double coins = 0;
            //calculate profit
            for (String item : treasure) {
                coins += item.length();
            }
            //calculate profit
            coins /= treasure.length;
            //print profit
            System.out.printf("Average treasure gain: %.2f pirate credits.", coins);
        } else {
            //else it's a failed hunt
            System.out.println("Failed treasure hunt.");
        }
        sc.close();
    }
}
