import java.util.Scanner;

public class Prog3_Methods {
    static int maxx(int n1, int n2){
        return Math.max(n1, n2);
    }

    int minn(int n1, int n2){
        return Math.min(n1, n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        n2 = sc.nextInt();

        System.out.println("Biggest: " + maxx(n1,n2));

        // to call the non-static object:
        Prog3_Methods obj = new Prog3_Methods();
        System.out.println("Smallest " + obj.minn(n1,n2));
    }
}
