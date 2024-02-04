package OOPS.Examples;

public class PenColor {
    String color;

    public void printColor() {
        System.out.println("The color of this pen is " + this.color);
    }

    public static void main(String[] args) {

        PenColor p1 = new PenColor();
        p1.color = "blue";

        PenColor p2 = new PenColor();
        p2.color = "black";

        PenColor p3 = new PenColor();
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
