// package SortingArray;

import java.util.Scanner;

public class RotateArray {
    public static void Roate(int arr[], int D) {
        int n = arr.length;
        int k = 0;
        int temp[] = new int[n];
        for (int i = D; i < n; i++) {
            temp[k] = arr[i];
            k++;

        }
        for (int i = 0; i < D; i++) {
            temp[k] = arr[i];
            k++;
        }
        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
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
        System.out.println("Enter the element for rotate");
        int D = s.nextInt();
        Roate(arr, D);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
