package VII_ObjectAndClasses.T23_Exercise.Exercise.groomingSalon;

/*First, write a Java class Pet with the following fields:
•	name: String
•	age: int
•	owner: String
The class constructor should receive all fields.
You need to create the appropriate getters and setters.
The class should override the toString() method in the following format:
"{name} {age} - ({owner})"*/
public class Pet {
    String name;
    String owner;
    Integer age;

    public Pet(String name, Integer age, String owner) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)", name, age, owner);
    }
}
