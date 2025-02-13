import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();

        System.out.println("The sum of " + n1 + " and " + n2 + " is : " + (n1 + n2));

        sc.close();
    }
}
