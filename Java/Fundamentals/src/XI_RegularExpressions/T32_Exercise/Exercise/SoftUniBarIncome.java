package XI_RegularExpressions.T32_Exercise.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*3.	*SoftUni Bar Income
Until you receive a line with the text "end of shift",
you will be given lines of input.
But before processing that line, you have to do some validations first.

Each valid order should have a customer, product, count, and price:
•	Valid customer's name should be surrounded by '%' and must start with a capital letter, followed by lower-case letters.
•	Valid product contains any word character and must be surrounded by '<' and '>'.
•	The valid count is an integer surrounded by '|'.
•	The valid price is any real number followed by '$'.

The parts of a valid order should appear in the order given: customer, product, count, and price.
Between each part there can be other symbols, except ('|', '$', '%' and '. ')
For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
When you receive "end of shift", print the total amount of money for the day rounded to 2 decimal places in the following format: "Total income: {income}".
Input / Constraints
•	Strings must be processed until you receive the text "end of shift".
Output
•	Print all the valid lines in the format "{customerName}: {product} - {totalPrice}".
•	After receiving "end of shift" print the total amount of money for the day rounded to 2 decimal places in the following format: "Total income: {income}".
•	Allowed working time / memory: 100ms / 16MB.
*/
public class SoftUniBarIncome {
    private static class Customer {
        private String name;
        private String product;
        private double price;
        private int quantity;

        public double getTotalPrice() {
            return this.price * this.quantity;
        }

        public Customer(String name, String product, double price, int quantity) {
            this.name = name;
            this.product = product;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Customer customer = checkValidInput(input);
            if (customer != null) {
                System.out.printf("%s: %s - %.2f%n", customer.getName(), customer.getProduct(), customer.getTotalPrice());
                totalIncome += customer.getTotalPrice();
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
        sc.close();
    }

    private static Customer checkValidInput(String input) {
        String patternString = "/%([A-Z][a-z]*)%[^|$%.]*?<(\\w+)>[^|$%.]*?\\|(\\d+)\\|[^|$%.]*?([0-9]+(\\.[0-9]+)?)\\$/";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return new Customer(
                    matcher.group(1),
                    matcher.group(2),
                    Double.parseDouble(matcher.group(4)),
                    Integer.parseInt(matcher.group(3))
            );
        }
        return null;
    }

}
