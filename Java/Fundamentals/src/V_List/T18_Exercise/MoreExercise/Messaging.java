package V_List.T18_Exercise.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get the code
        List<Integer> code = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //get the string
        List<String> text = Arrays.stream(sc.nextLine().split("")).collect(Collectors.toList());
        //initial message
        StringBuilder message = new StringBuilder();
        //for each item in code
        for (int i = 0; i < code.size(); i++) {
            //get the sum of the digits
            int number = code.get(i);
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;
            }
            //get sum into bounds
            while (sum >= text.size()) {
                sum -= text.size();
            }
            //get element
            String element = text.get(sum);
            message.append(element);
            text.remove(sum);
        }
        //print
        System.out.println(message);
        sc.close();
    }
}
