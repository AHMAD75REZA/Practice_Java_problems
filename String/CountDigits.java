//package String;

import java.util.Scanner;

public class CountDigits {
    public static int DigitCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any integer number");
        int n = s.nextInt();
        int c = DigitCount(n);
        System.out.println("total number of digits:");
        System.out.print(c);

        s.close();
    }
}
