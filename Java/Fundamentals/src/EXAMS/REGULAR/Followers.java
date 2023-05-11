package EXAMS.REGULAR;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        while (!command.equals("Log out")) {
            if (command.startsWith("New follower: ")) {
                String userName = command.replace("New follower: ", "");
                if (!data.containsKey(userName)) {
                    data.put(userName, 0);
                }
            } else if (command.startsWith("Like: ")) {
                command = command.replace("Like: ", "");
                String[] commandData = command.split(": ");
                String userName = commandData[0];
                Integer likes = Integer.parseInt(commandData[1]);
                if (!data.containsKey(userName)) {
                    data.put(userName, likes);
                } else {
                    data.put(userName, data.get(userName) + likes);
                }
            } else if (command.startsWith("Comment: ")) {
                String userName = command.replace("Comment: ", "");
                if (!data.containsKey(userName)) {
                    data.put(userName, 1);
                } else {
                    data.put(userName, data.get(userName) + 1);
                }
            } else if (command.startsWith("Blocked: ")) {
                String userName = command.replace("Blocked: ", "");
                if (!data.containsKey(userName)) {
                    System.out.println(userName + " doesn't exist.");
                } else {
                    data.remove(userName);
                }
            }

            command = sc.nextLine();
        }
        System.out.println(data.size() + " followers");
        for (var follower : data.entrySet()) {
            System.out.println(follower.getKey() + ": " + follower.getValue());
        }

        sc.close();
    }
}
