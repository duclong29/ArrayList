package MySQl.Task1;

import java.sql.*;
import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min price : ");
        double minPrice = Integer.parseInt(sc.nextLine());
        System.out.println("Enetr max price : ");
        double maxPrice = Integer.parseInt(sc.nextLine());

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:/northwind", "root", "");
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from products where "+minPrice+" < UnitPrice || UnitPrice > "+maxPrice+";";
            System.out.println(select);
            ResultSet resultSet = statement.executeQuery(select);
            int count = 0;
            while (resultSet.next()) {
                int productID = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                int supplier = resultSet.getInt("SupplierID");
                String categoryID = resultSet.getString("CategoryID");
                String quantityPerUnit = resultSet.getString("QuantityPerUnit");
                double UnitPrice = resultSet.getDouble("UnitPrice");
                count++;
                System.out.println(productID + " , " + productName + " , " + supplier + " , " + categoryID + " , " +
                        quantityPerUnit + " , " + UnitPrice);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
