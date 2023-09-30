import java.util.Scanner;

public class Intersection {
    public static void section(int arr1[], int arr2[]) {
        int N = arr1.length;
        int M = arr2.length;
        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 1; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of index for arr1");
        int N = s.nextInt();
        int arr1[] = new int[N];

        System.out.println("Enter the index  value for arr1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter number of index for arr2");
        int M = s.nextInt();
        int arr2[] = new int[M];

        System.out.println("Enter the index value  for arr2");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = s.nextInt();
        }
        section(arr1, arr2);
        // System.out.println(c);

        s.close();
    }
}
