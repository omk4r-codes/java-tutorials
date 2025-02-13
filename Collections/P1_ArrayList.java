package Collections;

import java.util.ArrayList;
import java.util.List;

public class P1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(9);
        // 9 is the initial capacity
//
        ArrayList<Integer> al1 = new ArrayList<>(9);
        // can omit the later Integer allocating

        // since List is the parent class, can also be done like:
        List<Integer> l1 = new ArrayList<>();
//
        al.add(35);
        al.add(78);
        al.add(34);
        al.add(12);

        al.add(1, 555);     // add 555 at index 1

        System.out.println("ele at index 1 : " + al.get(1));  // to access elements
        for (int i : al) {
            System.out.print(i + ", ");
        }
        System.out.println();

        al.remove(1);
        System.out.println("ele at index 1 after removing 555 : " + al.get(1));  // to access elements

        System.out.println(al.size());

        // search:
        System.out.println(al.contains(35));
        System.out.println(al.contains(36));

        al.set(1, 999);
        // replace ele at ind 1 by 999

        System.out.println(al);
        // not even need to run the loop lmao

        System.out.println(al.isEmpty());

        al.clear();
        System.out.println(al.isEmpty());
    }
}
