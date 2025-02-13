package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class P7_CopyOnWriteArrayList {
    public static void main(String[] args) {
//        List<String> shoppingList = new ArrayList<> ();
//
//        shoppingList.add("MiLK");
//        shoppingList.add("Eggs");
//        shoppingList.add("Bread");
//
//        System.out.println("Initial Shopping List: " + shoppingList);
//
//        for (String item : shoppingList) {
//            System.out.println(item);
//
//            // Try to modify the list while reading:
//            if (item.equals ("Eggs")) {
//                shoppingList.add ("BUtter");   // doesn't work in not - thread-safe collections
//                System.out.println("Added Butter while reading.");
//            }
//            System.out.println("Updated Shopping List: " + shoppingList);
//        }


        List<String> shoppingList2 = new CopyOnWriteArrayList<>();

        shoppingList2.add("MiLK");
        shoppingList2.add("Eggs");
        shoppingList2.add("Bread");

        System.out.println("Initial Shopping List: " + shoppingList2);

        for (String item : shoppingList2) {
            System.out.println(item);

            // Try to modify the list while reading:
            if (item.equals ("Eggs")) {
                shoppingList2.add ("BUtter");   // works in copy on write array lists
                System.out.println("Added Butter while reading.");
            }
            System.out.println("Updated Shopping List: " + shoppingList2);
        }
    }
}
