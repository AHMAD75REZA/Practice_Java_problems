// import java.util.Scanner;

// public class DuplicateNumber {
//     public static void Duplicate(int arr[]) {
//         int temp = 0;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = i + 1; j < arr.length - 1; j++) {
//                 if (arr[i] == arr[j]) {
//                    System.out.println(arr[i]+" ");
//                     break;
//                 }
//                
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = s.nextInt();

//         }
//         Duplicate(arr);
//         // System.out.println(c);
//         s.close();
//     }
// }

// import java.util.Scanner;

// public class DuplicateNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements in the array: ");
//         int n = scanner.nextInt();

//         int[] array = new int[n];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             array[i] = scanner.nextInt();
//         }

//         findDuplicates(array);

//         scanner.close();
//     }

//     static void findDuplicates(int[] array) {
//         System.out.print("Duplicate elements: ");
//         for (int i = 0; i < array.length - 1; i++) {
//             for (int j = i + 1; j < array.length; j++) {
//                 if (array[i] == array[j]) {
//                     System.out.print(array[i] + " ");
//                     break; // If a duplicate is found, no need to check further for this element
//                 }
//             }
//         }
//     }
// }

import java.util.*;
// import java.util.HashSet;
// import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of index:");

        int n = sc.nextInt();
        System.out.println("Enter the value of the index");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicates(arr);

        sc.close();

    }

    public static void findDuplicates(int arr[]) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> duplicateSet = new HashSet<>();

        // System.out.println("Duplicate elements:");
        // for (int value : arr) {
        // if (!set.add(value)) {
        // duplicateSet.add(value);
        // }

        // }
        // duplicateSet.forEach(element -> System.out.print(element + " "));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element " + arr[j]);
                }
            }
        }
        System.out.println(" ");
    }
}