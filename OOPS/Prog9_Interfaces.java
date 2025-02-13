package OOPS;
interface Camera{
    int focus = 4;      // by default this is final i.e., you cant change it
    void takePhoto();
    void takeVideo();
}

interface Gps{
    void navigate();
}

class Phone1{
    public void call(){
        System.out.println("calling");
    }

    public void message(){
        System.out.println("messaging");
    }
}

class Smartphone1 extends Phone1 implements Camera, Gps{
    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking video");
    }

    @Override
    public void navigate() {
        System.out.println("Open maps to navigate");
    }
}
public class Prog9_Interfaces  {
    public static void main(String[] args) {

    }
}
