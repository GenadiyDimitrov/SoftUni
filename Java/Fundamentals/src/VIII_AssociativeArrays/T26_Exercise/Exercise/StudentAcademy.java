package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.*;

/*6.	Student Academy
Write a program that keeps the information about students and their grades.
On the first line, you will receive number n. 
After that, you will receive n pair of rows. 

First, you will receive the student's name, 
after that, you will receive his grade. 
Check if the student already exists and if not - add him. 
Keep track of all grades for each student.
When you finish reading data, keep students with an average grade higher or equal to 4.50. 
Print the students and their average grade in the format:
"{name} –> {averageGrade}"
Format the average grade to the 2nd decimal place.
*/
public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, List<Double>> data = new LinkedHashMap<>();
        for (int i = 0; i < rows; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            if (data.containsKey(name)) {
                data.get(name).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                data.put(name, grades);
            }
        }
        for (var student : data.entrySet()) {
            double average = 0;
            for (var grade : student.getValue()) {
                average += grade;
            }
            average /= student.getValue().size();
            if (average >= 4.5) {
                System.out.printf("%s -> %.2f%n", student.getKey(), average);
            }
        }
        sc.close();
    }
}
