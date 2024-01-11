package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class FirstProgram {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println("Sorted cars");
        Collections.sort(cars);
        for (String str : cars) {
            System.out.println(str);

        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        cars.set(1, "Thar");
        System.out.println(cars);

    }

}
