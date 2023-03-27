package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

/*5.	Courses
Write a program which keeps the information about courses.
Each course has a name and registered students.
You will receive the course name and student name until you receive the command "end".
Check if such a course already exists and if not - add the course.
Register the user into the course.
When you do receive the command "end", print the courses with their names and total registered users.
For each contest, print the registered users.

Input
•	Until you receive "end", the input come in the format: "{courseName} : {studentName}".
•	The product data is always delimited by " : ".

Output
•	Print information about each course, following the format:
"{courseName}: {registeredStudents}"
•	Print information about each student, following the format:
"-- {studentName}"
*/
public class Courses {
    static LinkedHashMap<String, List<String>> courseData = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" : ");
            String courseName = data[0];
            String studentName = data[1];

            if (courseData.containsKey(courseName)) {
                if (!courseData.get(courseName).contains(studentName)) {
                    courseData.get(courseName).add(studentName);
                }
            } else {
                List<String> students = new ArrayList<>();
                students.add(studentName);
                courseData.put(courseName, students);
            }
            input = sc.nextLine();
        }
        for (var course : courseData.entrySet()) {
            System.out.printf("%s: %d%n", course.getKey(), course.getValue().size());
            for (var student : course.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }
        sc.close();
    }
}
