package V_List.T18_Exercise.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*9.	*Pokemon Don't Go
In Pokemon Don't Go, when you walk to a certain Pokemon,
those closest to you naturally get further,
and those further from you get closer.

You will receive a sequence of integers, separated by spaces - the distances to the Pokemons.
Then you will begin receiving integers corresponding to indexes in that sequence.

When you receive an index, you must remove the element at that index from the sequence (as if you've captured the Pokemon).
•	You must INCREASE the value of all elements in the sequence which are LESS or EQUAL to the removed element with the value of the removed element.
•	You must DECREASE the value of all elements in the sequence which are GREATER than the removed element with the value of the removed element.

If the given index is LESS than 0, remove the first element of the sequence, and COPY the last element to its place.
If the given index is GREATER than the last index of the sequence, remove the last element from the sequence, and COPY the first element to its place.
The increasing and decreasing of elements should be done in these cases, also. The element whose value you should use is the REMOVED element.
The program ends when the sequence has no elements (there are no Pokemons left for Ely to catch).

Input
•	On the first line of input, you will receive a sequence of integers, separated by spaces.
•	On the next several lines, you will receive integers – the indexes.
Output
•	When the program ends, you must print the summed up value of all REMOVED elements on the console.
Constraints
•	The input data will consist ONLY of valid integers in the range [-2.147.483.648, 2.147.483.647].
*/
public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get pokemons places
        List<Integer> pokemons = Arrays.stream(sc.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());
        //initial list for removed pokemons
        List<Integer> pokemonsInInventory = new ArrayList<>();
        //loop until no more pokemons left to capture
        while (pokemons.size() > 0) {
            //get index of captured pokemon
            int index = Integer.parseInt(sc.nextLine());
            //check bounds
            if (index < 0) {
                index = 0;
                //condition for out of bound
                pokemons.add(1, pokemons.get(pokemons.size() - 1));
            }
            //check bounds
            if (index >= pokemons.size()) {
                index = pokemons.size() - 1;
                //condition for out of bound
                pokemons.add(pokemons.get(0));
            }
            //get captured pokemon
            int pokemon = pokemons.get(index);
            //remove from collection (because captured)
            pokemons.remove(index);
            //put in inventory
            pokemonsInInventory.add(pokemon);

            //for all that are left
            for (int i = 0; i < pokemons.size(); i++) {
                //get current
                int currentPokemon = pokemons.get(i);
                //if captured stronger evolve current, else devolve current
                int newPokemon = currentPokemon <= pokemon ? currentPokemon + pokemon : currentPokemon - pokemon;
                //replace whit (d)evolved
                pokemons.set(i, newPokemon);
            }
        }
        //print power of captured
        int sum = 0;
        for (Integer pokemon : pokemonsInInventory) {
            sum += pokemon;

        }
        System.out.println(sum);
        sc.close();
    }
}
