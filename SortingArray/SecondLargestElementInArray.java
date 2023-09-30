// package SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {

    public static void SecondLargest(int arr[]) {
        int n = arr.length;
        // int temp[] = new int[n];
        //  for (int i = 0; i < n; i++) {
        //     if (i < 2) {
        //         System.out.println("Second largest will not exist");

        //     }

        // }
        // System.out.println("Sorted Array");
        Arrays.sort(arr);

       
        int SecondLargest = arr[n - 2];
        int largest = arr[n - 1];
        if (largest == SecondLargest) {
            System.out.println("Second largest element is not found ");

        } else {
            System.out.println("Second largest element is:   " + arr[n - 2]);
        }

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
        SecondLargest(arr);

        s.close();
    }
}
