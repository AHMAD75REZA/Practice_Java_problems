package OOPS.Examples;

public class Non_Parameterized_Constructor {
    String name;
    int age;

    Non_Parameterized_Constructor() {
        System.out.println("Constructor called");
    }

    void display() {
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {
        Non_Parameterized_Constructor name = new Non_Parameterized_Constructor();
        // System.out.println("I don't want to print this sentence It is a
        // Non_Parameterized_Constructor");
        System.out.println("This is default constructor:" + name);

        // Creating objects
        Non_Parameterized_Constructor s1 = new Non_Parameterized_Constructor();
        Non_Parameterized_Constructor s2 = new Non_Parameterized_Constructor();

        // Displaying Values of the object

        s1.display();
        s2.display();

    }
}
