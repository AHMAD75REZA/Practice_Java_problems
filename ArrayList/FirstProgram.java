package ArrayList;

import java.util.ArrayList;

public class FirstProgram {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i : cars) {
            System.out.println(i);
        }
        System.out.println("After changing");
        cars.set(0, "opel");
        cars.remove(1);
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

    }
}
