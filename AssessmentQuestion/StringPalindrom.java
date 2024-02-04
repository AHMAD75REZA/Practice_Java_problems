//Write a program to check if a given string is a palindrom
package AssessmentQuestion;

import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String word");
        String str = sc.nextLine();

        String send = palindrom(str);

        // prinpalindrom(send);

         System.out.println(send + "required palindrom ");

        // String revString ="";

        // for(int i=str.length()-1; i>=0; --i){
        // revString = revString + str.charAt(i);
        // }
        // if(str.toLowerCase().equals(revString.toLowerCase())){
        // System.out.println(str + " is a palindrom String");
        // }else{
        // System.out.println(str + " is not a palindrom String");
        // }
        sc.close();
    }

    public static String palindrom(String str) {

        String revString = "";

        for (int i = str.length() - 1; i >= 0; --i) {
            revString = revString + str.charAt(i);
        }
        if (str.toLowerCase().equals(revString.toLowerCase())) {
            System.out.println(str + " is a palindrom String");
        } else {
            System.out.println(str + " is not a palindrom String");
        }

        return str;
    }

}
