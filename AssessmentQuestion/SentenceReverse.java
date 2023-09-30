package AssessmentQuestion;

import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter atleast one sentence");
        String sentence = sc.nextLine();
        String reverseSentence = reverse(sentence);
        System.out.println(reverseSentence + " ");

        sc.close();
    }

    public static String reverse(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}