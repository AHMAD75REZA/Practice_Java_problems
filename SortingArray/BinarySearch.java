// package SortingArray;

// import java.lang.annotation.Target;
import java.util.*;

public class BinarySearch {
    public static int SearchBinary(int arr[], int target) {
        int leftmost = 0;
        int rightmost = arr.length - 1;

        while (leftmost <= rightmost) {
            int middle = (leftmost + rightmost) / 2;

            if (arr[middle] == target) {
                System.out.println("target value found in this index");
                return arr[middle];

            } else if (arr[middle] < target) {

                leftmost = middle - 1;

            } else {

                rightmost = middle + 1;
            }

        }
        System.out.println("target values not exist in this array");
        return -1;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of index");
        int n = s.nextInt();

        System.out.println("Enter the target value");
        int target = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the index values");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int c = SearchBinary(arr, target);
        System.out.println("target value " + c + "  at index " + arr[c]);
        s.close();
    }
}
