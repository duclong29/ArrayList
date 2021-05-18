package productShop.Controller;

import productShop.Model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductController {
    String url = "jdbc:mysql://localhost:3306/ebookshop";
    String user = "root";
    String password = "";

    List<Product> productList = new ArrayList<>();

    public List<Product> loading () {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from product";
            ResultSet resultSet = statement.executeQuery(select);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                double price = resultSet.getDouble("price");
                int qty = resultSet.getInt("qty");
                Product ojb = new Product(id, name, price, qty);
                productList.add(ojb);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return productList;
    }

    public int updateProduct (Product product) {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String update = "update product set name = '"+product.getName()+"' where id = " + product.getId();
            String updatePrice = "update product set price = '"+product.getPrice()+"' where id = " + product.getId();
            String updateQty = "update product set qty = '"+product.getQty()+"' where id = " + product.getId();
            Statement statement1 = connection.createStatement();
            int updateProduct = statement.executeUpdate(update);
            int price = statement.executeUpdate(updatePrice);
            int qty = statement.executeUpdate(updateQty);
            loading();
            if (updateProduct == 0) {
                return 0;
            }
            else {
                return 1;
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public boolean insert (Product product) {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select = "insert into product (id, name, price, qty) values ("+product.getId()+", '"+product.getName()+"', '"+product.getPrice()+"', '"+product.getQty()+"')";
            statement.executeUpdate(select);
            loading();
            System.out.println("product insert !!!");
            return true;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean detele (Product product) {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from product";
            ResultSet resultSet = statement.executeQuery(select);
            if (resultSet.next()) {
                String detele = "delete from product where id = " + product.getId();
                statement.executeUpdate(detele);
                loading();
                System.out.println("Product delete !!!");
                return true;
            }
            else {
                System.out.println("No delete product!!!");
                return false;
            }

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void display () {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from product";
            ResultSet resultSet = statement.executeQuery(select);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int colum = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= colum; i++) {
                System.out.printf("%-30s", resultSetMetaData.getCatalogName(i));
            }
            loading();
            System.out.println();
            while (resultSet.next()) {
                for (int i = 1; i <= colum; i++) {
                    System.out.printf("%-30s", resultSet.getString(i));
                }
                System.out.println();
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
