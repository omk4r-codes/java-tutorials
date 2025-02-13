package Collections;

import java.util.LinkedList;

public class P6_Stack_Using_LL {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        // push:
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        stack.addLast(5);
        stack.addLast(6);

        // peek:
        System.out.println(stack.getLast());

        // pop:
        System.out.println(stack.removeLast());

        System.out.println(stack);
    }
}
