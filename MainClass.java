package Project;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product[] arr = new product[3];
        int index = 0;

        // Pre-populate the initial products
        arr[index++] = new product(12, "Nokia", 490, 2, "mobile");
        arr[index++] = new product(102, "Dell", 50000, 1, "laptop");
        arr[index++] = new product(122, "Samsung", 20000, 3, "mobile");

        productMethod obj = new productMethod();
        System.out.println("Initial Products:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i].toString());
        }

        int choice = 0;
        do {
            System.out.println("\nChoices:");
            System.out.println("1: Add Products");
            System.out.println("2: Find Product by Name");
            System.out.println("3: Filter Price Less than ");
            System.out.println("4: Filter Price More than ");
            System.out.println("5: Find by Product Type");
            System.out.println("6: Find by Product ID");
            System.out.println("7: Filter Quantity Less than 2");
            System.out.println("8: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Add the product
                    System.out.print("Enter the number of products to add: ");
                    int x = sc.nextInt();
                    product[] arr1 = new product[x];
                    for (int i = 0; i < x; i++) {
                        System.out.println("Product " + (i + 1) + ":");
                        System.out.println("Enter the product ID, name, price, quantity, and type:");
                        arr1[i] = new product(sc.nextInt(), sc.next(), sc.nextFloat(), sc.nextInt(), sc.next());
                    }
                   
                    product[] arr2 = new product[index + arr1.length];
                    System.arraycopy(arr, 0, arr2, 0, index);
                    System.arraycopy(arr1, 0, arr2, index, arr1.length);
                    arr = arr2; 
                    index += arr1.length;
                    System.out.println("Products added successfully.");
                    break;

                case 2: // Find by product name
                    System.out.print("Enter the product name: ");
                    String name = sc.next();
                    obj.productName(arr, name);
                    break;

                case 3: // Filter the price less than 500
                    System.out.print("Enter the price to filter products which are less than: ");
                    float lessThanPrice = sc.nextFloat();
                    obj.filterPrice(arr, lessThanPrice);
                    break;

                case 4: // Filter the price more than 1000
                    System.out.print("Enter the price to filter products which are more than: ");
                    float moreThanPrice = sc.nextFloat();
                    obj.filterPrice1(arr, moreThanPrice);
                    break;

                case 5: // Find by product type
                    System.out.print("Enter the product type to find: ");
                    String type = sc.next();
                    obj.productType(arr, type);
                    break;

                case 6: // Find by product id
                    System.out.print("Enter the product id to find: ");
                    int id = sc.nextInt();
                    obj.productId(arr, id);
                    break;

                case 7: // Filter quantity less than 2
                    System.out.print("Enter the Quantity to filter products which are less than: ");
                    int qty = sc.nextInt();
                    obj.filterQty(arr, qty);
                    break;

                case 8: // Exit
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
