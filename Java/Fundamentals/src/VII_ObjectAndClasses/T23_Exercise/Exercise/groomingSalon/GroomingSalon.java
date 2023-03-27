package VII_ObjectAndClasses.T23_Exercise.Exercise.groomingSalon;

import java.util.ArrayList;
import java.util.List;

/*Next, write a Java class GroomingSalon that has data (a collection, which stores the Pets).
All entities inside the repository have the same fields.
Also, the GroomingSalon class should have those fields:
•	capacity: int
The class constructor should receive capacity, also it should initialize the data with a new instance of the collection.

Implement the following features:
•	Field data – List that holds added pets
•	Method add(Pet pet) – adds an entity to the data if there is an empty place in the grooming salon for the pet.
•	Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.
•	Method getPet(String name, String owner) – returns the pet with the given name and owner or null if no such pet exists.
•	Getter getCount – returns the number of pets.
•	getStatistics() – returns a String in the following format:
o	" The grooming salon has the following clients:
{name} {owner}
{name} {owner}
   (…)"
*/
public class GroomingSalon {
    public GroomingSalon(Integer capacity) {
        data = new ArrayList<>();
        this.capacity = capacity;
    }

    private List<Pet> data;
    private Integer capacity = 0;

    public List<Pet> getData() {
        return data;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder("The grooming salon has the following clients:"  + System.lineSeparator());
        for (Pet pet : data) {
            builder.append(pet.getName())
            .append(" ")
            .append(pet.getOwner())
            .append(System.lineSeparator());
        }
        return builder.toString().trim();
    }

    public void add(Pet pet) {
        if (capacity > data.size()) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }


}
