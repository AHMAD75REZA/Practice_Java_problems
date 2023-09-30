package OOPS;

public class MultipleInheritance {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.methodFromInterface1();
        myClass.methodFromInterface2();
    }
}
interface Interface1{
    void methodFromInterface1();
}
interface Interface2{
    void methodFromInterface2();
}
class MyClass implements Interface1, Interface2{
    public void methodFromInterface1(){
        System.out.println("Method from Interface1");
    }
    public void methodFromInterface2(){
        System.out.println("Method from Interface2");
    }
}