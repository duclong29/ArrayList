package MySQl.Task1;

import java.sql.*;

public class Product {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:/northwind", "root", "");
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from products";
            System.out.println(select);
            ResultSet resultSet = statement.executeQuery(select);
            int count = 0;
            while (resultSet.next()) {
                String productID = resultSet.getString("ProductID");
                String productName = resultSet.getString("ProductName");
                int suppliesID = resultSet.getInt("SupplierID");
                String categoryID = resultSet.getString("CategoryID");
                String quantityPerUnit = resultSet.getString("QuantityPerUnit");
                double unitPrice = resultSet.getDouble("UnitPrice");
                count++;
                System.out.println(productID + productName + suppliesID + categoryID + quantityPerUnit + unitPrice);
            }
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
