package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("phien dich vien sinh dep");
        list.add("tay du ki");
        list.add("than dieu dai hiep");

        int n = 0;
        while (n < 6)
        {
            System.out.println("Moi ban chon menu :");
            System.out.println("1. them phim");
            System.out.println("2. in ra phim");
            System.out.println("3. sua phim");
            System.out.println("4. xoa phim");
            System.out.println("5. tim phim yeu thich");
            System.out.println("6. ket thuc !!");
            String chosel = sc.nextLine();
            n++;

            switch (chosel) {
                case "1" : {
                    System.out.println("Moi ban chon phim");
                    String a = sc.nextLine();
                    list.add(a);
                    System.out.println(list);
                    break;
                }
                case "2" : {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list);
                    }
                    break;
                }
                case "3" : {
                    System.out.println("Moi ban chon vi tri can sua :");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.println("Moi ban chon phim can sua :");
                    String b = sc.nextLine();
                    list.set(a, b);
                    System.out.println(list);
                    break;
                }
                case "4" : {
                    System.out.println("Moi ban chon phim muon xoa :");
                    String a = sc.nextLine();
                    list.remove(a);
                    System.out.println(list);
                    break;
                }
                case "5" : {
                    System.out.println("Moi nhap phim yeu thich :");
                    String a = sc.nextLine();
                    System.out.println(list.indexOf(a));
                    break;
                }
                case "6" : {
                    System.out.println("good buy !@#$%");
                    break;
                }

            }
        }
    }
}