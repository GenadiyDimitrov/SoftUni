package V_List.T18_Exercise.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*10.	 *SoftUni Course Planning

On the first input line, you will receive the initial schedule of lessons and exercises that will be part of the next course,
separated by a comma and space ", ".
But before the course starts, there are some changes to be made.
Until you receive "course start", you will be given some commands to modify the course schedule.

The possible commands are:
-Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
-Insert:{lessonTitle}:{index} - insert the lesson to the given index, if it does not exist
Remove:{lessonTitle} - remove the lesson, if it exists
    you should do the same with the Exercises, if there are any, which follow the lessons.
Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
    you should do the same with the Exercises, if there are any, which follow the lessons.
Exercise:{lessonTitle} - add Exercise in the schedule right after the lesson index,
    if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise".
    If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.

Input
•	On the first line -the initial schedule lessons -strings, separated by comma and space ", ".
•	Until "course start", you will receive commands in the format described above.
Output
•	Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
"{lesson index}.{lessonTitle}".
•	Allowed working time / memory: 100ms / 16MB.
*/
public class SoftUniCoursePlanning {
    public static List<String> schedule;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get initial schedule
        schedule = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        //get initial command
        String command = sc.nextLine();
        //loop until course start
        while (!command.equals("course start")) {
            //split command to parameters
            String[] parameters = command.split(":");
            //get lesson title
            String lessonTitle = parameters[1];
            //find the command and invoke method
            switch (parameters[0]) {
                case "Add":
                    add(lessonTitle, -1);
                    break;
                case "Insert":
                    int index = Integer.parseInt(parameters[2]);
                    if (index < 0) index = 0;
                    else if (index > schedule.size()) index = schedule.size();
                    add(lessonTitle, index);
                    break;
                case "Remove":
                    remove(lessonTitle);
                    break;
                case "Exercise":
                    exercise(lessonTitle);
                    break;
                case "Swap":
                    String secondTitle = parameters[2];
                    swap(lessonTitle, secondTitle);
                    break;

            }

            command = sc.nextLine();
        }

        //print
        for (int i = 0; i < schedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, schedule.get(i));
        }
        sc.close();
    }

    private static void swap(String lessonTitle, String secondTitle) {
        //check if both exist to swap
        if (schedule.contains(lessonTitle) && schedule.contains(secondTitle)) {
            //get both indexes
            int firstIndex = schedule.indexOf(lessonTitle);
            int secondIndex = schedule.indexOf(secondTitle);
            //change values with the other
            schedule.set(firstIndex, secondTitle);
            schedule.set(secondIndex, lessonTitle);
        }
        //cant be done as lessons because one lesson will have exercise, but the other won't
        //get the names of first exercise
        String exerciseTitle = lessonTitle + "-Exercise";
        //check if exist
        if (schedule.contains(exerciseTitle)) {
            //remove it
            schedule.remove(exerciseTitle);
            //get the index of the lesson
            int firstIndex = schedule.indexOf(lessonTitle);
            //add it behind the lesson
            schedule.add(firstIndex + 1, exerciseTitle);
        }
        //get the names of second exercise
        String secondExerciseTitle = secondTitle + "-Exercise";
        //check if exist
        if (schedule.contains(secondExerciseTitle)) {
            //remove it
            schedule.remove(secondExerciseTitle);
            //get the index of the lesson
            int secondIndex = schedule.indexOf(secondTitle);
            //add it behind the lesson
            schedule.add(secondIndex + 1, secondExerciseTitle);
        }
    }

    private static void remove(String lessonTitle) {
        //get exercise name
        String exerciseTitle = lessonTitle + "-Exercise";
        //remove both lesson and exercise
        schedule.remove(lessonTitle);
        schedule.remove(exerciseTitle);
    }

    private static void exercise(String lessonTitle) {
        //get exercise name
        String exerciseTitle = lessonTitle + "-Exercise";
        //check if lesson not present
        if (!schedule.contains(lessonTitle)) {
            //add lesson
            add(lessonTitle, -1);
            //add the exercise
            add(exerciseTitle, -1);
        }
        //check if exercise present
        else if (!schedule.contains(exerciseTitle)) {
            //add the behind lesson
            add(exerciseTitle, schedule.indexOf(lessonTitle) + 1);
        }
    }

    private static void add(String lessonTitle, int i) {
        //self explanatory
        if (!schedule.contains(lessonTitle)) {
            if (i < 0) {
                schedule.add(lessonTitle);
            } else {
                schedule.add(i, lessonTitle);
            }
        }
    }
}
