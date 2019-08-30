import java.util.Scanner;

public class q6second {
    public static int getSecondLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(total);
        return a[total - 2];
    }

    public static void main(String args[]) {
        int a[];
        System.out.println("Enter how many numbers need to add:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("Enter the numbers:");
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Second Largest: " + getSecondLargest(a[], n));

    }
}