package exam.view;

import java.util.Scanner;
import exam.controller.userController;
import exam.model.Users;

import java.util.SortedMap;

public class examshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userController userController = new userController();
        userView userView = new userView();
        int n = 0;

        while (n < 3) {
            System.out.println("1. SignIn");
            System.out.println("2. SignUp");
            System.out.println("3. display");
            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                    userController.signIn();
                    break;
                }
                case 2: {
                    System.out.println("Enter your account:");
                    String name = sc.nextLine();
                    System.out.println("Enter your password:");
                    String password = sc.nextLine();
                    userController.SignUp(new Users(name, password));
                    break;
                }
                case 3: {
                    userController.display();
                    break;
                }
            }
        }
    }
}
