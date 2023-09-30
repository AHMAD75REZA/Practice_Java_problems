package AssessmentQuestion;

import java.util.*;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        max(arr);
        sc.close();
    }

    public static void max(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Maximum element in the arrays is: " + arr[n - 1]);
        System.out.println("Manimum element in the arrays is: " + arr[0]);
    }
}
