package MySQl.task4;

import java.sql.*;
import java.util.Scanner;

public class ebookshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement statement = connection.createStatement();
                )
        {
            while (n < 5) {
                System.out.println("   Hi    ");
                System.out.println("1. xoa id > 8000");
                System.out.println("2. them cung hai ban ghi");
                System.out.println("3. them id, title, name");
                System.out.println("4. xoa id");
                System.out.println("5. them 1 cuon co day du thong tin");

                n = Integer.parseInt(sc.nextLine());
                switch (n) {
                    case 1: {
                        String delete = "delete from book where id > 8000";
                        System.out.println(delete);
                        int countDelete = statement.executeUpdate(delete);
                        System.out.println("da xoa");
                        break;
                    }
                    case 2: {
                        System.out.println("Enter id of book :");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter title of book :");
                        String title = sc.nextLine();
                        System.out.println("Enter author of book :");
                        String author = sc.nextLine();
                        System.out.println("Enter price of book :");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter qty of book :");
                        int qty = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter id2 of book :");
                        int id2 = Integer.parseInt(sc.nextLine());

                        String insert = "insert into book values" + "( '"+id+"', '"+title+"', '"+author+"', '"+price+"', '"+qty+"' )," +
                        "( '"+id2+"', '"+title+"', '"+author+"', '"+price+"', '"+qty+"' )";
                        System.out.println(insert);
                        int countInsert = statement.executeUpdate(insert);
                        System.out.println(countInsert);
                        break;
                        }
                    case 3: {
                        System.out.println("Enter id of book :");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter title of book :");
                        String title = sc.nextLine();
                        System.out.println("Enter author of book :");
                        String author = sc.nextLine();
                        String pratialInsert = "insert into book (id, title, author) values ( '"+id+"', '"+title+"', '"+author+"')";
                        System.out.println(pratialInsert);
                        int countPatial = statement.executeUpdate(pratialInsert);
                        System.out.println(countPatial);
                        break;
                    }
                    case 4: {
                        int delete = 0;
                        System.out.println("Enter id of book :");
                        int id = Integer.parseInt(sc.nextLine());
                        String select = "delete from book where id = '"+id+"' ";
                        int countDelete = statement.executeUpdate(select);
                        System.out.println("da xoa!!");
                        break;
                    }
                    case 5: {
                        String select = "select * from book";
                        ResultSet resultSet = statement.executeQuery(select);
                        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                        int cumlum = resultSetMetaData.getColumnCount();

                        for (int i = 1; i <= cumlum; i++) {
                            System.out.printf("%-30s", resultSetMetaData.getColumnName(i));
                        }
                        for (int i = 1; i <= cumlum; i++) {
                            System.out.printf("%-30s", "(" + resultSetMetaData.getColumnClassName(i) + ")");
                        }
                        while (resultSet.next()) {
                            for (int i = 1; i <= cumlum; i++) {
                                System.out.printf("%-30s", resultSet.getString(i));
                            }
                            System.out.println();
                        }
                        break;
                    }
                    default:{
                        break;
                    }
                    }
                }
            }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
