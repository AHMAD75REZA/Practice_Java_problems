// package String;

import java.util.Scanner;

public class CountString {
    public static int count(String str) {
        int sumString = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sumString++;
            }
        }
        return sumString;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int str1 = count(str);
        System.out.println(str1 + " ");

        sc.close();

    }
}

// Here user already given the string
// public class CountString {
// public static void main(String[] args) {
// String str = "First program in string";
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) != ' ') {
// count++;
// }
// }
// System.out.println("total number of characters are: " + " " + count);
// }
// }

// Taking input from user
// import java.util.*;

// public class CountString {
// public static void main(String[] args) {
// // String str = "First program in string";
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();
// int count = 0;
// for (int i = 0; i < str.length(); i++) {
// if (str.charAt(i) != ' ') {
// count++;
// }
// }
// System.out.println("total number of characters are: " + " " + count);
// sc.close();
// }
// }

// taking input from user and using function write the code

// import java.util.*;

// public class CountString {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String input = sc.nextLine();
// int numberofstring = count(input);

// System.out.println("Total number of characters: " + " " + numberofstring);

// sc.close();

// }

// public static int count(String input) {
// int count = 0;
// for (int i = 0; i < input.length(); i++) {
// if (input.charAt(i) != ' ') {
// count++;
// }
// }
// return count;

// }
// }