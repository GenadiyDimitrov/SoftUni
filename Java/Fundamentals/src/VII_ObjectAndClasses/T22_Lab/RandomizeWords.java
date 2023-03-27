package VII_ObjectAndClasses.T22_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

/*1.	Randomize Words
You are given a list of words in one line.
Randomize their order and print each word on a separate line.
*/
public class RandomizeWords {
    //initialize randomizer
    private static final Random random = new Random();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get words of the sentence
        List<String> words = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        //loop until out of words
        while (words.size() > 0) {
            //get random index
            int index = random.nextInt(words.size());
            //print word on that index
            System.out.println(words.get(index));
            //remove from list
            words.remove(index);
        }
        sc.close();
    }
}
