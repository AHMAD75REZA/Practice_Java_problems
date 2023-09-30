import java.util.Scanner;

public class ReturnSum {
    public static int ArrayR(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int c = ArrayR(arr);
        System.out.print(c);
        // for(int i=0; i<arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }

        s.close();

    }

}
