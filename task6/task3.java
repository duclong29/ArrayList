package MySQl;

import java.sql.*;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");
                Statement statement = conn.createStatement();
        )
        {
        while (n < 5) {
            System.out.println("Inviting you to choose menu :");
            System.out.println("1. print coffee");
            System.out.println("2. add coffee");
            System.out.println("3. update coffee");
            System.out.println("4. delete coffee");
            System.out.println("5. thank you !!!");

            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                        String select = "select * from coffee";
                        ResultSet resultSet = statement.executeQuery(select);
                        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                        int munColum = resultSetMetaData.getColumnCount();
                        for (int i = 1; i <= munColum; i++) {
                            System.out.printf("%-30s", resultSetMetaData.getColumnName(i));
                        }
                        System.out.println();

                        for (int i = 1; i <= munColum; i++) {
                            System.out.printf("%-30s", "(" + resultSetMetaData.getColumnClassName(i) + ")");
                        }
                        System.out.println();
                        while (resultSet.next()) {
                            for (int i = 1; i <= munColum; ++i) {
                                System.out.printf("%-30s", resultSet.getString(i));
                            }
                            System.out.println();
                        }
                    break;
                }
                case 2: {
                        System.out.println();
                        System.out.println("Enter id of coffee :");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter name of coffee :");
                        String name = sc.nextLine();
                        System.out.println("Enter price of coffee :");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter produce of coffee :");
                        String produce = sc.nextLine();
                        System.out.println("Enter branch of coffee : ");
                        String branch = sc.nextLine();
                        System.out.println("Enter phone of coffee : ");
                        String phone = sc.nextLine();

                        String select = "insert into coffee values (?,?,?,?,?,?)";
                        PreparedStatement prep = conn.prepareStatement(select);
                        prep.setInt(1, id);
                        prep.setString(2, name);
                        prep.setInt(3, price);
                        prep.setString(4, produce);
                        prep.setString(5, branch);
                        prep.setString(6, phone);
                        int rowInsert = prep.executeUpdate();
                        String select1 = "select * from coffee";
                        ResultSet resultSet = statement.executeQuery(select1);
                        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                        int numColum = resultSetMetaData.getColumnCount();
                        while (resultSet.next()) {
                            for (int i = 1; i <= numColum; ++i) {
                                System.out.printf("%-30s", resultSet.getString(i));
                            }
                            System.out.println();
                        }
                        break;
                    }
                case 3: {
                        System.out.println("Enter id of coffee :");
                        int id= Integer.parseInt(sc.nextLine());
                        System.out.println("Enter newName of coffee :");
                        String name3 = sc.nextLine();
                        System.out.println("Enter newPrice of coffee :");
                        int price = Integer.parseInt(sc.nextLine());


                        String update3 ="UPDATE coffee set name = '" + name3 + "' where id = " + id;
                        String updatePrice ="update coffee set price = '"+price+"' where id = " + id;
                        Statement stmt4 = conn.createStatement();
                        int updateName = stmt4.executeUpdate(update3);
                        int UpdatePrice =stmt4.executeUpdate(updatePrice);
                        System.out.println("da thay doi !!!");
                        break;
                    }
                case 4: {
                        int delete = 0;
                        System.out.println("Enter id of coffee delete :");
                        int id = Integer.parseInt(sc.nextLine());
                        String select = "delete from coffee where id = '"+id+"'";
                        Statement statement1 = conn.createStatement();
                        delete = statement1.executeUpdate(select);

                        System.out.println("Da xoa !!!");
                        break;
                    }
                case 5: {
                        System.out.println("Chuc quy khach ngon mieng !!!");
                        break;
                    }
                default: {
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
