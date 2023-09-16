package concepts.collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(); // Fail Fast
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");

        // Inside this loop we are modifying the list while iterating so this will throw
        // ConcurrentModificationException
        for (String s : list) {
            System.out.println(s);
            list.add("c");
        }

    }
}
