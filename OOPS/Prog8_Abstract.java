package OOPS;

abstract class World{
    World(){
        System.out.println("Hellu from Earth 666");
    }
    abstract public void greet();
}

class India{
    public void greet(){
        System.out.println("Namaste");
    }
}

class France{
    public void greet(){
        System.out.println("Bonjour you freakin guys");
    }
}
public class Prog8_Abstract {
    public static void main(String[] args) {
//        World us = new World();     // can't make object of abstract class directly
        World us = new World() {
            @Override
            public void greet() {
                System.out.println("Have to write the abstract functions first to create object of abstract class");
            }
        };
        us.greet();
        France french = new France();
        french.greet();

        World kepler = new World() {
            @Override
            public void greet() {
                System.out.println("Hi from kepler system");
            }
        };
        kepler.greet();
    }
}
