package V_List.T17_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*6.	List of Products
Read a number n and n lines of products.
Print a numbered list of all the products ordered by name.
*/
public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get te number of products
        int count = Integer.parseInt(sc.nextLine());
        //create empty list of products
        List<String> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            //insert in list
            products.add(sc.nextLine());
        }
        //sort the list
        Collections.sort(products);
        //print all
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
        sc.close();
    }
}
