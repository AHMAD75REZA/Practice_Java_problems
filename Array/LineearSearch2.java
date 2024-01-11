import java.util.*;

public class LineearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int x = sc.nextInt();
        sc.close();
        int result = SearchIndex(arr, n, x);
        System.out.println("Element is found in this index: " + result);
    }

    public static int SearchIndex(int arr[], int n, int x) {
        // int temp = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                // temp = i;

                return i;
            }

        }
        System.out.println("element not exist in the array");
        return -1;
    }

}
