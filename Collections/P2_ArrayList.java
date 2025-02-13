package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P2_ArrayList {
    public static void main(String[] args) {

        // asList:
        List<String> st = Arrays.asList("abc", "pqr");  // fixed size
        // can't add but surely we can replace
        st.set(1, "xyz");
        System.out.println(st);

        // List.of:
        List<Integer> l1 = List.of(1,2,3,4,5);  // immutable, can't add anything
        System.out.println(l1);

        // but we can do this:
        List<String> al = new ArrayList<>(st);
        // since we can either give capacity or collection in the constructor of ArrayList
        al.add("lkjhgf");

        System.out.println(al);

        // add all:
        List<String> randomChars = List.of("nhjn", "uhcxgv", "jehuce");
        al.addAll(randomChars);
        System.out.println(al);

        // remove 1st occurrence of ele:
        al.remove(String.valueOf("xyz"));
        System.out.println(al);

        // convert arrayList to array of objects:
        // might require typecasting to use properly
        Object[] array = al.toArray();
//        for(Object obj: array){
//            System.out.print(obj + ", ");
//        }
        System.out.println();

        // this better:
        String[] newArr = al.toArray(new String[0]);
//        for (String s : newArr){
//            System.out.print(s + ", ");
//        }

        // sort:
//        Collections.sort(al);
        // or:
        al.sort(null);  // null = comparator
        System.out.println(al);
    }
}
