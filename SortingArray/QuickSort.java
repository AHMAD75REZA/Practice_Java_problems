// // write a program to Quick sort which in the form of array 19,18,11,12,10,30
// import java.util.*;
// public class QuickSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         SortQuick(arr, 0, n-1);

//         System.out.println("Quick sorted arrays are :" + Arrays.toString(arr));

//         sc.close();
//     }
//     public static int SortQuick(int arr[], int low, int high){
//         int pivot = arr[high];

//         int i = (low-1); // index of smaller element
//         for (int j=low; j<high; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i+1];
//         arr[i+1] = arr[high];
//         arr[high] = temp;

//         return i+1;
//     }
// }

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        quickSort(arr, 0, n-1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
