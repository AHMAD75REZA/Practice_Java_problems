import java.util.*;
public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();

        // }
        sc.close();

        int result = Arrange(arr, n);
        System.out.println("Arrange numbers are: "+ result);

    }
    public static int Arrange(int arr[], int n){
        int temp=0;
        for(int i=0; i<n; i++){
            if(n/2 != 0){
                    temp = arr[i];
                    arr[i] = arr[n-1];
                    arr[n-1] = temp;
                    return temp;
            }else if(arr[i]/2 !=0){
                temp = arr[i];
                return temp;
            }

        }
        return -1;

    }
}
