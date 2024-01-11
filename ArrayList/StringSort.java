package ArrayList;

import java.util.ArrayList;
import java.util.Collections; //Import the Collections class

public class StringSort {
    public static void main(String[] args) {
        ArrayList<String> SecLast = new ArrayList<>();
        SecLast.add("Volvo");
        SecLast.add("BMW");
        SecLast.add("Ford");
        SecLast.add("OOOD");
        SecLast.add("Mazda");

        Collections.sort(SecLast); // Sort cars
        for (String i : SecLast) {
            System.out.println(i);
        }
    }
}
