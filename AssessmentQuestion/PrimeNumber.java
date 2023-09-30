package AssessmentQuestion;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (PrimeNumberCheck(N)) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
        sc.close();

    }

    public static Boolean PrimeNumberCheck(int N) {
        if (N <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }

}
