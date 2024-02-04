package HashSet;

import java.util.HashSet;

public class SecondProgram {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);

        for(int i=0; i<=10; i++){
            if(numbers.contains(i)){
                System.out.println(i+ "was found in the set.");

            }else{
                System.out.println(i + "was not found in the set.");
                
            }
        }
        
        
    }
}
