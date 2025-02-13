public class Prog4_Method_Overloading {
    static void printName(String name){
        System.out.println(name);
    }
    static void printName(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        printName("Omkar");
        printName(7654);
    }
}
