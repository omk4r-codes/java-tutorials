package OOPS;

class Base{
    int x;

    Base(){
        System.out.println("Hi from base class");
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Derived extends Base{
    int y;

    Derived(){
        System.out.println("Hi from derived!");
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class Prog5_inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();  // constructor gets called from base first then from derived
        d.setX(7);
        System.out.println(d.getX());
        System.out.println(d.getY());   // y default 0??
    }
}
