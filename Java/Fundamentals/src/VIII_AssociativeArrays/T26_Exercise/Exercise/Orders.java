package VIII_AssociativeArrays.T26_Exercise.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*3.	Orders
Write a program which keeps the information about products and their prices.
Each product has a name, a price, and its quantity.
If the product doesn't exist yet, add it with its starting quantity.

If you receive a product that already exists,
increases its quantity by the input quantity
and if its price is different, replace the price as well.

You will receive products' names, prices, and quantities on new lines.
Until you receive the command "buy", keep adding items.
When you do receive the command "buy",
 print the items with their names and the total price of all the products with that name.
Input
•	Until you receive "buy", the products come in the format: "{name} {price} {quantity}".
•	The product data is always delimited by a single space.
Output
•	Print information about each product, following the format:
"{productName} -> {totalPrice}"
•	Format the average total price to the 2nd decimal place.
*/
public class Orders {
    public static class Product {
        private double price;
        private int quantity;

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

        public Product(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Product> productData = new LinkedHashMap<>();
        String command = sc.nextLine();
        while (!command.equals("buy")) {
            String[] rowData = command.split(" ");
            String productName = rowData[0];
            double price = Double.parseDouble(rowData[1]);
            int quantity = Integer.parseInt(rowData[2]);
            Product product;
            if (productData.containsKey(productName)) {
                product = productData.get(productName);
            } else {
                product = new Product(0, 0);
            }
            product.setPrice(price);
            product.setQuantity(product.getQuantity() + quantity);
            productData.put(productName, product);
            command = sc.nextLine();
        }


        for (var d : productData.entrySet()) {
            Product product = d.getValue();
            double total = product.getQuantity() * product.getPrice();
            System.out.printf("%s -> %.2f%n", d.getKey(), total);
        }
        sc.close();
    }
}
