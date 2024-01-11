package HashMap;

import java.util.HashMap;

public class SecondProgram {
    public static void main(String[] args) {
        HashMap<String, Integer> People = new HashMap<>();
        People.put("John", 32);
        People.put("Stev", 42);
        People.put("Angie", 52);

        System.out.println(People.size());
        System.out.println(People);

        for (String i : People.keySet()) {
            // System.out.println(i);
            System.out.println("key:" + i + " " + "values" + " " + People.get(i));

        }

    }

}
