// package PRACTICEJAVA.SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void SortMerge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int arr12[] = new int[m + n];
        for (int i = 0; i < n; i++) {
            arr12[i] = arr1[i];
        }

        for (int j = 0; j < m; j++) {
            arr12[j + n] = arr2[j];
        }

        
        Arrays.sort(arr12);
        System.out.println("Sorted MergeSort:");
        for (int i = 0; i < m + n; i++) {
            System.out.print(arr12[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of index in first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the value of index in first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the number of index in second array: ");

        int m = sc.nextInt();

        int arr2[] = new int[m];

        System.out.println("Enter the value of index in second array: ");
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        SortMerge(arr1, arr2);

        sc.close();
    }
}
