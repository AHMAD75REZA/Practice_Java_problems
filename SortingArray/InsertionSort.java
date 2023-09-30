// package SortingArray;

import java.util.Scanner;

public class InsertionSort {
    public static void SortInsertion(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            // position will be j+1
            arr[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Index: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the required Index values : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        SortInsertion(arr);

        System.out.println("Finally Insert sortin Arrays are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}
