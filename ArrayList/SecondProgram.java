package ArrayList;

import java.util.ArrayList;

public class SecondProgram {
    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(10);
        Num.add(20);
        Num.add(30);
        for (int i = 0; i < Num.size(); i++) {
            System.out.println(Num.get(i));
        }
    }
}
