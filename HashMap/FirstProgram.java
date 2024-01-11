package HashMap;

import java.util.HashMap;

public class FirstProgram {
    public static void main(String[] args) {
        HashMap<String, String> capitalCiti = new HashMap<>();
        // For adding item they use put method
        // Add keys and values(Country, City)
        capitalCiti.put("England", "Landon");
        capitalCiti.put("Germany", "Berlin");
        capitalCiti.put("Norway", "Oslo");
        capitalCiti.put("USA", "Washington DC");
        capitalCiti.put("India", "Hyderabad");

        System.out.println(capitalCiti);

        System.out.println(capitalCiti.get("England"));

        capitalCiti.remove("USA"); // Only for removing one item
        System.out.println(capitalCiti);
        // To remove all items, use the clear() method:
        // capitalCiti.clear();
        // System.out.println(capitalCiti);

        // Loop through the items of a HashMap with a for-each loop.
        for (String i : capitalCiti.keySet()) {
            System.out.println(i);

        }
        System.out.println("Values print krega");
        for (String i : capitalCiti.values()) {
            System.out.println(i);

        }
        System.out.println("Ab donu keys and Values print krega");
        for (String i : capitalCiti.keySet()) {
            System.out.println("key:" + i + " " + "Values" + " " + capitalCiti.get(i));

        }

    }
}
