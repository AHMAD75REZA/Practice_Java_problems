
package BasicdataTypes;
import java.util.Scanner;
public class ReturnSum {
    public static int Sumdata(int a, int b){
        // int sum =0;
      int   sum = a+b;
      System.out.println("Sum of two numbers are:");
        return sum;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = Sumdata(a, b);
        System.out.print(c);
        s.close();
    }
    
}
