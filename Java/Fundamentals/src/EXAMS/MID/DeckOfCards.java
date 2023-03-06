package EXAMS.MID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*3. Deck of cards
You will receive deck of cards on a signe line separated by ", "
on second line number of commands to execute

after all commands print result deck

* */
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        //get the list
        List<String> deck = firstLine.length() > 0 ? Arrays.stream(firstLine.split(", +")).collect(Collectors.toList()) : new ArrayList<>();
        //get the number of commands
        int commandsCount = Integer.parseInt(sc.nextLine());
        //loop all commands
        for (int i = 0; i < commandsCount; i++) {
            //get the command
            String command = sc.nextLine();
            //split command to get parameters
            String[] commandParameters = command.split(", +");
            //type of manipulation
            String type = commandParameters[0];
            //second item
            String cardNameOrIndex = commandParameters[1];
            //for each manipulation execute (could be done with methods to invoke)
            switch (type) {
                case "Add":
                    if (deck.contains(cardNameOrIndex)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        deck.add(cardNameOrIndex);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    if (deck.contains(cardNameOrIndex)) {
                        deck.remove(cardNameOrIndex);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    try {
                        int removeIndex = Integer.parseInt(cardNameOrIndex);
                        if (removeIndex < 0 || removeIndex > deck.size() - 1) {
                            System.out.println("Index out of range");
                        } else {
                            deck.remove(removeIndex);
                            System.out.println("Card successfully removed");
                        }
                    } catch (Exception e) {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    try {
                        int insertIndex = Integer.parseInt(cardNameOrIndex);
                        String cardName = commandParameters[2];
                        if (insertIndex < 0 || insertIndex > deck.size() - 1) {
                            System.out.println("Index out of range");
                        } else {
                            if (deck.contains(cardName)) {
                                System.out.println("Card is already added");
                            } else {
                                deck.add(insertIndex, cardName);
                                System.out.println("Card successfully added");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        //print result
        StringBuilder result = new StringBuilder();
        for (String card : deck) {
            result.append(card).append(", ");
        }
        System.out.println(result.toString().replaceAll(", $", ""));
        sc.close();
    }
}
