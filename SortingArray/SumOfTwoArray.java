// package SortingArray;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void ArraySum(int arr1[], int arr2[], int result[]) {
        int N = arr1.length;
        int M = arr2.length;
        int carry = 0;

        int maximumLength = Math.max(N, M) + 1;
        while (N >= 0 && M >= 0) {
            int sum = arr1[N] + arr2[M] + carry;
            result[maximumLength] = sum % 10;
            carry = sum / 10;
            M--;
            N--;
            maximumLength--;

        }
        while (N >= 0) {
            int sum = arr1[N] + carry;
            result[maximumLength] = sum % 10;
            carry = sum / 10;
            N--;
            maximumLength--;
        }
        while (M >= 0) {
            int sum = arr2[M] + carry;
            result[maximumLength] = sum % 10;
            carry = sum / 10;
            M--;
            maximumLength--;
        }
        result[0] = carry;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of index for first Array:");
        int N = s.nextInt();
        int arr1[] = new int[N];
        System.out.println("Enter the index values  for first Array:");
        for (int i = 0; i < N; i++) {
            arr1[i] = s.nextInt();

        }
        System.out.println("Enter number of index for second Array:");
        int M = s.nextInt();
        int arr2[] = new int[M];
        System.out.println("Enter the index values  for second Array:");
        for (int i = 0; i < M; i++) {
            arr2[i] = s.nextInt();
        }
        int maximumLength = Math.max(N, M) + 1;
        int result[] = new int[maximumLength];

        ArraySum(arr1, arr2, result);

        System.out.println("Sum of two Arrays are:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        s.close();

    }
}
