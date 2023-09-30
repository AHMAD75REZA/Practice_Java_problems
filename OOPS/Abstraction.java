package OOPS;

// we can achieve by using Interface and abstract class

// public class Abstraction {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5);
//         System.out.println("Circle Area: " + circle.calculateArea());

//         Shape rectangle = new Rectangle(4, 6);
//         System.out.println("Rectangle Area: " + rectangle.calculateArea());
//     }
// }

// // Abstract class representing a shape
// abstract class Shape {
//     abstract double calculateArea(); // Abstract method with no implementation
// }

// // Concrete subclass: Circle
// class Circle extends Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }

// Concrete subclass: Rectangle
// class Rectangle extends Shape {
//     private double width;
//     private double height;

//     public Rectangle(double width, double height) {
//         this.width = width;
//         this.height = height;
//     }

//     @Override
//     double calculateArea() {
//         return width * height;
//     }
// }

// Now Using Interface

// Interface representing a shape
interface Shape {
    double calculateArea(); // Method signature, no implementation
}

// Concrete class: Circle
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class: Rectangle
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
