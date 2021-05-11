package ArrayList.Ex_love;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex_love_List ex_love_list = new Ex_love_List();

        int n = 0;
        while (n < 6) {
            System.out.println("Inviting you to choose menu :");
            System.out.println("1. Print Ex_love");
            System.out.println("2. Add Ex_love");
            System.out.println("3. Delete Ex_love");
            System.out.println("4. Search Ex_love");
            System.out.println("5. Sort Ex_love");
            System.out.println("6. And");
            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                    ex_love_list.PrintExLove();
                    break;
                }
                case 2: {
                    System.out.println("New name you enter Ex_love :");
                    String name = sc.nextLine();
                    System.out.println("New age you enter EX_love :");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("New address you enter Ex_love :");
                    String address = sc.nextLine();
                    System.out.println("New appearence you enter Ex_love :");
                    String appearence = sc.nextLine();

                    Ex_love ex_love = new Ex_love(name, age, address, appearence);
                    ex_love_list.AddExlove(ex_love);
                    System.out.println(ex_love.toString());
                    break;
                }
                case 3: {
                    System.out.println("New name to delete Ex_love :");
                    String name = sc.nextLine();
                    ex_love_list.DeleteExLove(name);
                    break;
                }
                case 4: {
                    System.out.println("New name to search Ex_love : ");
                    String name = sc.nextLine();
                    ex_love_list.SearchExLove(name);
                    break;
                }
                case 5: {
                    ex_love_list.SortExLove();
                    break;
                }
                case 6: {
                    System.out.println("Good buy !!!!");
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
