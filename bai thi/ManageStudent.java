package baithi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    String url = "jdbc:mysql://localhost:3306/student";
    String user = "root";
    String password = "";

    List<Student> studentList = new ArrayList<>();

    public List<Student> loading () {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select = "select * from student";
            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()) {
                String StudentID = resultSet.getString("StudentID");
                String StudentName = resultSet.getString("StudentName");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Student student = new Student(StudentID, StudentName, Address, Phone);
                studentList.add(student);

            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return studentList;
    }


    public boolean insertStudent (Student student) {
        try  (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
                )
        {
            String select ="insert into student (StudentID, StudentName, Address, Phone) values ('"+student.getStudentID()+"', '"+student.getStudentName()+"', '"+student.getAddress()+"', '"+student.getPhone()+"' )";
            statement.executeUpdate(select);
            loading();
            System.out.println("");
            return true;
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void printStudent(){
        System.out.println("Student List:"+studentList);
        for (int i=0;i<this.studentList.size();i++){
            System.out.println(i+1+"."+this.studentList.get(i).getStudentID()+" , "+this.studentList.get(i).getStudentName()+" , "+this.studentList.get(i).getAddress()+" , "+this.studentList.get(i).getPhone());
        }
    }


    public void display () {
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();
        )
        {
            String select = "select * from student";
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
