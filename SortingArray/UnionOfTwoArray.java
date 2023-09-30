import java.util.*;

public class UnionOfTwoArray {
    public static int UnionArray(int arr1[], int n, int arr2[], int m) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < n; i++) {
            res.add(arr1[i]);
        }

        for (int i = 0; i < m; i++) {
            res.add(arr2[i]);
        }

        int Set = res.size();
        return Set;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for first array");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter the value of each index");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size for second array");
        int m = sc.nextInt();

        int arr2[] = new int[m];
        System.out.println("Enter the value of each index");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int result = UnionArray(arr1, n, arr2, m);
        
        System.out.println(result + " ");

        sc.close();
    }
}
