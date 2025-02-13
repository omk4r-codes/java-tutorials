package Collections;

import java.util.Stack;

public class P5_Stack_Using_Vector {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.pop());   // returns deleted element


        System.out.println(st.peek());
        System.out.println(st.isEmpty());

        System.out.println(st.size());

        System.out.println(st.search(2));
        // 1 based indexing for search
    }
}
