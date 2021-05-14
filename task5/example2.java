package MySQl.Task1.task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class example2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/ebookshop", "root", "");
                Statement statement = conn.createStatement();
                )
        {
            try {
                conn.setAutoCommit(false);
                statement.executeUpdate("insert into book values (4001, 'Paul Chan', 'Mahjong 101', 4.4, 4)");
                statement.executeUpdate("insert into book values (4001, 'Perter Chan', 'Mahjong 102', 4.4, 4)");
                conn.commit();
            }
            catch (SQLException exception) {
                System.out.println("--------------");
                conn.rollback();
                exception.printStackTrace();
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
