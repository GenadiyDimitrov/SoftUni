package II_DataTypesAndVariable.T9_Exercise.MoreExercises;

import java.util.Scanner;

/*1. Data Type Finder

You will receive input until you receive "END". Find what data type is the input. Possible data types are:

· Integer
· Floating point
· Characters
· Boolean
· Strings

Print the result in the following format: "{input} is {data type} type".*/
public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get initial command
        String command = sc.nextLine();
        //loop until command == END
        while (!command.equals("END")) {
            //default value
            String dataType = "string";
            try {
                //try parse command as int
                Integer.parseInt(command);
                //if success set dataType
                dataType = "integer";
            } catch (Exception ex) {
                try {
                    //try parse command as double
                    Double.parseDouble(command);
                    //if success set dataType
                    dataType = "floating point";
                } catch (Exception exe) {
                    //if command is true or false its boolean
                    if (command.equalsIgnoreCase("true") || command.equalsIgnoreCase("false")) {
                        //if success set dataType
                        dataType = "boolean";
                    }
                    //else if command is only single symbol its char
                    else if (command.length() == 1) {
                        //if success set dataType
                        dataType = "character";
                    }
                }
            }
            //print result
            System.out.printf("%s is %s type%n", command, dataType);
            //read next line
            command = sc.nextLine();
        }
        sc.close();
    }
}
