package VII_ObjectAndClasses.T23_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*5.	Vehicle Catalogue
You have to make a catalog for vehicles.
You will receive two types of vehicles - a car or a truck.
Until you receive the command "End" you will receive lines of input in the format:
"{typeOfVehicle} {model} {color} {horsepower}"

After the "End" command,
you will start receiving models of vehicles.
Print for every received vehicle its data in the format:
Type: {typeOfVehicle}
Model: {modelOfVehicle}
Color: {colorOfVehicle}
Horsepower: {horsepowerOfVehicle}

When you receive the command "Close the Catalogue",
stop receiving input and print the average horsepower for the cars and the trucks in the format:
"{typeOfVehicles} have average horsepower of {averageHorsepower}."

The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.

Format the answer to the 2nd decimal point.
Constraints
•	The type of vehicle will always be a car or truck.
•	You will not receive the same model twice.
•	The received horsepower will be an integer in the interval [1…1000].
•	You will receive at most 50 vehicles.
•	Single whitespace will be used for the separator.
*/
public class VehicleCatalogue {
    private static class Vehicle {
        String type;
        String model;
        Integer hp;
        String color;

        public Vehicle(String type, String model, String color, Integer hp) {
            type = type.equalsIgnoreCase("car") ? "Car" : "Truck";
            this.type = type;
            this.model = model;
            this.hp = hp;
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public Integer getHp() {
            return hp;
        }

        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();
        //initial command
        String command = sc.nextLine();
        //Until you receive the command "End"
        while (!command.equals("End")) {
            //"{typeOfVehicle} {model} {color} {horsepower}"
            String[] data = command.split(" ");
            //add to list
            vehicles.add(new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3])));
            //read next line
            command = sc.nextLine();
        }
        command = sc.nextLine();
        //you will start receiving models of vehicles until "Close the Catalogue"
        while (!command.equals("Close the Catalogue")) {
            //receiving models of vehicles
            String model = command;
            //fint the model and print data
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", model);
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    System.out.printf("Horsepower: %d%n", vehicle.getHp());
                    break;
                }
            }
            command = sc.nextLine();
        }
        //get total count and hp for trucks and cars
        int carHP = 0;
        int truckHP = 0;
        int carCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Truck")) {
                truckCount++;
                truckHP += vehicle.getHp();
            } else {
                carCount++;
                carHP += vehicle.getHp();
            }
        }
        //calculate average and print
        double averageCarHp = 0.0;
        if (carCount > 0) averageCarHp = carHP * 1.0 / carCount;
        double averageTruckHp = 0.0;
        if (truckCount > 0) averageTruckHp = truckHP * 1.0 / truckCount;
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHp);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHp);
        sc.close();
    }
}
