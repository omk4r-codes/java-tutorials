package OOPS;
class Phone{    // Baap class
    Phone(){
        System.out.println("Hi, phone here");
    }

    public void touch(){
        System.out.println("No touch only click");
    }
}
class Smartphone extends Phone{         // Beta class
    Smartphone(){
        System.out.println("Hi, smartphone here!");
    }

    @Override
    public void touch(){
        System.out.println("Touch me");
    }

    public void play(){
        System.out.println("Playing games now");
    }
}
public class Prog7_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone obj = new Smartphone();
        // Smartphone smobj = new Phone();      // produces errors
        // baap bete ke barabar ho sakta hai, beta kabhi baap ke barabar nhi ho sakta
        // helpful in runtime polymorphism
        obj.touch();
        // obj.play();      // produces error

        // other methods which are not common in both the classes -
        // parent class methods will be accessible but NOT the child class methods!
    }
}
