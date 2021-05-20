package exam.controller;

import exam.model.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userController {
        List<Users> usersList = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/exam";
        String user = "root";
        String password = "";

        public List<Users> loading () {

            try (
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    )
            {
                String select = "select * from users";
                ResultSet resultSet = statement.executeQuery(select);
                while (resultSet.next()) {
                    Users users = new Users();
                    users.setId(resultSet.getInt("id"));
                    users.setUserName(resultSet.getNString("name"));
                    users.setPassword(resultSet.getNString("pass"));
                    users.setRole(resultSet.getInt("role"));
                    users.setCreate(resultSet.getNString("creat"));
                    users.setUpdate(resultSet.getNString("updatedate"));
                    usersList.add(users);
                }
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            return usersList;
        }

        public boolean SignUp (Users users) {
            try (
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    )
            {
                String signUp = "insert into users (name, pass, role) values ( '"+users.getUserName()+"' , '"+users.getPassword()+"' , '"+users.getRole()+"') ";
                statement.executeUpdate(signUp);
                loading();
                System.out.println("");
                return true;
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            return false;
        }

        public Users signIn () {
            Users users = new Users();
            try (
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    )
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your userName :");
                String name = sc.nextLine();
                System.out.println("Enter your password :");
                String pass = sc.nextLine();
                String select = "select * from users where name = '"+ name+"' and pass = '"+pass+"' ";
                ResultSet resultSet = statement.executeQuery(select);
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String username = resultSet.getString("name");
                    String password =resultSet.getString("pass");
                    int role= resultSet.getInt("role");
                    String create = resultSet.getString("creat");
                    String update= resultSet.getString("updateddate");
                    users = new Users(id, username, password, role, create, update);
                }
                System.out.println();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            return users;
        }

        public void display () {
            try (
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    )
            {
                String select = "select * from users";
                ResultSet resultSet = statement.executeQuery(select);
                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                int colum = resultSetMetaData.getColumnCount();

                for (int i = 1; i <= colum; i++) {
                    System.out.printf("%-30s", resultSetMetaData.getColumnName(i));
                }
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
