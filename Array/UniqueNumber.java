import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = FindUniqueNumber(arr);
        System.out.println("The unique number is :" + res);

        sc.close();
    }
    public static int FindUniqueNumber(int arr[]){
        // Using XOR I want to find unique number
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }
        return xor;

        // Now I want to print the value using HashMAP
        
        // Map<Integer, Integer> frequenceyMap = new HashMap<>();

        // // count the frequence=y of each number in the array
        // for(int num : arr){
        //     frequenceyMap.put(num, frequenceyMap.getOrDefault(num, 0)+1);
        // }
        // // Find the number with frequency 1 (unique number)
        // for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        //     if (entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // // Return -1 if no unique number is found(optional)
        // return -1;
    }
}
