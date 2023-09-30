// package SortingArray;

import java.util.Scanner;

public class MergeTwoSortedArraySecond {

    // public static void printArray(int[] arr){
    // int n = arr.length;
    // for(int i=0; i<n; i++){
    // System.out.println(arr[i]);
    // }
    // }
    public static int[] SortMergeMe2(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int arr3[] = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;

            } else {

                arr3[k] = arr2[j];
                j++;
                k++;

            }

        }
        while (i < n) {        //instead of while we can use if
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {         //instaed of while we can use if
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;

    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter the number of index for arr1");
        int n = p.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the value of index for arr1");
        for (int i = 0; i < n; i++) {
            arr1[i] = p.nextInt();
        }
        System.out.println("Enter the number of index for arr2");
        int m = p.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the value of index for arr2");
        for (int j = 0; j < m; j++) {
            arr2[j] = p.nextInt();
        }

        // int[] arr1 = {1,3,5,7};
        // int[] arr2 = {2,4,6};

        int arr3[] = SortMergeMe2(arr1, arr2);
        // printArray(arr3);

        System.out.println(" Two Sorted Array Mergesort");
        for (int k = 0; k < (arr1.length + arr2.length); k++) {
            System.out.print(arr3[k] + " ");
        }
        p.close();

    }
}
