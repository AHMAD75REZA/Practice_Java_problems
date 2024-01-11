// import java.util.*;

// public class Numberof_Words {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Write any sentences :");
//         String str = sc.nextLine();
//         int str2 = Count_words(str);

//         System.out.println("Total number of words in a sentence are :" + str2);

//         sc.close();
//     }

//     public static int Count_words(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == ' ' && Character.isLetter(str.charAt(i + 1)) && (i > 0)) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }

import java.util.Scanner;

public class Numberof_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);

        scanner.close();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}

