package BasicdataTypes;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = i * n;
            System.out.println(result);
        }

        sc.close();
    }
}
