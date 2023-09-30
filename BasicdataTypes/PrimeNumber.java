package BasicdataTypes;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any random number");
        int n = sc.nextInt();
        String res = PrintPrime(n);
        // for(int i=0; i<n; i++){
        System.out.println(" Required prime number is: " + res);

        // }

        sc.close();
    }

    public static String PrintPrime(int n) {
        String primeNum = "";

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNum += i + " "; // Append the prime number to the string
            }

        }
        return primeNum;

    }
}
