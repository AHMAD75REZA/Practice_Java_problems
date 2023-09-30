// package SortingArray;

public class Sort012 {
    public static void sort012(int[] arr) {
        int n = arr.length;

        int low = 0; // Pointer for 0s
        int high = n - 1; // Pointer for 2s
        int mid = 0; // Pointer for 1s

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 1, 0 };
        sort012(arr);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
