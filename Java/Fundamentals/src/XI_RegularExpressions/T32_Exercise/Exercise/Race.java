package XI_RegularExpressions.T32_Exercise.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*2.	Race
Write a program that processes information about a race.

On the first line, you will be given a list of participants separated by ", ".
On the next few lines, until you receive the line "end of race"
you will be given some info which will be some alphanumeric characters.
In between them, you could have some extra characters which you should ignore.
For example: "G!32e%o7r#32g$235@!2e".
The letters are the name of the person, and the sum of the digits is the distance he ran.
So here we have George, who ran 29 km.

Store the information about the person only if the list of racers contains the name of the person.
If you receive the same person more than once add the distance to his old distance.

Finally, print the racers in the order they are given, in the format:
"1st place: {first racer}
2nd place: {second racer}
3rd place: {third racer}"
*/
public class Race {
    // function to sort hashmap by values
    public static List<String> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        List<String> temp = new ArrayList<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.add(aa.getKey());
        }
        Collections.reverse(temp);
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, Integer> raceData = new HashMap<>();
        for (var name : input.split(", ")) {
            raceData.put(name, 0);
            if (raceData.size() == 3) break;
        }
        input = sc.nextLine();
        while (!input.equals("end of race")) {
            String patternString = "[A-Za-z]";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();
            while (matcher.find()) {
                nameBuilder.append(matcher.group());
            }
            String name = nameBuilder.toString();
            if (raceData.containsKey(name)) {
                int distance = raceData.get(name);
                patternString = "[0-9]+";
                pattern = Pattern.compile(patternString);
                matcher = pattern.matcher(input);
                while (matcher.find()) {
                    distance += Integer.parseInt(matcher.group());
                }
                raceData.put(name, distance);
            }
            input = sc.nextLine();
        }
        var raceDataSorted = sortByValue(raceData);
        if (raceDataSorted.size() > 0) {
            System.out.printf("1st place: %s", raceDataSorted.get(0));
        }
        if (raceDataSorted.size() > 1) {
            System.out.println();
            System.out.printf("2nd place: %s", raceDataSorted.get(1));
        }
        if (raceDataSorted.size() > 2) {
            System.out.println();
            System.out.printf("3rd place: %s", raceDataSorted.get(2));
        }
        sc.close();
    }
}
