// package SortingArray;

import java.util.Scanner;

public class CheckArrayRotation {
    public static int Rotation(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of index");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the index values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int c = Rotation(arr);
        System.out.print(c + " ");
        s.close();
    }

}
