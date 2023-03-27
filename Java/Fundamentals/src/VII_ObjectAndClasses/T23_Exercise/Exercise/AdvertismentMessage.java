package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.Random;
import java.util.Scanner;

/*1.	Advertisement Message
Write a program that generates random fake advertisement messages to extol some product.
The messages must consist of 4 parts:
laudatory phrase + event + author + city. Use the following predefined parts:

•	Phrases
o	"Excellent product."
o	"Such a great product."
o	"I always use that product."
o	"Best product of its category."
o	"Exceptional product."
o	"I can’t live without this product."

•	Events
o	"Now I feel good."
o	"I have succeeded with this product."
o	"Makes miracles. I am happy of the results!"
o	"I cannot believe but now I feel awesome."
o	"Try it yourself, I am very satisfied."
o	"I feel great!"

•	Authors
o	"Diana"
o	"Petya"
o	"Stella"
o	"Elena"
o	"Katya"
o	"Iva"
o	"Annie"
o	"Eva"

•	Cities
o	"Burgas"
o	"Sofia"
o	"Plovdiv"
o	"Varna"
o	"Ruse"

The format of the output message is: "{phrase} {event} {author} – {city}".

As an input, you take the number of messages to be generated.
Print each random message on a separate line.
*/
public class AdvertismentMessage {
    public static void main(String[] args) {
        //region phrases,events,authors,cities
        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };
        String[] events = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };
        String[] authors = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };
        String[] cities = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };
        //endregion
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            System.out.printf("%s %s %s – %s%n",
                    phrases[rnd.nextInt(phrases.length)],
                    events[rnd.nextInt(events.length)],
                    authors[rnd.nextInt(authors.length)],
                    cities[rnd.nextInt(cities.length)]);
        }
        sc.close();
    }
}
