import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        System.out.println("Enter any characters from string to be count :");
        char charToCount = sc.next().charAt(0);

        // System.out.println("Total number of characters are :");
        int result = CountOccurences(str, charToCount);
        System.out.println("Number of occurrences of '" + charToCount + "' in the string: " + result);

        sc.close();

    }

    public static int CountOccurences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;

    }
}
