package lab5;
import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many day's temperature : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        double avg = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + "'s high temp: " + arr[i]);
            sum += arr[i];
            avg = sum/n;
            count = 0;
            for (int j = 0;j < n; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
        }
        System.out.println("Average = " + avg);

        System.out.println(count + " days about average");

    }
}
