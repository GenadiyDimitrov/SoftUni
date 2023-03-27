package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*7.	Legendary Farming
You are playing a game,
and your goal is to win a legendary item - any legendary item will be good enough.
However, it's a tedious process and requires quite a bit of farming.
The possible items are:
•	"Shadowmourne" - requires 250 Shards
•	"Valanyr" - requires 250 Fragments
•	"Dragonwrath" - requires 250 Motes
"Shards", "Fragments", and "Motes" are the key materials (case-insensitive),
and everything else is junk.

You will be given lines of input in the format:
"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
Keep track of the key materials - the first one that reaches 250, wins the race.
At that point, you have to print that the corresponding legendary item is obtained.
In the end, print the remaining shards, fragments, and motes in the format:
"shards: {numberOfShards}
fragments: {numberOfFragments}
motes: {numberOfMotes}"
Finally, print the collected junk items in the order of appearance.

Input
•	Each line comes in the following format: "{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
Output
•	On the first line, print the obtained item in the format: "{Legendary item} obtained!" .
•	On the next three lines, print the remaining key materials.
•	On the several final lines, print the junk items.
•	All materials should be printed in the format: "{material}: {quantity}".
•	The output should be lowercase, except for the first letter of the legendary.
*/
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();
        int Shards = 0;
        int Fragments = 0;
        int Motes = 0;
        boolean stop = false;
        while (!stop) {
            String[] input = sc.nextLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                int quantity = Integer.parseInt(input[i]);
                i++;
                String mat = input[i].toLowerCase();

                if (mat.equalsIgnoreCase("shards")) {
                    Shards += quantity;
                    if (Shards >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        Shards -= 250;
                        stop = true;
                        break;
                    }
                } else if (mat.equalsIgnoreCase("fragments")) {
                    Fragments += quantity;
                    if (Fragments >= 250) {
                        System.out.println("Valanyr obtained!");
                        Fragments -= 250;
                        stop = true;
                        break;
                    }
                } else if (mat.equalsIgnoreCase("motes")) {
                    Motes += quantity;
                    if (Motes >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        Motes -= 250;
                        stop = true;
                        break;
                    }
                } else {
                    if (junk.containsKey(mat)) {
                        quantity += junk.get(mat);
                    }
                    junk.put(mat, quantity);
                }
            }
        }
        System.out.printf("shards: %d%n", Shards);
        System.out.printf("fragments: %d%n", Fragments);
        System.out.printf("motes: %d%n", Motes);
        for (var mat : junk.entrySet()) {
            System.out.printf("%s: %d%n", mat.getKey(), mat.getValue());
        }

        sc.close();
    }
}
