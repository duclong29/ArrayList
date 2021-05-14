package MySQl.Task1;

import java.sql.*;
import java.util.Scanner;

public class CustomerName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:/northwind", "root", "");
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from customers \n where ContactName = '"+name+"'; ";
            System.out.println(select);
            ResultSet resultSet = statement.executeQuery(select);
            int count = 0;
            while (resultSet.next()) {
                String customerID = resultSet.getString("CustomerID");
                String companyName = resultSet.getString("CompanyName");
                String ContactName = resultSet.getString("ContactName");
                String ContactTitle = resultSet.getString("ContactTitle");
                String Address = resultSet.getString("Address");
                String city = resultSet.getString("City");
                String Region = resultSet.getString("Region");
                String PostalCode = resultSet.getString("PostalCode");
                String Country = resultSet.getString("Country");
                String Phone = resultSet.getString("Phone");
                String Fax = resultSet.getString("Fax");
                count++;
                System.out.println(customerID + " , " + companyName + " , " + ContactName + " , " +ContactTitle
                + " , " + Address + " , " + city + " , " + Region + " , " + PostalCode + " , " +
                        Country + " , " + Phone + " , " + Fax);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
