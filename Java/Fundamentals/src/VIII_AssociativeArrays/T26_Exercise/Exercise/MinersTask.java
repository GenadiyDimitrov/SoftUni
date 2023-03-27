package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*2.	A Miner Task
Until you receive the "stop" command, you will be given a sequence of strings, each on a new line. Every odd line on the console represents a resource (e.g., Gold, Silver, Copper, etc.) and every even - quantity. Your task is to collect the resources and print them on a new line.
Print the resources and their quantities in format: "{resource} –> {quantity}".
The quantities inputs will be in the range [1 … 2 000 000 000].
*/
public class MinersTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
        String command = sc.nextLine();
        while (!command.equals("stop")) {
            String type = command;
            int quantity = 0;
            if (data.containsKey(type)) {
                quantity = data.get(type);
            }
            command = sc.nextLine();
            if (!command.equals("stop")) {
                quantity += Integer.parseInt(command);
                //update dict here. if you want to see 0 after evenLine stop command add it outside the IF
                data.put(type, quantity);
                command = sc.nextLine();
            }
        }
        for (var d : data.entrySet()) {
            System.out.printf("%s -> %d%n", d.getKey(), d.getValue());
        }
        sc.close();
    }
}
