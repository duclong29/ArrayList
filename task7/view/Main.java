package productShop.view;

import productShop.Controller.ProductController;
import productShop.Model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductController productController = new ProductController();

        System.out.println("Welcome To Our Products !!!");
        int n = 0;
        while (n < 5) {
            System.out.println("1. Display Product");
            System.out.println("2. Insert Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Thank You !!!");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    productController.display();
                    break;
                }
                case 2: {
                    System.out.println("Enter id of product :");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name of product :");
                    String name = sc.nextLine();
                    System.out.println("Enter price of product :");
                    double price = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter qty of product :");
                    int qty = Integer.parseInt(sc.nextLine());

                    productController.insert(new Product(id, name, price, qty));
                    break;
                }
                case 3: {
                    System.out.println("Enter id of product delete :");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter name of product :");
                    String name = sc.nextLine();
                    System.out.println("Enter price of product :");
                    double price = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter qty of product :");
                    int qty = Integer.parseInt(sc.nextLine());
                    productController.updateProduct(new Product(id, name, price, qty));
                    break;
                }
                case 4: {
                    System.out.println("Enter id of product delete :");
                    int id = Integer.parseInt(sc.nextLine());
                    productController.detele(new Product(id));
                    break;
                }
                case 5: {
                    System.out.println("!@#$%^&*");
                    break;
                }
                default:{
                    break;
                }
            }

        }
    }
}
