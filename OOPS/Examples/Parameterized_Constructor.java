package OOPS.Examples;

public class Parameterized_Constructor {
    String name;
    int age;

    Parameterized_Constructor(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // Method to display the values
    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        System.out.println("This is a Parameterized_Constructor");
        // Craeting objects and passing values
        Parameterized_Constructor s1 = new Parameterized_Constructor("Ahmad", 25);
        Parameterized_Constructor s2 = new Parameterized_Constructor("Ghulam Mustafa", 24);

        // Calling method to display the values of objects
        s1.display();
        s2.display();

    }
}
