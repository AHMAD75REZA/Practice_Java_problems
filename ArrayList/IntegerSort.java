package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSort {
    public static void main(String[] args) {
        ArrayList<Integer> MyNum = new ArrayList<>();
        MyNum.add(4);
        MyNum.add(13);
        MyNum.add(8);
        MyNum.add(20);
        MyNum.add(6);
        Collections.sort(MyNum);
        for (Integer i : MyNum) {
            System.out.println(i);

        }

    }
}
