import java.util.Scanner;

public class FindUniqueNumber {
    public static int Unique(int arr[]) {
        int UniqueNumber = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] != UniqueNumber) {
                    UniqueNumber = arr[j];
                }
            }
        }
        System.out.println("Unique number is: ");
        return UniqueNumber;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Index: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value of  each Index: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int c = Unique(arr);
        System.out.print(c);
        s.close();
    }
}
