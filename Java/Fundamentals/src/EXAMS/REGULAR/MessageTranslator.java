package EXAMS.REGULAR;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loops = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < loops; i++) {
            String row = sc.nextLine();
            CheckValid(row);
        }
        sc.close();
    }

    public static void CheckValid(String input) {
        boolean isValid = false;
        String patternString = "!([A-Z][a-z]*)!:\\[([A-z]*)\\]";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String command = matcher.group(1);
            String message = matcher.group(2);
            if (command.length() >= 3) {
                if (message.length() >= 8) {
                    Translate(message, command);
                    isValid = true;
                }
            }
        }
        if (!isValid) {
            System.out.println("The message is invalid");
        }

    }

    public static void Translate(String message, String command) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(command);
        stringBuilder.append(": ");
        for (int i = 0; i < message.length(); i++) {
            stringBuilder.append((int) message.charAt(i));
            if (i < message.length() - 1) stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);
    }


}
