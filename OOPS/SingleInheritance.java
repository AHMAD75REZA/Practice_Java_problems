package OOPS;


class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("Child Method");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.parentMethod();
        child.childMethod();
    }
}
