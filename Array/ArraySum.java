import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }

        sc.close();
        int result = SumofArray(arr, n);
        System.out.println("Sum of array elements are :"+ result);
        
    }
    public static int SumofArray(int arr[], int n){
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=arr[i];

        }
        return sum;
    }
}
