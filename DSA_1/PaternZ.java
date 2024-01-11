// // package DSA_1;

// public class PaternZ {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=0; i<n; i++){
//             for(int j=i; j<n-i; j++){
//                 System.out.print("*");
//                 // j--;
//             }
//             for(int k=i; k<n-i; k++){
//                 System.out.print(" ");
//             }
//         }
//         System.out.println("stop");
//     }
// }

public class PaternZ {
    public static void main(String[] args) {
        int n = 5; // You can change the value of n to adjust the size of the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - i - 1) {
                    System.out.print("*" );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
