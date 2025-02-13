package OOPS;
class Employee1{
    private int id;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setId(int id){
        this.id = id;
    }
}
public class Prog2_getters_setters {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setId(1);
        e1.setSalary(10928);
        System.out.printf("id: %d\n", e1.getId());
        System.out.printf("salary: %d\n", e1.getSalary());
    }
}
