import java.util.Scanner;

public class ArrangeNumbers {
    public static void Arrange(int arr[], int n) {
        int temp = 0;
        int temp1 = 1;
        if (n != 0) {
            if (n % 2 == 0) {
                temp = n;
            } else {
                temp = n - 1;
            }
            for (int i = 0; i <= (n - 1) / 2; i++) {
                arr[i] = temp1;
                temp1 += 2;
            }
            for (int i = (((n - 1) / 2) + 1); i < n; i++) {
                arr[i] = temp;
                temp -= 2;

            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // return arr[i];

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any index value: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        // System.out.println("Enter the element in the array: ");
        // for (int i = 0; i < n; i++) {
        // arr[i] = s.nextInt();
        // }

        ArrangeNumbers.Arrange(arr, n);

        // int c = Arrange(arr,n);
        // System.out.println(c);
        s.close();
    }

}

// int s=0; /// startting point
// int r =n-1; // last index
// int count=1;
// while(s<=r)
// {
// if(count%2==1)
// {
// arr[s]=count;
// count++;
// s++;
// }
// else
// {
// arr[r]=count;
// count++;
// r--;
// }
// }
