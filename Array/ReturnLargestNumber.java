import java.util.Scanner;

public class ReturnLargestNumber {
    public static int LargestNumber(int arr[]) {
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("The largest number is: ");
        return large;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the index value : ");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values in a Arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int c = LargestNumber(arr);
        System.out.print(c);
        s.close();
    }

}
