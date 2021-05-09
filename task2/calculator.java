package lab5;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integer value ");

        int[] arr = new int[5];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + (i + 1) + ", types value was " + arr[i]);
            sum += arr[i];
            avg = sum/5;
        }
        System.out.println("Average is " + avg);
    }
}
