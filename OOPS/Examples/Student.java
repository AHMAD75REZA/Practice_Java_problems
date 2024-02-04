package OOPS.Examples;

public class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this student is " + this.name);
        System.out.println("The age of this student is " + this.age);

    }

    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ahmad";
        s1.age = 25;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Saleha Nigar";
        s2.age = 19;
        s2.getInfo();
    }
}
