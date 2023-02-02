package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*6.	Cards Game
You will be given two hands of cards, which will be integer numbers.
Assume that you have two players.
You must find the winning deck and, respectively, the winner.
You start from the beginning of both hands.
Compare the cards from the first deck to those from the second.
The player, who has a bigger card,
takes both cards and puts them on the back of his hand -
the second player's card is last,
and the first person's card (the winning one) is before it (second to last),
and the player with the smaller card must remove the card from his deck.

If both players' cards have the same values - no one wins, and the two cards must be removed from the decks.

The game is over when one of the decks is left without any cards.
You have to print the winner on the console and the sum of the left cards:
"{First/Second} player wins! Sum: {sum}".
*/
public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get both decks
        List<Integer> firstDeck = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //while both have cards
        while (firstDeck.size() > 0 && secondDeck.size() > 0) {
            //get both cards from top of the deck
            int firstCard = firstDeck.get(0);
            int secondCard = secondDeck.get(0);
            //put them on the table (remove from deck)
            firstDeck.remove(0);
            secondDeck.remove(0);
            //if first card is bigger
            if (firstCard > secondCard) {
                //take bigger card and put it in the bottom
                firstDeck.add(firstCard);
                //take lower card and put it in the bottom
                firstDeck.add(secondCard);
            }
            //if second card is bigger
            else if (firstCard < secondCard) {
                //take bigger card and put it in the bottom
                secondDeck.add(secondCard);
                //take lower card and put it in the bottom
                secondDeck.add(firstCard);
            }
            //else if both are equal remove them from the table and put them in side pile (do nothing)
        }

        //print result
        int sum = 0;
        String player = "";
        if (firstDeck.size() > 0) {
            for (Integer number : firstDeck) {
                sum += number;
            }
            player = "First";
        } else {
            for (Integer number : secondDeck) {
                sum += number;
            }
            player = "Second";
        }
        System.out.printf("%s player wins! Sum: %d", player, sum);
        sc.close();
    }
}
