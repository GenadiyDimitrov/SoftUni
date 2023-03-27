package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.*;

/*4.	Students
Write a program that receives n count of students and orders them by grade (in descending).
Each student should have a first name (string), last name (string), and grade (a floating-point number).
Input
•	First-line will be a number n.
•	Next n lines you will get a student info in the format "{first name} {second name} {grade}".
Output
•	Print each student in the following format "{first name} {second name}: {grade}".
*/
public class Students {
    //create student class
    private static class Student {
        String name;
        double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String firstName) {
            this.name = firstName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of entries
        int rows = Integer.parseInt(sc.nextLine());
        //create empty list
        List<Student> students = new ArrayList<>();
        //for each entry
        for (int i = 0; i < rows; i++) {
            //get data
            String[] data = sc.nextLine().split(" ");
            //create student and add to list
            students.add(new Student(data[0] + " " + data[1], Double.parseDouble(data[2])));
        }
        //sort by grade in desc order
        Collections.sort(students, (s1, s2) -> s1.getGrade() - s2.getGrade() > 0 ? -1 : s1.getGrade() - s2.getGrade() < 0 ? 1 : 0);
        //print each row
        for (Student student : students) {
            System.out.printf("%s: %.2f%n", student.getName(), student.getGrade());
        }
        sc.close();
    }
}
