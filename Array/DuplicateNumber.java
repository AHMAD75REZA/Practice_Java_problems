import java.util.Scanner;

public class DuplicateNumber {
    public static int Duplicate(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    temp = arr[j];
                }
            }
        }
        return temp;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
        int c = Duplicate(arr);
        System.out.println(c);
        s.close();
    }
}
