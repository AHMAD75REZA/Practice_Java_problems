import java.util.Scanner;

public class SwapAlternate {
    public static void Swap(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i += 2) {
            
            int j = i + 1;
            
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of index ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the  index value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        Swap(arr);
        s.close();
    }
}
