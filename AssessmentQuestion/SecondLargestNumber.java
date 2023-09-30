package AssessmentQuestion;

import java.util.*;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest element in the array is :  " + arr[n - 2]);

        sc.close();

    }
    
}
