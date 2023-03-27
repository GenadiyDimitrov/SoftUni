package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

/*8.	Company Users
Write a program which keeps the information about companies and their employees.
You will receive company names and an employees' id until you receive the "End" command.
Add each employee to the given company.
Keep in mind that a company cannot have two employees with the same id.
Print the company name and each employee's id in the following format:
"{company_name}
-- {id1}
-- {id2}
…
-- {idN}"
Input / Constraints
•	Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".
•	The input always will be valid.
*/
public class CompanyUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, List<String>> data = new LinkedHashMap<>();
        String command = sc.nextLine();
        while (!command.equals("End")) {
            String[] cmdData = command.split(" -> ");
            String name = cmdData[0];
            String id = cmdData[1];
            if (data.containsKey(name)) {
                if (!data.get(name).contains(id)) {
                    data.get(name).add(id);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(id);
                data.put(name, employees);
            }

            command = sc.nextLine();
        }
        for (var company : data.entrySet()) {
            System.out.println(company.getKey());
            for (var employee : company.getValue()) {
                System.out.printf("-- %s%n", employee);
            }
        }
        sc.close();
    }
}
