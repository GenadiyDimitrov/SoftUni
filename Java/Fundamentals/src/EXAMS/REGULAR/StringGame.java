package EXAMS.REGULAR;

import java.util.Scanner;
/*Manipulate and print string by given command*/
public class StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String command = sc.nextLine();
        while (!command.equals("Done")) {
            String[] commandData = command.split(" ");
            switch (commandData[0]) {
                case "Change":
                    mainString = Change(mainString, commandData[1].charAt(0), commandData[2].charAt(0));
                    break;
                case "Includes":
                    Includes(mainString, commandData[1]);
                    break;
                case "End":
                    End(mainString, commandData[1]);
                    break;
                case "Uppercase":
                    mainString = Uppercase(mainString);
                    break;
                case "FindIndex":
                    FindIndex(mainString, commandData[1].charAt(0));
                    break;
                case "Cut":
                    mainString = Cut(mainString, Integer.parseInt(commandData[1]), Integer.parseInt(commandData[2]));
                    break;
            }

            command = sc.nextLine();
        }
        sc.close();
    }

    public static String Change(String input, char toChange, char replacement) {
        String result = input.replace(toChange, replacement);
        System.out.println(result);
        return result;
    }

    public static void Includes(String input, String substring) {
        System.out.println(input.contains(substring) ? "True" : "False");
    }

    public static void End(String input, String substring) {
        System.out.println(input.endsWith(substring) ? "True" : "False");
    }

    public static String Uppercase(String input) {
        String result = input.toUpperCase();
        System.out.println(result);
        return result;
    }

    public static void FindIndex(String input, char character) {
        int result = input.indexOf(character);
        System.out.println(result);
    }

    public static String Cut(String input, int startIndex, int count) {
        StringBuilder result = new StringBuilder();
        int endIndex = Math.min(startIndex + count, input.length());
        for (int i = startIndex; i < endIndex; i++) {
            result.append(input.charAt(i));
        }
        System.out.println(result);
        return result.toString();
    }

}
