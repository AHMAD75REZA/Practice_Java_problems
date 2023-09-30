package BasicdataTypes;

import java.util.Scanner;

public class ReverseNumber {
    public static int NumberReverse(int Num) {

        int reverse = 0;
        // int rem = 0;
        // for (; Num != 0; Num /= 10) { // 456
        // rem = Num % 10; // 456 %10 =>6 45%10=>5 4%10=>4 0%10=>0
        // reverse *= 10 + rem; // 0*10+6=>6 6*10+5=>65 65*10+4=>654 654*10
        // // Num = Num / 10; // 456/10 =>45 45/10=>4 4/10=>0

        // }
        // return reverse;
        while (Num != 0) {
            int rem = Num % 10;
            reverse = reverse * 10 + rem;
            Num = Num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Numbers:");
        int Num = sc.nextInt();
        int result = NumberReverse(Num);
        System.out.println("Reverse Number is:" + result + "");

        sc.close();
    }
}
