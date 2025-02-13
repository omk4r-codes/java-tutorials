package OOPS;

class Employee{
    int id;
    String name;

    public void show(){
        System.out.println("ID: " + id + ", name: " + name);
    }
}
public class Prog1_OOPS {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Omkar";
        emp1.show();
    }
}
