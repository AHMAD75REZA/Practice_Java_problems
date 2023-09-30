
// Take input from user and print the Array Elemnt
import java.util.*;

class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of index");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Printed arrays are:");
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] + " ");
        }
        sc.close();

    }
}