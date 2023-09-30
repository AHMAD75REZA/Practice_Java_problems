// package SortingArray;

import java.util.*;

// import javax.xml.validation.Schema;

public class SelectionSort {
    public static void SortSelection(int arr[]) {
        int n =arr.length;
        int minIndex =0;
        for (int i = 0; i < n-1; i++) {
             minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of index :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the index  value:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        SortSelection(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
