package XI_RegularExpressions.T32_Exercise.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*1.	Furniture
Write a program to calculate the total cost of different types of furniture.
You will be given some lines of input until you receive the line "Purchase".
For the line to be valid, it should be in the following format:
">>{furniture name}<<{price}!{quantity}"

The price can be a floating-point number or a whole number.
Store the names of the furniture and the total price.

In the end,
print each bought furniture on a separate line in the format:
"Bought furniture:
{1st name}
{2nd name}
…"

And on the last line, print the following:
"Total money spend: {spend money}",
formatted to the second decimal point.
*/
public class Furniture {
    private static class FurnitureItem {
        String name;
        double price;
        int quantity;

        public FurnitureItem(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public double getTotalPrice() {
            return this.price * this.quantity;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        List<FurnitureItem> furnitures = new ArrayList<>();
        while (!command.equals("Purchase")) {
            FurnitureItem furnitureItem = checkValidInput(command);
            if (furnitureItem != null) {
                furnitures.add(furnitureItem);
            }
            command = sc.nextLine();
        }
        double total = 0;
        System.out.println("Bought furniture:");
        for (var item : furnitures) {
            System.out.println(item.getName());
            total += item.getTotalPrice();
        }
        System.out.printf("Total money spend: %.2f", total);
        sc.close();
    }

    private static FurnitureItem checkValidInput(String input) {
        if (input.startsWith(">>") && !input.startsWith(">>>")) {
            String regex = ">>([\\s\\S]+)<<([0-9]+.?[0-9]+)!([0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                return new FurnitureItem(
                        matcher.group(1),
                        Double.parseDouble(matcher.group(2)),
                        Integer.parseInt(matcher.group(3))
                );
            }
        }
        return null;
    }

}
