package AssessmentQuestion;

import java.util.*;

public class NumberPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = 3553, reversedNum = 0, remainder;
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int res = Palindrom(num);
        // int reversedNum = 0, remainder;

        // // store the number to originalNum
        // int originalNum = num;

        // // get the reverse of originalNum
        // // store it in variable
        // while (num != 0) { // 121 //12 //1
        // remainder = num % 10; // 121%10=>1 12%10=>2 1%10=>1
        // reversedNum = reversedNum * 10 + remainder; // 1 1*10+2=>12 12*10+1=>121
        // num /= 10; // 12 12/10=1
        // }

        // // check if reversedNum and originalNum are equal
        // if (originalNum == reversedNum) {
        // System.out.println(originalNum + " is Palindrome.");
        // } else {
        // System.out.println(originalNum + " is not Palindrome.");
        // }
        sc.close();
    }

    static int Palindrom(int num) {
        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) { // 121 //12 //1
            remainder = num % 10; // 121%10=>1 12%10=>2 1%10=>1
            reversedNum = reversedNum * 10 + remainder; // 1 1*10+2=>12 12*10+1=>121
            num /= 10; // 12 12/10=1
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
        return num;

    }
}
