

// public class SortZeroOne {
//     public static void zero(int arr[]) {
//         // int temp=arr[0];
//         int i = 0;
//         int j = arr.length - 1;

//         while (i < j) {
//             int currentLeftElemnt = arr[i];
//             int currentRightElemnt = arr[j];
//             if (currentLeftElemnt == 0) {
//                 i++;
//             }
//             if (currentRightElemnt == 1) {
//                 j--;
//             }
//             if (currentLeftElemnt == currentRightElemnt) {
//                 arr[i] = currentRightElemnt;
//                 arr[j] = currentLeftElemnt;
//                 i++;
//                 j--;

//             }

//         }

//     }

//     public static void main(String[] args) {
        

//         int arr[] = {1,0,0,1,0,1};
//         zero(arr);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//     }
// }


// Using two pointer method

public class SortZeroOne {
    public static void sortBinaryArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0};
        sortBinaryArray(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}    
