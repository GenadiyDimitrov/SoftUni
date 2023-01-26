package III_Arrays.T12_Exercise.MoreExercises;

import java.util.Scanner;

//TODO UNDERSTAND!
/*5.	Kamino Factory
The clone factory in Kamino got another order to clone troops.
But this time, you are tasked to find the best DNA sequence to use in the production.
You will receive the DNA length,
and until you receive the command "Clone them!"
you will be receiving DNA sequences of ones and zeroes, split by "!" (one or several).
You should select the sequence with the longest subsequence of ones.
If there are several sequences with the same length of a subsequence of ones,
print the one with the leftmost starting index,
if there are several sequences with the same length and starting index,
select the sequence with the greater sum of its elements.
After you receive the last command "Clone them!",
you should print the collected information in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"

-Input / Constraints
•	The first line holds the length of the sequences – integer in the range [1…100].
•	On the next lines, until you receive "Clone them!" you will be receiving sequences (at least one) of ones and zeroes, split by "!" (one or several).

-Output
The output should be printed on the console and consists of two lines in the following format:
"Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
"{DNA sequence, joined by space}"
*/
public class KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read length (we don't use it)
        sc.nextLine();

        //read the first input
        String input = sc.nextLine();
        //initialize variables
        String forAllZeros = input;
        int numberDNATest = 0;
        int bestSum = 0;
        int bestLength = 0;
        int bestNumber = 0;
        int bestIndex = 0;
        String bestInput = "";
        boolean zeros = false;
        String localnput = "";

        //loop until Clone them!
        while (!input.equals("Clone them!")) {

            //remove ! sign
            String noChars = input.replaceAll("!+", "");
            //split by 0
            String[] noZeros = noChars.split("0");
            //initialize current variables
            numberDNATest++;
            int localLength = 0;
            String localSequence = "";
            int sum = 0;

            //foreach row
            for (String noZero : noZeros) {
                //check length if it's bigger than the biggest
                if (noZero.length() > localLength) {
                    //set biggest
                    localLength = noZero.length();
                    //current biggest sequence
                    localSequence = noZero;
                    //original without !
                    localnput = noChars;
                }
                //total sum of all 1
                sum += noZero.length();
                //check it's not a 0!0!!0 array
                if (sum > 0) {
                    zeros = true;
                }
            }
            //get the start index of the biggest seq
            int localIndex = noChars.indexOf(localSequence);
            //if current best length bigger than overall best
            if (localLength > bestLength) {
                //update
                bestLength = localLength;
                bestNumber = numberDNATest;
                bestInput = localnput;
                bestSum = sum;
                bestIndex = localIndex;
            }
            //if the current best is equal to overall best
            else if (localLength == bestLength) {
                //check if current index better than overall best
                if (localIndex < bestIndex) {
                    //update
                    bestNumber = numberDNATest;
                    bestInput = localnput;
                    bestSum = sum;
                    bestIndex = localIndex;
                }
                //if current and best index are equal
                else if (localIndex == bestIndex) {
                    //check if current sum is better
                    if (bestSum < sum) {
                        //update
                        bestNumber = numberDNATest;
                        bestInput = localnput;
                        bestSum = sum;
                    }
                } else {
                    continue;
                }
            }

            localnput = "";


            input = sc.nextLine();


        }
        if (!zeros) {
            String output1 = forAllZeros.replaceAll("!+", "");  //Check if input is 0!0!0!0!0
            String[] bestAllZero = output1.split("");

            System.out.println("Best DNA sample 1" + " with sum: " + 0 + ".");
            for (String s : bestAllZero) {
                System.out.print(s + " ");
            }

        } else {
            String[] output = bestInput.split("");

            System.out.println("Best DNA sample " + bestNumber + " with sum: " + bestSum + ".");
            for (String s : output) {
                System.out.print(s + " ");
            }
        }
        sc.close();
    }
}
