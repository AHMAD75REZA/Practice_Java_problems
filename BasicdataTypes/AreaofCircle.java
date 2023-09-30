// import java.util.*;
package BasicdataTypes;

import java.util.Scanner;

public class AreaofCircle {
    public static double AreaC(double radius) {
        double Area = 3.14 * radius * radius;
        System.out.println("Area of cicle is :");
        return Area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of Radius:");
        double radius = s.nextDouble();

        double c = AreaC(radius);
        System.out.println(c);

        s.close();
    }

}
