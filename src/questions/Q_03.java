import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Q 1. Will this code work or not?
    Q 2. Write same code in java 8.
 */
public class Q_03 {

    public static void main(String[] args) {

        List<String> frutiList = Arrays.asList("banana", "apple", "orange");

        List<String> listedFruit = new ArrayList<>(frutiList);

        // ConcurrentModificationException
        for (String fruit : listedFruit) {
            if(listedFruit.contains("p")) {
                listedFruit.remove(fruit);
            }
        }

        System.out.println(Arrays.toString(listedFruit.toArray()));

    }
}
