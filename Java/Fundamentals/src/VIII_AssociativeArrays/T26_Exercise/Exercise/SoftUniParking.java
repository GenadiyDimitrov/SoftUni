package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*4.	SoftUni Parking
Write a program that validates parking for an online service.
Users can register to park and unregister to leave.
The program receives 2 commands:


•	"register {username} {licensePlateNumber}":
o	The system only supports one car per user at the moment,
so if a user tries to register another license plate using the same username, the system should print:
"ERROR: already registered with plate number {licensePlateNumber}"
o	If the aforementioned checks pass successfully, the plate can be registered, so the system should print:
"{username} registered {licensePlateNumber} successfully"


•	"unregister {username}":
o	If the user is not present in the database, the system should print:
"ERROR: user {username} not found"
o	If the aforementioned check passes successfully, the system should print:
"{username} unregistered successfully"
After you execute all of the commands, print all the currently registered users and their license plates in the format:
•	"{username} => {licensePlateNumber}"


Input
•	First line: n - number of commands – integer.
•	Next n lines: commands in one of two possible formats:
o	Register: "register {username} {licensePlateNumber}"
o	Unregister: "unregister {username}"
The input will always be valid, and you do not need to check it explicitly.
*/
public class SoftUniParking {
    static LinkedHashMap<String, String> parkingData = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < commandsCount; i++) {
            String[] commandData = sc.nextLine().split(" ");
            commandReceived(commandData);
        }
        for (var data : parkingData.entrySet()) {
            System.out.printf("%s => %s%n", data.getKey(), data.getValue());
        }
        sc.close();
    }

    private static void commandReceived(String[] commandData) {
        String command = commandData[0];
        String userName = commandData[1];
        switch (command) {
            case "register":
                register(userName, commandData.length > 2 ? commandData[2] : "");
                break;
            case "unregister":
                unregister(userName);
                break;
        }
    }

    private static void unregister(String userName) {
        if (parkingData.containsKey(userName)) {
            parkingData.remove(userName);
            System.out.printf("%s unregistered successfully%n", userName);
        } else {
            System.out.printf("ERROR: user %s not found%n", userName);
        }
    }

    private static void register(String userName, String plateNumber) {
        if (parkingData.containsKey(userName)) {
            String currentPlate = parkingData.get(userName);
            System.out.printf("ERROR: already registered with plate number %s%n", currentPlate);
        } else {
            parkingData.put(userName, plateNumber);
            System.out.printf("%s registered %s successfully%n", userName, plateNumber);
        }

    }
}
