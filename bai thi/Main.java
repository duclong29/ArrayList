package baithi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();

        int n = 0;
        while (n < 4) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Save");
            System.out.println("4.Exit");

            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                    System.out.println("Enter StudentID :");
                    String id = sc.nextLine();
                    System.out.println("Enter StudentName :");
                    String name = sc.nextLine();
                    System.out.println("Enetr Address :");
                    String address = sc.nextLine();
                    System.out.println("Enter Phone :");
                    String phone = sc.nextLine();
                    Student student = new Student(id, name, address, phone);
                    manageStudent.insertStudent(student);
                    break;
                }
                case 2: {
                   manageStudent.printStudent();
                   break;
                }
                case 3: {
                    manageStudent.display();
                    break;
                }
                case 4: {
                    System.out.println("end");
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
}
