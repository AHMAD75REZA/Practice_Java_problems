package OOPS;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child child =new Child();
        child.Grandparent();
        child.parent();
        child.Childmethod();
    }
}
class GrandParent{
    void Grandparent(){
        System.out.println("Grand parent method");
    }
}
class Parent extends GrandParent{
    void parent(){
        System.out.println("parent method");
    }
}
class Child extends Parent{
    void Childmethod(){
        System.out.println("Child method");
    }
}
