package AssessmentQuestion;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values of the arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        int res = Binary(arr, target);
        System.out.println("Target values are found: " + arr[res] + " " + "at index  " + res);
        // System.out.println(res);
        if (res == -1) {
            System.out.println("Element is not present:");
        }

        sc.close();

    }

    public static int Binary(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + (high - 1)) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }
}
