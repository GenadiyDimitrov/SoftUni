package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.*;

/*6.	Order by Age
You will receive an unknown number of lines.
On each line, you will receive an array with 3 elements.
The first element will be a string and represents the name of the person.
The second element will be a string and will represent the ID of the person.
The last element will be an integer which represents the age of the person.

When you receive the command "End", stop taking input and print all the people, ordered by age.
*/
public class OrderByAge {
    //create student class
    private static class Person {
        private final String name;
        private final int id;
        private final int age;

        public Person(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //get initial command
        String command = sc.nextLine();
        //generate list
        List<Person> personList = new ArrayList<>();
        //loop until End
        while (!command.equals("End")) {
            //get person data
            String[] data = command.split(" ");
            //insert new person in list
            personList.add(new Person(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));
            //wait next command
            command = sc.nextLine();
        }
        sc.close();
        //sort by age in asc order
        personList.sort(Comparator.comparingInt(Person::getAge));
        //print
        for (Person person : personList) {
            System.out.printf("%s with ID: %d is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
