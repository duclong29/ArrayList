package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactList contactList = new ContactList();


        int n = 0;
        while (n < 7) {
            System.out.println("Moi ban chon menu :");
            System.out.println("1. Insert contact");
            System.out.println("2. Add contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Search contact");
            System.out.println("5. Update contact");
            System.out.println("6. Sort contact");
            System.out.println("7. and game !!!");
            n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1 : {
                    Contact contact = new Contact("long", "0343619450");
                    System.out.println(contact);
                    contactList.InsertPhone();
                    break;
                }
                case 2 : {
                    System.out.println("Moi ban nhap ten : ");
                    String name = sc.nextLine();
                    System.out.println("Moi ban nhap sdt : ");
                    String phone = sc.nextLine();
                    Contact contact = new Contact (name, phone);
                    contactList.ContactListAdd(contact);
                    System.out.println(contact);
                    break;
                }
                case 3 : {
                    System.out.println("Moi ban nhap ten can xoa : ");
                    String name = sc.nextLine();
                    contactList.DeleteContactListAdd(name);
                    System.out.println("da xoa!!");
                    break;
                }
                case 4 : {
                    System.out.println("Moi ban nhap ten can tim :");
                    String name = sc.nextLine();
                    contactList.SearchContact(name);
                    System.out.println(name);
                    break;
                }
                case 5 : {
                    System.out.println("nhap ten thay doi : ");
                    String name = sc.nextLine();
                    System.out.println("nhap sdt thay doi : ");
                    String phone = sc.nextLine();

                }
                case 6 : {
                    contactList.SortContact();
                    break;
                }
                case 7 : {
                    System.out.println("good buy !@#$");
                    break;
                }
                default:{
                    break;
                }
            }
        }
    }
}
