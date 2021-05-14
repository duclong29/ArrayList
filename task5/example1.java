package MySQl.Task1.task2;

import java.sql.*;

public class example1 {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/ebookshop", "root", "");
                Statement statement = conn.createStatement();
                )
        {
            try {
                conn.setAutoCommit(false);
                ResultSet resultSet = statement.executeQuery("select id, qty from book where id in (1001, 1002)");
                System.out.println("--------Before Update-----------");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + resultSet.getInt("qty"));
                }
                conn.commit();
                statement.executeUpdate("update book set qty = qty + 1 where id = 1001");
                statement.executeUpdate("update book set qty = qty + 1 where id = 1002");
                conn.commit();
                resultSet = statement.executeQuery("select id, qty from book where id in (1001, 1002)");
                System.out.println("-----------after update----------");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + resultSet.getInt("qty"));
                }
                conn.commit();
                statement.executeUpdate("update book set qty = qty - 99 where id = 1001");
                statement.executeUpdate("update book set qty = qty - 99 where id = 1002");
                conn.rollback();
                resultSet = statement.executeQuery("select id, qty from book where id in (1001, 1002)");
                System.out.println("----------after update and rollback");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + resultSet.getInt("qty"));
                }
                conn.commit();
            }
            catch (SQLException exception) {
                System.out.println("----------");
                conn.rollback();
                exception.printStackTrace();
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
