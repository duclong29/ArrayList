package MySQl.Task1;

import java.sql.*;

public class Order {
    public static void main(String[] args) {
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/northwind", "root", "");
                Statement statement = con.createStatement();
                )
        {
            String select = "select * from orders";
            System.out.println(select);
            ResultSet resultSet = statement.executeQuery(select);
            int count = 0;
            while (resultSet.next()) {
                int orderID = resultSet.getInt("OrderID");
                String customerID = resultSet.getString("CustomerID");
                int employeeID = resultSet.getInt("EmployeeID");
                String orderDate = resultSet.getString("OrderDate");
                String requiredDate = resultSet.getString("RequiredDate");
                String ShippedDate = resultSet.getString("ShippedDate");
                int shipVia = resultSet.getInt("ShipVia");
                double freight = resultSet.getDouble("Freight");
                String shipName = resultSet.getString("ShipName");
                String shipAddress = resultSet.getString("ShipAddress");
                String shipCity = resultSet.getString("ShipCity");
                String shipRegion = resultSet.getString("ShipRegion");
                String shipPostalCode = resultSet.getString("ShipPostalCode");
                String ShipCountry = resultSet.getString("ShipCountry");
                count++;
                System.out.println(orderID + " , " + customerID + " , " + employeeID + " , " + orderDate + " , " +
                        requiredDate + " , " + ShippedDate + " , " + shipVia + " , " + freight + " , " +
                shipName + " , " + shipAddress + " , "  + shipCity + " , " + shipRegion + " , " + shipPostalCode +
                        " , " + ShipCountry);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
