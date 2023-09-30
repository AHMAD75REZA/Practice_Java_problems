import java.util.Scanner;

public class TripletSum {
    public static int SumPair(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }

            }
        }
        System.out.println("Total number of Tripletsum is:");
        return count;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of index:");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the values of each index:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the target value for sum:");
        int x = s.nextInt();

        int c = SumPair(arr, x);
        System.out.print(c);
        s.close();
    }
}
