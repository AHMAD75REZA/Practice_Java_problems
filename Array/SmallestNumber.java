import java.util.*;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int result = LeastNumber(arr);
        // System.out.println("Least number in the array is :" + result);
        LeastNumber(arr);
        sc.close();
    }

    public static void LeastNumber(int arr[]) {
        int n = arr.length;
        // Arrays.sort(arr);
        // return arr[0];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Least number in the array is:" + arr[0]);
        System.out.println("Largest number in the array is:" + arr[n - 1]);
        System.out.println("Second largest  number in the array is:" + arr[n - 2]);
    }
}
