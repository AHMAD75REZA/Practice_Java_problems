// package SortingArray;

import java.util.Scanner;

public class BubbleSort {
    public static void SortBubble(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of index:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the index values:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        SortBubble(arr);

        System.out.println("The sorted array is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}
