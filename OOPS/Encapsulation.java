package OOPS;

// public class Encapsulation {

public class Encapsulation {
    private String name;
    private int age;

    // constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setage(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age can not be negative.");
        }

    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("Ahmad", 25);
        person.displayInfo();

        // changing age using setter
        // person.setage(24);
        // person.displayInfo();
    }

}
