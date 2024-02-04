// A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

package HashSet;

import java.util.HashSet;

public class FirstProgram {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        // Add Items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("OOODD"));

        // To remove an item, use the remove() method:
        cars.remove("Volvo");
        System.out.println(cars);

        // To remove all items, use the clear() method:
        // cars.clear();
        // System.out.println(cars);

        // To find out how many items there are, use the size method:

        System.out.println(cars.size());

        for (String i : cars) {
            System.out.println(i);

        }

    }
}
