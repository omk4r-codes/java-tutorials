package Collections;

import java.util.LinkedList;

public class P3_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(1, 999);
        linkedList.addFirst(0);
        linkedList.addLast(87654);


        System.out.println(linkedList);

        // get element:
        System.out.println(linkedList.get(1));

        linkedList.remove(1);   // ele at index 1 deleted
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.add(999);
        linkedList.add(999);
        linkedList.add(999);
        linkedList.add(999);
        linkedList.remove(Integer.valueOf(999));    // ele 999 deleted
        System.out.println(linkedList);

        linkedList.removeLastOccurrence(Integer.valueOf(999));
        System.out.println(linkedList);

        linkedList.removeIf(x -> x % 3 == 0);
        System.out.println(linkedList);
    }
}
