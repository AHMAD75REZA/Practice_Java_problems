package AssessmentQuestion;

import java.util.*;

public class WordReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter atleast one sentence");
        String input = sc.nextLine();
        String wordReverse = reverse(input);
        System.out.println(wordReverse + " ");

        sc.close();

    }

    public static String reverse(String input) {
        String[] words = input.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();

    }
}
