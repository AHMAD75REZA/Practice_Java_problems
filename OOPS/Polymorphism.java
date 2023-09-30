package OOPS;

//Compile time polymorphism(Static polymorphism): Achieve through method overloading

// public class Polymorphism {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(5, 10));
//         System.out.println(calc.add(3.5, 10.2));
//     }
// }

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

//Run-time polymorphism (Dynamic polymorphism): Achieve through method overriding
class Shape {
    void draw() {
        System.out.println("Draw a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw(); // Calls the override method in circle class

        s2.draw(); // Calls the overridden method in Square class
    }
}