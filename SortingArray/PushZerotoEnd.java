// package SortingArray;

import java.util.Scanner;

public class PushZerotoEnd {
    public static void ZeroAtEnd(int[] arr) {
        int n = arr.length;

        // Traverse the array and move non-zero elements to the front
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];

            }
        }
        // Remaining part will be filled with zero
        while (count < n) {
            arr[count++] = 0;

        }

    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the number of Index");
        int n = p.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Index value in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = p.nextInt();
        }
        ZeroAtEnd(arr);
        System.out.println("Sorted Array after pushing zero at the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        p.close();

    }
}
