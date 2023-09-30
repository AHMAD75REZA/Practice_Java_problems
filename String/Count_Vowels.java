import java.util.*;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        sc.close();

        int total_vowels = Vowels(inputString);

        System.out.println("Vowels in the string: " + total_vowels);
        // Vowels(inputString);
    }

    // public static void Vowels(String inpString) {
    public static int Vowels(String inpString) {
        int count = 0;
        inpString = inpString.toLowerCase(); // Convert the string to lowercase to handle both uppercase and lowercase // vowels
        for (int i = 0; i < inpString.length(); i++) {
            char ch = inpString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(" vowels: " + " " + ch);
                count++;
            }
            // else {
            // System.out.print("You have not enter vowls:");
            // }
        }
        return count;

    }
}
