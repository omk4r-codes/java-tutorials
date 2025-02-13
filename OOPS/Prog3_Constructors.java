package OOPS;
class Student{
    int id;
    String name;
    int age;
    int marks;

    Student(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age =age;
        this.marks = marks;
    }

    public void printDetails(){
        System.out.printf("roll no. %d's name is %s and his age is %d", id, name, age);
    }
}
public class Prog3_Constructors {
    public static void main(String[] args) {
        Student st = new Student(1, "Omkar", 22, 99);
        st.printDetails();
    }
}
