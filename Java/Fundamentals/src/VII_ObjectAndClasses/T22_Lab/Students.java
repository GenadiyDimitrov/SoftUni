package VII_ObjectAndClasses.T22_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5.	Students
Define a class Student, which holds the following information about students:
first name, last name, age, and hometown.

Read the list of students until you receive the "end" command.
After that, you will receive a city name.
Print only students which are from the given city,
in the following format:
"{firstName} {lastName} is {age} years old".

6.	Students 2.0
Use the class from the previous problem.
If you receive a student who already exists
(first name and last name should be unique),
overwrite the information.

*/
public class Students {
    //create student class
    static class Student {
        public Student(String name, String lastName, String city, String age) {
            this.name = name;
            this.lastName = lastName;
            this.city = city;
            this.age = age;
        }

        String name;
        String lastName;
        String city;
        String age;

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getCity() {
            return city;
        }

        public String getAge() {
            return age;
        }


        //region PROBLEM 6
        public void setCity(String city) {
            this.city = city;
        }

        public void setAge(String age) {
            this.age = age;
        }
        //endregion PROBLEM 6
    }

    public static void main(String[] args) {
        //initialize scanner
        Scanner sc = new Scanner(System.in);
        //get initial command
        String command = sc.nextLine();
        //generate list of students
        List<Student> students = new ArrayList<>();
        //loop until end command
        while (!command.equals("end")) {
            //get student data
            String[] data = command.split(" ");
            String name = data[0];
            String lastName = data[1];
            String age = data[2];
            String city = data[3];
            //region PROBLEM 6
            boolean exist = false;
            for (Student student : students) {
                if (student.getName().equals(name) && student.getLastName().equals(lastName)) {
                    student.setAge(age);
                    student.setCity(city);
                    exist = true;
                    break;
                }
            }
            //endregion PROBLEM 6
            //add new student
            /*region PROBLEM 6*/
            if (!exist)
                /*endregion PROBLEM 6*/
                students.add(new Student(name, lastName, city, age));

            //get next command
            command = sc.nextLine();
        }
        //get the requested city
        String city = sc.nextLine();
        //print students of this city
        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.printf("%s %s is %s years old%n", student.getName(), student.getLastName(), student.getAge());
            }
        }
        sc.close();
    }
}
