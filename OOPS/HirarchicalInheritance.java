package OOPS;

public class HirarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.parentMethod();
        c1.child1Method();

        Child2 c2 = new Child2();
        // c2.parentMethod();
        c2.child2method();

        Child3 c3 = new Child3();
        // c3.parentMethod();
        c3.chil3method();

    }
}

class Parent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child1 extends Parent {
    void child1Method() {
        System.out.println("Child 1 method");
    }
}

class Child2 extends Parent {
    void child2method() {
        System.out.println("child 2 method");
    }
}

class Child3 extends Parent {
    void chil3method() {
        System.out.println("child 3 method");
    }
}