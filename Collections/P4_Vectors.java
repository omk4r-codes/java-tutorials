package Collections;

import java.util.Vector;

public class P4_Vectors {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        System.out.println(v1.capacity());
        // default capacity 10

        Vector<Integer> v2 = new Vector<>(10, 3);
        // capacity = capacity + 3 whenever needed
    }
}
