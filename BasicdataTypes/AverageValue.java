package BasicdataTypes;

import java.util.Scanner;

public class AverageValue {
    public static double Average(int a, int b, int c) {
        double AverageNo = (a + b + c) / 3;
        System.out.println("Average values are: ");
        return AverageNo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a, b, c: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double d = Average(a, b, c);
        System.out.println(d);
        s.close();
    }

}
