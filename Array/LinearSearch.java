import java.util.Scanner;

public class LinearSearch {
    public static int Linear(int arr[], int x) {
        // int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                // temp = arr[i];
                return i;
            }

        }
        return -1;
        // return temp;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any index value");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        System.out.println("Enter the value of x for search");
        int x = s.nextInt();
        int c = Linear(arr, x);
        System.out.print(c);
        s.close();
    }

}
