package exam.view;

import exam.model.Users;
import exam.controller.userController;
import java.util.Scanner;

public class userView {
    Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.println("Enter your ID :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your account:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter your role: (1-student, 2-admin)");
        int role = Integer.parseInt(sc.nextLine());
        Users obj = new Users(name, password);

        userController userController = new userController();
        userController.SignUp(obj);
    }
}
