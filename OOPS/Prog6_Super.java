package OOPS;

class Parent {
    Parent(){
        System.out.println("Parent cons. with no argument");
    }
    Parent(String name){
        System.out.println("Parent with name: "+ name);
    }
}
class Child extends Parent{
    Child(int a){
        System.out.println("Child constructor. Calling this will invoke non-parameterized cons. of Parent. int a: " + a);
    }

    Child(){
        super("Omkar");
        System.out.println("Child cons. with super to invoke the parameterized cons. from Parent");
    }
}
public class Prog6_Super {
    public static void main(String[] args) {
//        Child c1 = new Child(1);
        Child c2 = new Child();
    }
}
